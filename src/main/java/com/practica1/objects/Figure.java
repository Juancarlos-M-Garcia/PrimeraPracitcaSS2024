package com.practica1.objects;

import com.practica1.emuns.token.Colors;
import com.practica1.utilities.ReportData;

public class Figure {
    private String name;
    private double side;
    private double posx;
    private double posy;

    private Colors color;


    public Figure(String name, double side, double posx, double posy, Colors color) {
        this.name = name;
        this.side = side;
        this.posx = posx;
        this.posy = posy;
        this.color = color;
        ReportData.addColor(color);

    }



    public Colors getColor() {
        return color;
    }

    public void setColor(Colors color) {
        this.color = color;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
