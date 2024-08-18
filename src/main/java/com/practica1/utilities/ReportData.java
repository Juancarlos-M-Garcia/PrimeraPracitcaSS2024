package com.practica1.utilities;

import com.practica1.emuns.token.*;
import com.practica1.objects.errorReport;
import com.practica1.objects.ObjectReport;
import com.practica1.objects.OperationsReport;

import java.util.*;

public class ReportData {
    private static ArrayList<ObjectReport> figures = new ArrayList<ObjectReport>();
    private static ArrayList<ObjectReport> colors = new ArrayList<ObjectReport>();
    private static ArrayList<ObjectReport> animetions= new ArrayList<ObjectReport>();
    private static ArrayList<OperationsReport> operations = new ArrayList<OperationsReport>();
    private static ArrayList<errorReport> errores= new ArrayList<errorReport>();


    public ReportData() {
        GenerarListaColores();
        GenerarListaAnimaciones();
        GenerarListaFiguras();
    }

    public void GenerarListaFiguras(){
        figures.add(new ObjectReport("Circulo", 0));
        figures.add(new ObjectReport("Cuadrado", 0));
        figures.add(new ObjectReport("Rectangulo", 0));
        figures.add(new ObjectReport("Poligono", 0));
        figures.add(new ObjectReport("Linea", 0));
    }

    public void GenerarListaColores(){
        colors.add(new ObjectReport("Azul", 0));
        colors.add(new ObjectReport("Blanco", 0));
        colors.add(new ObjectReport("Negro", 0));
        colors.add(new ObjectReport("Rojo", 0));
        colors.add(new ObjectReport("Amarillo", 0));
        colors.add(new ObjectReport("Rosa", 0));
        colors.add(new ObjectReport("Morado", 0));
        colors.add(new ObjectReport("Café", 0));
        colors.add(new ObjectReport("Verde", 0));
    }

    public void GenerarListaAnimaciones(){
        animetions.add(new ObjectReport("Lineal", 0));
        animetions.add(new ObjectReport("Curva", 0));
    }

    public static void addFigure(Figures figure){
        ObjectReport dataRep;
        switch (figure){
            case CIRCULO:
                dataRep = (ObjectReport) figures.stream().filter(fig -> fig.getName().equals("Circulo"));
                dataRep.setCantidad(dataRep.getCantidad()+1);
                break;
            case LINEA:
                dataRep = (ObjectReport) figures.stream().filter(fig -> fig.getName().equals("Linea"));
                dataRep.setCantidad(dataRep.getCantidad()+1);
                break;
            case CUADRADO:
                dataRep = (ObjectReport) figures.stream().filter(fig -> fig.getName().equals("Cuadrado"));
                dataRep.setCantidad(dataRep.getCantidad()+1);
                break;
            case RECTANGULO:
                dataRep = (ObjectReport) figures.stream().filter(fig -> fig.getName().equals("Rectangulo"));
                dataRep.setCantidad(dataRep.getCantidad()+1);
                break;
            case POLIGONO:
                dataRep = (ObjectReport) figures.stream().filter(fig -> fig.getName().equals("Poligono"));
                dataRep.setCantidad(dataRep.getCantidad()+1);
                break;
        }

    }

    public static void addColor(Colors color){
        ObjectReport dataRep;
        switch (color) {
            case BLUE:
                dataRep = (ObjectReport) colors.stream().filter(fig -> fig.getName().equals("Azul"));
                dataRep.setCantidad(dataRep.getCantidad() + 1);
                break;
            case RED:
                dataRep = (ObjectReport) colors.stream().filter(fig -> fig.getName().equals("Rojo"));
                dataRep.setCantidad(dataRep.getCantidad() + 1);
                break;
            case YELLOW:
                dataRep = (ObjectReport) colors.stream().filter(fig -> fig.getName().equals("Amarillo"));
                dataRep.setCantidad(dataRep.getCantidad() + 1);
                break;
            case GREEN:
                dataRep = (ObjectReport) colors.stream().filter(fig -> fig.getName().equals("Verde"));
                dataRep.setCantidad(dataRep.getCantidad() + 1);
                break;

            case BLACK:
                dataRep = (ObjectReport) colors.stream().filter(fig -> fig.getName().equals("Negro"));
                dataRep.setCantidad(dataRep.getCantidad() + 1);
                break;
            case WHITE:
                dataRep = (ObjectReport) colors.stream().filter(fig -> fig.getName().equals("Blanco"));
                dataRep.setCantidad(dataRep.getCantidad() + 1);
                break;
            case BROWN:
                dataRep = (ObjectReport) colors.stream().filter(fig -> fig.getName().equals("Café"));
                dataRep.setCantidad(dataRep.getCantidad() + 1);
                break;
            case PURPLE:
                dataRep = (ObjectReport) colors.stream().filter(fig -> fig.getName().equals("Morado"));
                dataRep.setCantidad(dataRep.getCantidad() + 1);
                break;
            case PINK:
                dataRep = (ObjectReport) colors.stream().filter(fig -> fig.getName().equals("Rosa"));
                dataRep.setCantidad(dataRep.getCantidad() + 1);
                break;
        }
    }

    public static void addAnimation(Animations anima) {
        ObjectReport dataRep;
        switch (anima){
            case CURVE:
                dataRep = (ObjectReport) animetions.stream().filter(fig -> fig.getName().equals("Curva"));
                dataRep.setCantidad(dataRep.getCantidad()+1);
                break;
            case LINE:
                dataRep = (ObjectReport) animetions.stream().filter(fig -> fig.getName().equals("Linea"));
                dataRep.setCantidad(dataRep.getCantidad()+1);
                break;
        }
    }

    public static void addOperation(Actions action, int line, int column, String op ){
        operations.add(new OperationsReport(action, line, column, op));
    }

    public static ArrayList<ObjectReport> getFigures() {
        return figures;
    }

    public static ArrayList<ObjectReport> getColors() {
        return colors;
    }

    public static ArrayList<ObjectReport> getAnimetions() {
        return animetions;
    }

    public static ArrayList<OperationsReport> getOperations() {
        return operations;
    }

    public static ArrayList<errorReport> getErrores() {
        return errores;
    }



}


