package com.practica1.views;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.practica1.objects.Circle;
import com.practica1.objects.Figure;
import com.practica1.objects.Graficar;
import com.practica1.utilities.Analisis;
import com.practica1.utilities.DrawFigures;


public class FiguresFrame extends JFrame{

    private JPanel contentPanel;
    private CardLayout cardLayout;
    private DrawFigures dr;

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
        panel.fillFigures(this.dr.getGraficos());
        JScrollPane scrollPane = new JScrollPane(panel);
        this.add(scrollPane, BorderLayout.CENTER);


        JPanel buttonPanel = new JPanel();
        JButton button1 = new JButton("Reportes");
        JButton button2 = new JButton("Animar");


        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Report r = new Report();
                r.setVisible(true);
            }
        });



        buttonPanel.add(button1);
        buttonPanel.add(button2);


        this.add(buttonPanel, BorderLayout.SOUTH);
    }

}
