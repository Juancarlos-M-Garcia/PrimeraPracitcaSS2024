package com.practica1.views;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PrincipalView extends JFrame{


    private JTextArea TextArea;

    public PrincipalView(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setLayout( new BorderLayout( 5, 15));
//        PrincipalFrame = new JFrame();
//
//        PrincipalFrame.setSize(300, 200);
//        PrincipalFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        PrincipalFrame.setLocationRelativeTo(null);
//        PrincipalFrame.setLayout( new BorderLayout());

        JPanel centerPanel = new JPanel(new FlowLayout());
        generateContentCenterPanel(centerPanel);

        JPanel southPanel = new JPanel(new GridLayout(2, 2));
//        southPanel.setMinimumSize();
        JButton ButtonCompilar = new JButton("Compilar");

        southPanel.add(ButtonCompilar);


        this.add(centerPanel, BorderLayout.CENTER);
        this.add(southPanel, BorderLayout.SOUTH);
        this.pack();

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
        JTextArea textArea = new JTextArea();
        textArea.setLayout(new BorderLayout());
        panel.add(textArea);

    }

    private void generateContentSouthPanel(JPanel panel){

    }



}
