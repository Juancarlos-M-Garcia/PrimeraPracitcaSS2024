package com.practica1.utilities;

import com.practica1.emuns.token.Colors;
import com.practica1.objects.Animation;
import com.practica1.objects.Circle;
import com.practica1.objects.Figure;
import com.practica1.objects.Graficar;
//import com.practica1.views.figures.CircleShape;

import java.awt.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.awt.color.*;

public class DrawFigures {

    private static ArrayList<Graficar> conAnimacion = new ArrayList<>();
    private static ArrayList<Graficar> graficos = new ArrayList<>();
    private ArrayList<Object> PorGraficar;

    public DrawFigures(ArrayList<Object> porGraficar){
        reset();
        this.PorGraficar = porGraficar;
        orderDataXGraphs(porGraficar);
        odernarAnimacion();
    }

    public static void orderDataXGraphs( ArrayList<Object> analizadorSintac){
        Graficar gr = null;
        for (Object o: analizadorSintac ){
            if(o instanceof Figure){
                if(gr != null){
                    graficos.add(gr);
                }
                gr = new Graficar((Figure) o);
            }else if( o instanceof Animation){
                if(gr != null ){
                    gr.setAnim((Animation) o);
                    graficos.add(gr);
                    conAnimacion.add(gr);
                    gr = null;
                }
            }
        }
        if(gr != null){
            graficos.add(gr);
        }
    }

    public static void odernarAnimacion(){
        Collections.sort(conAnimacion, new Comparator<Graficar>() {
            @Override
            public int compare(Graficar g1, Graficar g2) {
                return Double.compare(g1.getAnim().getOrden(), g2.getAnim().getOrden());
            }
        });
    }

    public static void reset(){
        conAnimacion = new ArrayList<>();
        graficos = new ArrayList<>();
    }

    public ArrayList<Graphics> getGraphics(){
        ArrayList<Graphics> graphs = new ArrayList<>();

        for(Graficar gr : graficos){
            if(gr.getFig() instanceof Circle){

            }
        }


        return graphs;
    };

    public static Color DefineColor(Colors colors){
        switch (colors){
            case RED -> {
                return Color.RED;
            }
            case BLUE -> {
                return Color.BLUE;
            }
            case GREEN -> {
                return Color.GREEN;
            }
            case PINK -> {
                return Color.PINK;
            }
            case BLACK -> {
                return Color.BLACK;
            }
            case WHITE -> {
                return Color.WHITE;
            }
            case YELLOW -> {
                return Color.YELLOW;
            }
            case PURPLE -> {
                return new Color(128,0,128);
            }
            case BROWN -> {
                return new Color(110,69,30);
            }

        }
        return Color.GRAY;
    }

    public ArrayList<Object> getPorGraficar() {
        return PorGraficar;
    }

    public static ArrayList<Graficar> getGraficos() {
        return graficos;
    }

    public static void setGraficos(ArrayList<Graficar> graficos) {
        DrawFigures.graficos = graficos;
    }
}
