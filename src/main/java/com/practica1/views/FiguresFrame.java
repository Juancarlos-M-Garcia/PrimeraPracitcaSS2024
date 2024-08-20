package com.practica1.views;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.practica1.utilities.Analisis;
import com.practica1.utilities.DrawFigures;
import com.practica1.utilities.ToImagePNG;


public class FiguresFrame extends JFrame{

    private JPanel contentPanel;
    private CardLayout cardLayout;
    private final DrawFigures dr;

    public FiguresFrame() {
        dr = new DrawFigures(Analisis.getAnalizadorSintac());
        this. setTitle("Graficas");
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setSize(600, 400);
        this.setLayout(new BorderLayout());
        fillContent();
        this.setLocationRelativeTo(null);
    }

    public void fillContent(){
        // Crear el JTextArea
        FiguresPanel panel= new FiguresPanel();
        JScrollPane scrollPane = panel.fillFigures(DrawFigures.getGraficos());
        this.add(scrollPane, BorderLayout.CENTER);


        JPanel buttonPanel = new JPanel();
        JButton button1 = new JButton("Reportes");
        JButton button2 = new JButton("Animar");
        JButton button3 = new JButton("Exportar PNG");


        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Report r = new Report();
                r.setVisible(true);
            }
        });

        button3.addActionListener(e->
            ToImagePNG.exportPanelToPNG(panel,this)
        );



        buttonPanel.add(button1);
        buttonPanel.add(button2);
        buttonPanel.add(button3);

        this.add(buttonPanel, BorderLayout.SOUTH);
    }

}
