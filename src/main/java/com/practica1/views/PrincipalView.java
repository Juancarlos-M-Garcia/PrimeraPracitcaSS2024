package com.practica1.views;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PrincipalView implements ActionListener{

    JFrame frame;
    private JTextArea TextArea;

    public PrincipalView(){

        // Crear el JFrame
        frame = new JFrame("Ejemplo de JTextArea");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLayout(new BorderLayout());

        // Crear el JTextArea
        JTextArea textArea = new JTextArea(10, 30);
        JScrollPane scrollPane = new JScrollPane(textArea);
        frame.add(scrollPane, BorderLayout.CENTER);

        // Crear el botón
        JButton button = new JButton("Obtener Texto");
        frame.add(button, BorderLayout.SOUTH);

        // Agregar el ActionListener al botón
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text = textArea.getText();


//                JOptionPane.showMessageDialog(frame, "Texto ingresado: " + text);
            }
        });

        // Centrar el JFrame y hacerlo visible
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
//        this.frame = new JFrame();
//        this.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        this.frame.setLocationRelativeTo(null);
////        this.setLayout( new BorderLayout( 5, 15));
//
//        JPanel centerPanel = new JPanel(new BorderLayout());
//        centerPanel.setMinimumSize(new Dimension(100, 200));
//        generateContentCenterPanel(centerPanel);
//
//        JPanel southPanel = new JPanel(new GridLayout(2, 2));
//
//        southPanel.setLayout(new GridLayout(1, 5));
////        southPanel.setMinimumSize();
//        JButton ButtonCompilar = new JButton("Compilar");
//        ButtonCompilar.setSize(20, 40);
//        JButton ButtonImportar = new JButton("Importar");
//        ButtonImportar.setSize(20, 40);
//
////        JButton ButtonCompilar = new JButton("Compilar");
//        GridBagConstraints gbc = new GridBagConstraints();
//
//        gbc.gridx=0;
//        gbc.gridy=1;
//        southPanel.add(ButtonCompilar,gbc);
//        gbc.gridx=0;
//        gbc.gridy=3;
//        southPanel.add(ButtonImportar,gbc);
//
//
//        this.frame.add(centerPanel, BorderLayout.CENTER);
//        this.frame.add(southPanel, BorderLayout.SOUTH);
//        this.frame.pack();

//        PrincipalFrame.add(topPanel, BorderLayout.NORTH);
//        PrincipalFrame.add(centerPanel, BorderLayout.CENTER);
//
//        PrincipalFrame.pack();

//        JPanel panel = new JPanel();
//        panel.setLayout();
//        generateInput(panel);



//        PrincipalFrame.add(panel);


    }

//    private void generateInput(JPanel panel){
//        TextArea = new JTextArea();
////        TextArea.setBounds(5, 5, 100, 100);
////        TextArea.setSize(400, 40);
//
//        panel.add(TextArea);
//
//    }

    private void generateContentCenterPanel(JPanel panel){

        JTextArea textArea = new JTextArea(20, 40);
        textArea.setLayout(new BorderLayout());

        JScrollPane sp = new JScrollPane(textArea);
        sp.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);
        sp.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        panel.add(sp);

    }

    private void generateContentSouthPanel(JPanel panel){

    }

    public void actionPerformed(ActionEvent e){

    }



    }
