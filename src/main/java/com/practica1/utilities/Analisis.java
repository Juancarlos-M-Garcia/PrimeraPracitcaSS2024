package com.practica1.utilities;


import com.practica1.emuns.token.*;
import com.practica1.objects.Figure;
import com.practica1.objects.*;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Analisis {
    private static ArrayList<Object> analizadorSintac = new ArrayList<>();
    private static ArrayList<Graficar> conAnimacion = new ArrayList<>();
    private static ArrayList<Graficar> graficos = new ArrayList<>();

    public static Object addObjectToGraph(Object object ){
        analizadorSintac.add(object);
        return object;
    }

    public static void orderDataXGraphs(){
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
    }

    public static void odernarAnimacion(){
        Collections.sort(conAnimacion, new Comparator<Graficar>() {
            @Override
            public int compare(Graficar g1, Graficar g2) {
                return Double.compare(g1.getAnim().getOrden(), g2.getAnim().getOrden());
            }
        });
    }

    public static ArrayList<Object> getAnalizadorSintac() {
        return analizadorSintac;
    }

    public static void setAnalizadorSintac(ArrayList<Object> analizadorSintac) {
        Analisis.analizadorSintac = analizadorSintac;
    }

    public static ArrayList<Graficar> getConAnimacion() {
        return conAnimacion;
    }

    public static void setConAnimacion(ArrayList<Graficar> conAnimacion) {
        Analisis.conAnimacion = conAnimacion;
    }

    public static double operar (Actions act, String exp1, String exp2, String lex){
        try{
            double number1 = Double.parseDouble(exp1);
            double number2 = Double.parseDouble(exp2);
            double resultado = 0 ;
            switch(act){
                case LESS:
                   resultado = number1 - number2;
                    break;
                case ADD:
                    resultado = number1 + number2;
                    break;
                case MULTI:
                    resultado = number1 * number2;
                    break;
                case DIV:
                    resultado = number1 / number2;
                    break;
            }

//            ReportData.addOperation(act, line, column, lex);
            ReportData.addOperation(act, 0, 0, lex);
            return Redondeo(resultado);
        }catch(NumberFormatException e){
            return 0;
        }
    }

    private static double Redondeo(double number){
        BigDecimal bd = new BigDecimal(Double.toString(number));
        bd = bd.setScale(2, RoundingMode.HALF_UP);
        return bd.doubleValue();
    }

    public static Figure CreateFigure (Figures fig, String name ,double posx, double posy, double side, Colors col){
        switch (fig){
            case CIRCULO:
                return new Circle(name, side, posx, posy, col);
            case CUADRADO:
                return new Square(name, side,posx, posy, col);
        }
        return null;
    }

    public static Figure CreateFigure (Figures fig, String name ,double posx, double posy, double width, double height,  Colors col){
        switch (fig){
            case RECTANGULO:
                return new Rectangle(name, width, height, posx, posy, col);
            case LINEA:
                return new Line(name, posx, posy, width, height, col);
        }
        return null;
    }

    public static Figure CreateFigure (String name ,double posx, double posy, int sides, double width, double height,  Colors col){
        return new Polygon(name, width, height, sides, posx, posy, col);
    }

    public static Animation CreateAnimation (Animations anim, double posDesx, double posDesy, double orden){
        return new Animation(anim, posDesx, posDesy, orden);
    }

    public static void reset(){
        conAnimacion = new ArrayList<>();
        graficos = new ArrayList<>();
        analizadorSintac = new ArrayList<>();
    }

}
