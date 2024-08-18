package com.practica1.objects;


import com.practica1.emuns.token.Colors;
import com.practica1.utilities.ReportData;
import com.practica1.emuns.token.Figures;

public class Polygon extends Figure{
    private int sides;
    private double width;
    private double height;

    public Polygon(String name, double width,  double height, int sides, double posx, double posy, Colors color) {
        super(name, width, posx, posy, color);
        this.sides = sides;
        this.width = width;
        this.height = height;
        ReportData.addFigure(Figures.POLIGONO);
    }

    public int getSides() {
        return sides;
    }

    public void setSides(int sides) {
        this.sides = sides;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
