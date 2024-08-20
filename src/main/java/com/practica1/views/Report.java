package com.practica1.views;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import com.practica1.utilities.ReportData;


public class Report extends JFrame{

        private JPanel contentPanel;
        private CardLayout cardLayout;

        public Report() {
            if(ReportData.getErrores().isEmpty()){
                contruccionSinErrores();
            }else{
                contrccionErrores();
            }

            this.setLocationRelativeTo(null);
        }

        public void contruccionSinErrores(){
            setTitle("Reportes");
            setSize(600, 400);
            setLayout(new BorderLayout());

            // Crear el panel con CardLayout para cambiar entre tablas
            cardLayout = new CardLayout();
            contentPanel = new JPanel(cardLayout);

            // Crear las tablas y añadirlas al panel
            contentPanel.add(createTablePanel("Reporte de figuras procesadas", new String[]{"Figura", "Cantidad de uso"}, ReportData.dataForTableReport(1)), "Table 1");
            contentPanel.add(createTablePanel("Reporte de colores", new String[]{"Color", "Cantidad de veces usado"}, ReportData.dataForTableReport(2)), "Table 2");
            contentPanel.add(createTablePanel("Reporte de animaciones", new String[]{"Tipo de animacion", "cantidad de veces que aparece"}, ReportData.dataForTableReport(3)), "Table 3");
            contentPanel.add(createTablePanel("Reporte de operaciones", new String[]{"Operador", "Fila","Columna","Ocurrencia"}, ReportData.dataForTableReport(4)), "Table 4");

            // Crear botones para cambiar entre tablas
            JPanel buttonPanel = new JPanel();
            JButton button1 = new JButton("Figuras");
            JButton button2 = new JButton("Colores");
            JButton button3 = new JButton("Animaciones");
            JButton button4 = new JButton("Operaciones");

            button1.addActionListener(new ButtonClickListener("Table 1"));
            button2.addActionListener(new ButtonClickListener("Table 2"));
            button3.addActionListener(new ButtonClickListener("Table 3"));
            button4.addActionListener(new ButtonClickListener("Table 4"));

            buttonPanel.add(button1);
            buttonPanel.add(button2);
            buttonPanel.add(button3);
            buttonPanel.add(button4);

            add(buttonPanel, BorderLayout.NORTH);
            add(contentPanel, BorderLayout.CENTER);
        }

        public void contrccionErrores(){
            setTitle("Reporte de Errores");
            setSize(600, 400);
            setLayout(new BorderLayout());

            // Crear el panel con CardLayout para cambiar entre tablas
            cardLayout = new CardLayout();
            contentPanel = new JPanel(cardLayout);

            // Crear las tablas y añadirlas al panel
            contentPanel.add(createTablePanel("Tabla de errores", new String[]{"Lexema", "Fila", "Columna","Tipo", "Descripcion"}, ReportData.dataForTableReport(5)), "Table 1");

            add(contentPanel, BorderLayout.CENTER);
        }



        private JPanel createTablePanel(String title, String[] columnNames, Object[][] data) {
            JPanel panel = new JPanel(new BorderLayout());
            JTable table = new JTable(data, columnNames);
            JScrollPane scrollPane = new JScrollPane(table);
            panel.add(scrollPane, BorderLayout.CENTER);
            panel.setBorder(BorderFactory.createTitledBorder(title));
            return panel;
        }

        private class ButtonClickListener implements ActionListener {
            private String cardName;

            public ButtonClickListener(String cardName) {
                this.cardName = cardName;
            }

            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(contentPanel, cardName);
            }
        }

}
