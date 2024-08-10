package com.practica1.views;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JLabel;


public class WelcomeView {
    private JFrame WelcomeFrame;

    public WelcomeView(){
        WelcomeFrame = new JFrame("Welcome");
        WelcomeFrame.setSize(400,400);
        WelcomeFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.createPanel();

    }

    private void createPanel( ) {
        JPanel panel = new JPanel();

        JLabel welcomeLabel = new JLabel("Welcome");
        panel.add(welcomeLabel);

        CreateNextButton(panel);

        this.WelcomeFrame.add(panel);
    }

    private void CreateNextButton(JPanel panel){
        JButton nextButton = new JButton("Siguiente");

        panel.add(nextButton);

        //nextButton.addActionListener();
    }

    public void show(){
        WelcomeFrame.setVisible(true);
    }


}
