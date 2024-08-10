package com.practica1.views;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;



public class WelcomeView {
    private JFrame WelcomeFrame;

    public WelcomeView(){
        WelcomeFrame = new JFrame("Welcome");
        WelcomeFrame.setSize(500,500);
        WelcomeFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        WelcomeFrame.setLocationRelativeTo(null);
        this.createPanel();

    }

    private void createPanel( ) {
        JPanel panel = new JPanel();
        panel.setLayout(null);

        JLabel welcomeLabel = new JLabel("Bienvenido");
        welcomeLabel.setBackground(Color.GREEN);
        welcomeLabel.setBounds(210, 200, 120, 30);
        panel.add(welcomeLabel);

        CreateNextButton(panel);

        this.WelcomeFrame.add(panel);
    }

    private void CreateNextButton(JPanel panel){
        JButton startButton = new JButton("Iniciar");
        startButton.setBounds(190, 350, 120, 30);
        startButton.setBackground(Color.blue);
        panel.add(startButton);

        startButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Cerrar el primer JFrame
                WelcomeFrame.dispose();

                // Crear y mostrar el segundo JFrame
                PrincipalView frame2 = new PrincipalView();
                frame2.show();
            }
        });

        //nextButton.addActionListener();
    }

    public void show(){
        WelcomeFrame.setVisible(true);
    }


}
