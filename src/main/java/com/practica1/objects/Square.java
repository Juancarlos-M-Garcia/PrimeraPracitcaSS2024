package com.practica1.objects;

import com.practica1.emuns.token.Colors;
import com.practica1.utilities.ReportData;
import com.practica1.emuns.token.Figures;

public class Square extends Figure {

    public Square(String name, double side, double posx, double posy, Colors color) {
        super(name, side, posx, posy, color);
        ReportData.addFigure(Figures.CUADRADO);
    }

}
