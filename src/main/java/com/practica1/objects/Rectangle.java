package com.practica1.objects;

import com.practica1.emuns.token.Colors;
import com.practica1.emuns.token.Figures;
import com.practica1.utilities.ReportData;

public class Rectangle extends Figure {
    private double width;
    private double height;

    public Rectangle(String name, double height, double width, double posx, double posy, Colors color) {
        super(name, width, posx, posy, color);
        this.width  = width;
        this.height = height;
        ReportData.addFigure(Figures.RECTANGULO);
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
