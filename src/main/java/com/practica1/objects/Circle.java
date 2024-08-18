package com.practica1.objects;

import com.practica1.emuns.token.Colors;
import com.practica1.emuns.token.Figures;
import com.practica1.utilities.ReportData;

public class Circle extends Figure{
    private double radio;

    public Circle(String name, double radio, double posx, double posy, Colors color) {
        super(name, radio, posx, posy, color);
        this.radio = radio;
        ReportData.addFigure(Figures.CIRCULO);
    }


    public double getRadio() {
        return super.getSide();
    }

    public void setRadio(double radio){
        super.setSide(radio);
    }

}
