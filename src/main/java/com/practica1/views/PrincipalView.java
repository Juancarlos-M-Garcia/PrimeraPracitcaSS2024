package com.practica1.views;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.practica1.objects.Figure;
import com.practica1.utilities.Analisis;
import com.practica1.utilities.DrawFigures;
import java_cup.runtime.*;

import com.practica1.analizador.sym;

import com.practica1.analizador.parser;
import com.practica1.analizador.lexerPractica1;
import com.practica1.utilities.ReportData;

public class PrincipalView{

    JFrame frame;
    private JTextArea textArea;
    public ReportData reports ;
    public PrincipalView() {

        // Crear el JFrame
        frame = new JFrame("Ejemplo de JTextArea");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 300);
        frame.setLayout(new BorderLayout());

        // Crear el JTextArea
        this.textArea = new JTextArea(10, 30);
        JScrollPane scrollPane = new JScrollPane(this.textArea);
        frame.add(scrollPane, BorderLayout.CENTER);

        //Crear panel para botones
        JPanel ButtonPanel = new JPanel();
        ButtonPanel.setLayout( new FlowLayout());

        // Crear el botones
        JButton buttonCompilar = new JButton("Compilar");
        JButton buttonImportar = new JButton("Importar archivo");
        JButton buttonLimpiar = new JButton("Limpiar");
        //se agregan los botones al panel
        ButtonPanel.add(buttonCompilar, BorderLayout.SOUTH);
        ButtonPanel.add(buttonImportar, BorderLayout.SOUTH);
        ButtonPanel.add(buttonLimpiar, BorderLayout.SOUTH);

        //Se agrega el panel al frame
        frame.add(ButtonPanel, BorderLayout.SOUTH);

        // Agregar el ActionListener al primer boton botón
        buttonCompilar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
              AnalizarTexto();
            }
        });

        // Agregar el ActionListener al segundo botón
        buttonImportar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                importarArchivoTxt();
            }
        });

        buttonLimpiar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea.setText("");
            }
        });

        // Centrar el JFrame y hacerlo visible
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }


    public void AnalizarTexto(){
        reports = new ReportData();
        String text = this.textArea.getText();
        if (text.isEmpty()) {
            JOptionPane.showMessageDialog(this.frame.getParent(),
                    "Debes de ingresar una expresion aritmetica...",
                    "ERROR", 2);
        }else{
            DrawFigures.reset();
            Analisis.reset();
            StringReader sr= new StringReader(text);

            lexerPractica1 lex = new lexerPractica1(sr);
            @Deprecated
            parser par = new parser(lex);

            try{
                par.parse();

                if(ReportData.getErrores().isEmpty()){
                    FiguresFrame ff = new FiguresFrame();
                    Runtime rt = Runtime.getRuntime();
                    try {
                        Thread.sleep(5000);
                        //Esperamos medio segundo para dar tiempo a que la imagen se genere
                        rt.exec("nohup display graf1.jpg ");
                        ff.setVisible(true);
                    } catch (IOException ex) {
                        Logger.getLogger(this.getClass().getName()).log(Level.SEVERE, null, ex);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(this.getClass().getName()).log(Level.SEVERE, null, ex);
                    }
                }else{
                    Report r = new Report();
                    r.setVisible(true);
                }
            } catch (Exception e) {
                System.err.println("Error: " +e.getMessage());
                throw new RuntimeException(e);
            }
        }
    }

    public void importarArchivoTxt(){
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Guardar archivo");

        int userSelection = fileChooser.showSaveDialog(null);
        if (userSelection == JFileChooser.APPROVE_OPTION) {
            File fileToOpen = fileChooser.getSelectedFile();

            // Si no tiene extensión, agregar ".txt"
            if (!fileToOpen.getName().endsWith(".txt")) {
                fileToOpen = new File(fileToOpen.getAbsolutePath() + ".txt");
            }

            try (BufferedReader reader = new BufferedReader(new FileReader(fileToOpen))) {
                textArea.setText(""); // Limpiar el JTextArea antes de cargar nuevo contenido
                String line;
                StringBuilder content = new StringBuilder();
                while ((line = reader.readLine()) != null) {
                    content.append(line).append("\n");
                }
                textArea.setText(content.toString());
                JOptionPane.showMessageDialog(null, "Archivo importado con exito");
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(null, "Error al importar el archivo: " + ex.getMessage());
            }
        }
    }
}
