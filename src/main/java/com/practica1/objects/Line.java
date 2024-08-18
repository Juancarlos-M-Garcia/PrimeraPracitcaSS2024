package com.practica1.objects;

import com.practica1.emuns.token.Colors;
import com.practica1.emuns.token.Figures;
import com.practica1.utilities.ReportData;


public class Line extends Figure {
    private double posx1;
    private double posy1;
    private double posx2;
    private double posy2;

    public Line(String name,  double posx, double posy, double posx1, double posy1, Colors color) {
        super(name, posx, posy, posx, color);
        this.posx1 = posx;
        this.posy1 = posy;
        this.posx2 = posx1;
        this.posy2 = posy1;
        ReportData.addFigure(Figures.LINEA);
    }

    public double getPosx1() {
        return posx1;
    }

    public void setPosx1(double posx1) {
        this.posx1 = posx1;
    }

    public double getPosx2() {
        return posx2;
    }

    public void setPosx2(double posx2) {
        this.posx2 = posx2;
    }

    public double getPosy1() {
        return posy1;
    }

    public void setPosy1(double posy1) {
        this.posy1 = posy1;
    }

    public double getPosy2() {
        return posy2;
    }

    public void setPosy2(double posy2) {
        this.posy2 = posy2;
    }
}
