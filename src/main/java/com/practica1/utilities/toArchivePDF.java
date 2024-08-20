package com.practica1.utilities;

import com.itextpdf.text.Document;
import com.itextpdf.text.Image;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.pdf.PdfWriter;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileOutputStream;

public class toArchivePDF {

    public static void exportPanelToPDF(JPanel panel) {
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Guardar PDF");
        fileChooser.setFileFilter(new javax.swing.filechooser.FileFilter() {
            @Override
            public boolean accept(File f) {
                return f.isDirectory() || f.getName().toLowerCase().endsWith(".pdf");
            }

            @Override
            public String getDescription() {
                return "Archivos PDF (*.pdf)";
            }
        });

        int userSelection = fileChooser.showSaveDialog(null);

        if (userSelection == JFileChooser.APPROVE_OPTION) {
            File fileToSave = fileChooser.getSelectedFile();
            String filePath = fileToSave.getAbsolutePath();

            if (!filePath.toLowerCase().endsWith(".pdf")) {
                filePath += ".pdf";
            }

            Document document = new Document(PageSize.A4);
            try {
                PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream(filePath));
                document.open();

                BufferedImage bufferedImage = new BufferedImage(panel.getWidth(), panel.getHeight(), BufferedImage.TYPE_INT_RGB);
                Graphics2D g2d = bufferedImage.createGraphics();
                panel.paint(g2d);
                g2d.dispose();

                float width = document.getPageSize().getWidth() - document.leftMargin() - document.rightMargin();
                float height = document.getPageSize().getHeight() - document.topMargin() - document.bottomMargin();

                Image image = Image.getInstance(bufferedImage, null);

                if (image.getWidth() > width || image.getHeight() > height) {
                    image.scaleToFit(width, height);
                }

                document.add(image);
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                document.close();
            }
        }
    }
}