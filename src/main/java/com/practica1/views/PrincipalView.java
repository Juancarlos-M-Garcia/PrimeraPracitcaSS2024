package com.practica1.views;

import javax.swing.*;

public class PrincipalView {
    private JFrame PrincipalFrame;

    public PrincipalView(){
        PrincipalFrame = new JFrame();

        PrincipalFrame.setSize(300, 200);
        PrincipalFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        PrincipalFrame.setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        generateInput(panel);

        PrincipalFrame.add(panel);


    }

    private void generateInput(JPanel panel){
        JTextArea textArea = new JTextArea();

        panel.add(textArea);

    }

    public void show () {
        PrincipalFrame.setVisible(true);
    }

}
