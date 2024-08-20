package com.practica1.views;

import com.practica1.emuns.token.Colors;
import com.practica1.objects.*;
import com.practica1.objects.Polygon;
import com.practica1.objects.Rectangle;
import com.practica1.utilities.DrawFigures;
//import com.practica1.objects.Graficar;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FiguresPanel extends JPanel{
    private List<Shape> shapes;

    private interface Shape {
        void draw(Graphics2D g2d);
    }

    private static class CircleShape implements Shape {
        int x, y, radius;
        Color color;

        CircleShape( double x, double y, double radius, Colors color) {
            this.x = (int) Math.round(x);
            this.y = (int) Math.round(y);
            this.radius = (int) Math.round(radius);
            this.color = DrawFigures.DefineColor(color);
            }

        @Override
        public void draw(Graphics2D g2d) {
            g2d.setColor(color);
            g2d.fillOval(x - radius, y - radius, 2 * radius, 2 * radius);
            g2d.setColor(color==Color.BLACK?Color.white:Color.BLACK);
            g2d.drawOval(x - radius, y - radius, 2 * radius, 2 * radius);


        }
    }

    private static class SquareShape implements Shape {
        int x, y, sideLength;
        Color color;

        SquareShape(double x, double y, double sideLength, Colors color) {
            this.x = (int) Math.round(x);
            this.y = (int) Math.round(y);
            this.sideLength = (int) Math.round(sideLength);
            this.color = DrawFigures.DefineColor(color);
        }

        @Override
        public void draw(Graphics2D g2d) {
            g2d.setColor(color);
            g2d.fillRect(x, y, sideLength, sideLength);
            g2d.setColor(color==Color.BLACK?Color.white:Color.BLACK);
            g2d.drawRect(x, y, sideLength, sideLength);

        }
    }

    private static class RectangleShape implements Shape {
        int x, y, width, height;
        Color color;

        RectangleShape(double x, double y, double width, double height, Colors color) {
            this.x = (int) Math.round(x);
            this.y = (int) Math.round(y);
            this.width = (int) Math.round(width);
            this.height = (int) Math.round(height);
            this.color = DrawFigures.DefineColor(color);
        }

        @Override
        public void draw(Graphics2D g2d) {
            g2d.setColor(color);
            g2d.fillRect(x, y, width, height);
            g2d.setColor(color==Color.BLACK?Color.white:Color.BLACK);
            g2d.drawRect(x, y, width, height);
        }
    }

    private static class LineShape implements Shape {
        int x1, y1, x2, y2;
        Color color;

        LineShape(double x1, double y1, double x2, double y2, Colors colors) {
            this.x1 = (int) Math.round(x1);
            this.y1 = (int) Math.round(y1);
            this.x2 = (int) Math.round(x2);
            this.y2 = (int) Math.round(y2);
            this.color =DrawFigures.DefineColor(colors);
        }

        @Override
        public void draw(Graphics2D g2d) {
            g2d.setColor(color);
            g2d.drawLine(x1, y1, x2, y2);

        }
    }

    private static class PolygonShape implements Shape {
        int[] xPoints, yPoints;
        int nPoints;
        Color color;

        PolygonShape(double s, double w, double h, double px, double py, Colors colors) {

            int sides = (int) Math.round(s);
            int width = (int) Math.round(w);
            int height = (int) Math.round(h);
            int[] xP = new int[sides];
            int[] yP = new int[sides];


            int centerX = width / 2;
            int centerY = height / 2;

            int radius = Math.min(width, height) / 2;

            for (int i = 0; i < sides; i++) {
                double angle = 2 * Math.PI * i / sides - Math.PI / 2;
                xP[i] = (int) Math.round(px)+ centerX + (int) (radius * Math.cos(angle));
                yP[i] = (int) Math.round(py)+ centerY + (int) (radius * Math.sin(angle));
            }


            this.xPoints = xP;
            this.yPoints = yP;
            this.nPoints = xP.length;
            this.color = DrawFigures.DefineColor(colors);
        }

        @Override
        public void draw(Graphics2D g2d) {
            g2d.setColor(color);
            g2d.fillPolygon(xPoints, yPoints, nPoints);
            g2d.setColor(color==Color.BLACK?Color.white:Color.BLACK);
            g2d.drawPolygon(xPoints, yPoints, nPoints);
        }
    }

    public FiguresPanel() {
        shapes = new ArrayList<>();
        this.setBackground(Color.DARK_GRAY);
    }

    // Método para agregar una figura al panel
    public void addShape(Shape shape) {
        shapes.add(shape);
        repaint(); // Repaint to update the display
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;

        for (Shape shape : shapes) {
            shape.draw(g2d);
        }
    }

    @Override
    public Dimension getPreferredSize() {
        int maxX = 0;
        int maxY = 0;

        for (Shape shape : shapes) {
            if (shape instanceof CircleShape) {
                CircleShape c = (CircleShape) shape;
                maxX = Math.max(maxX, c.x + c.radius);
                maxY = Math.max(maxY, c.y + c.radius);
            } else if (shape instanceof SquareShape) {
                SquareShape s = (SquareShape) shape;
                maxX = Math.max(maxX, s.x + s.sideLength);
                maxY = Math.max(maxY, s.y + s.sideLength);
            } else if (shape instanceof RectangleShape) {
                RectangleShape r = (RectangleShape) shape;
                maxX = Math.max(maxX, r.x + r.width);
                maxY = Math.max(maxY, r.y + r.height);
            } else if (shape instanceof LineShape) {
                LineShape l = (LineShape) shape;
                maxX = Math.max(maxX, Math.max(l.x1, l.x2));
                maxY = Math.max(maxY, Math.max(l.y1, l.y2));
            } else if (shape instanceof PolygonShape) {
                PolygonShape p = (PolygonShape) shape;
                for (int i = 0; i < p.nPoints; i++) {
                    maxX = Math.max(maxX, p.xPoints[i]);
                    maxY = Math.max(maxY, p.yPoints[i]);
                }
            }
        }
        return new Dimension(maxX + 10, maxY + 10);
    }

    public JScrollPane fillFigures( ArrayList<Graficar> graficas){
        this.shapes = new ArrayList<>();
        for (Graficar gr: graficas){
            Figure f = gr.getFig();
            if(f instanceof Circle){
                Circle c = (Circle) f;
                this.addShape(new CircleShape(c.getPosx(), c.getPosy(), c.getRadio(), c.getColor()));
            }else if(f instanceof Rectangle){
                Rectangle r = (Rectangle) f;
                this.addShape(new RectangleShape(r.getPosx(), r.getPosy(), r.getWidth(), r.getHeight(), r.getColor()));
            }else if(f instanceof Square){
                Square s = (Square) f;
                this.addShape(new SquareShape(s.getPosx(), s.getPosy(), s.getSide() , s.getColor()));
            }else if(f instanceof Line){
                Line l = (Line) f;
                this.addShape( new LineShape(l.getPosx1(), l.getPosy1(), l.getPosx2(), l.getPosy2(), l.getColor()));
            }else if(f instanceof Polygon){
                Polygon p = (Polygon) f;
                this.addShape(new PolygonShape(p.getSides(), p.getWidth(), p.getHeight(), p.getPosx(), p.getPosy(), p.getColor()));
            }
        }
        JScrollPane sp = new JScrollPane(this);
        return sp;
    }




}
