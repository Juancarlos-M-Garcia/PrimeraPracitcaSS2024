package com.practica1.utilities;

import com.practica1.emuns.token.*;
import com.practica1.objects.ErrorReport;
import com.practica1.objects.ObjectReport;
import com.practica1.objects.OperationsReport;

import java.util.*;

public class ReportData {
    private static ArrayList<ObjectReport> figures = new ArrayList<ObjectReport>();
    private static ArrayList<ObjectReport> colors = new ArrayList<ObjectReport>();
    private static ArrayList<ObjectReport> animations = new ArrayList<ObjectReport>();
    private static ArrayList<OperationsReport> operations = new ArrayList<OperationsReport>();
    private static ArrayList<ErrorReport> errores = new ArrayList<ErrorReport>();


    public ReportData() {
        figures = new ArrayList<ObjectReport>();
        animations = new ArrayList<ObjectReport>();
        colors = new ArrayList<ObjectReport>();
        operations = new ArrayList<OperationsReport>();
        errores = new ArrayList<ErrorReport>();
        GenerarListaColores();
        GenerarListaAnimaciones();
        GenerarListaFiguras();
    }

    public void GenerarListaFiguras() {

        figures.add(new ObjectReport(Figures.CIRCULO.toString(), 0));
        figures.add(new ObjectReport(Figures.CUADRADO.toString(), 0));
        figures.add(new ObjectReport(Figures.RECTANGULO.toString(), 0));
        figures.add(new ObjectReport(Figures.POLIGONO.toString(), 0));
        figures.add(new ObjectReport(Figures.LINEA.toString(), 0));
    }

    public void GenerarListaColores() {
        colors.add(new ObjectReport(Colors.BLUE.toString(), 0));
        colors.add(new ObjectReport(Colors.BLACK.toString(), 0));
        colors.add(new ObjectReport(Colors.BROWN.toString(), 0));
        colors.add(new ObjectReport(Colors.PINK.toString(), 0));
        colors.add(new ObjectReport(Colors.PURPLE.toString(), 0));
        colors.add(new ObjectReport(Colors.YELLOW.toString(), 0));
        colors.add(new ObjectReport(Colors.GREEN.toString(), 0));
        colors.add(new ObjectReport(Colors.WHITE.toString(), 0));
        colors.add(new ObjectReport(Colors.RED.toString(), 0));
    }

    public void GenerarListaAnimaciones() {
        animations.add(new ObjectReport(Animations.LINE.toString(), 0));
        animations.add(new ObjectReport(Animations.CURVE.toString(), 0));
    }

    public static void addFigure(Figures figure) {
        ObjectReport dataRep;
        dataRep = buscarPorNombre(figures, figure.toString());
        dataRep.setCantidad(dataRep.getCantidad() + 1);
    }

    public static ObjectReport buscarPorNombre(ArrayList<ObjectReport> lista, String nombre) {
        for (ObjectReport obj : lista) {
            if (obj.getName().equals(nombre)) {
                return obj; // Retorna el objeto si el nombre coincide
            }
        }
        return null; // Retorna null si no se encuentra el objeto
    }

    public static void addColor(Colors color) {
        ObjectReport dataRep;
        dataRep = buscarPorNombre(colors, color.toString());
        dataRep.setCantidad(dataRep.getCantidad() + 1);
    }
// posible mejora pero aun no se ha probado asi que por eso mejor se queda comentado.
//    public static  void addToReport(Enum type){
//        ObjectReport dataRep;
//        if(type instanceof Colors){
//            dataRep = dataRep = buscarPorNombre(colors, type.toString());
//            dataRep.setCantidad(dataRep.getCantidad() + 1);
//        }else if(type instanceof Figures){
//            dataRep = buscarPorNombre(figures, type.toString());
//            dataRep.setCantidad(dataRep.getCantidad() + 1);
//        }else  if(type instanceof Animations){
//            dataRep = buscarPorNombre(animetions, type.toString());
//            dataRep.setCantidad(dataRep.getCantidad() + 1);
//        }
//
//    }

    public static void addAnimation(Animations anima) {
        ObjectReport dataRep;
        dataRep = buscarPorNombre(animations, anima.toString());
        dataRep.setCantidad(dataRep.getCantidad() + 1);
    }

    public static void addOperation(Actions action, int line, int column, String op) {
        operations.add(new OperationsReport(action, line, column, op));
    }

    public static void addError(ErrorType error, int line, int column, String op, String des){
        errores.add(new ErrorReport(error, line, column, op, des));
    }

    public static Object[][] dataForTableReport(int x) {
        switch (x) {
            case 1:
                return createTableData(figures);
            case 2:
                return createTableData(colors);
            case 3:
                return createTableData(animations);
            case 4:
                return createTableDataOP(operations);
            case 5:
                return createTableDataErrors(errores);
            default:
                return new Object[][]{{"", ""}};
        }
    }

    private static Object[][] createTableData(ArrayList<ObjectReport> items) {
        int cantidadColumnas = items.get(0).getClass().getDeclaredFields().length;
        Object[][] forTable = new Object[items.size()][cantidadColumnas];
        for (int i = 0; i < items.size(); i++) {
            for (int j = 0; j < cantidadColumnas; j++) {
                if (j == 1) {
                    forTable[i][j] = items.get(i).getCantidad();
                }
                else {
                    forTable[i][j] = items.get(i).getName();
                }
            }
        }
        return forTable;
    }

    private static Object[][] createTableDataOP(ArrayList<OperationsReport> items) {
        int cantidadColumnas = items.get(0).getClass().getDeclaredFields().length;
        Object[][] forTable = new Object[items.size()][cantidadColumnas];
        for (int i = 0; i < items.size(); i++) {
            for (int j = 0; j < cantidadColumnas; j++) {
                if (j == 0) {
                    forTable[i][j] = items.get(i).getName();
                }else if(j == 1){
                    forTable[i][j] = items.get(i).getLine();
                }else if(j == 2){
                    forTable[i][j] = items.get(i).getColumn();
                }else {
                    forTable[i][j] = items.get(i).getLex();
                }
            }
        }
        return forTable;
    }

    private static Object[][] createTableDataErrors(ArrayList<ErrorReport> items) {
        int cantidadColumnas = items.get(0).getClass().getDeclaredFields().length;
        Object[][] forTable = new Object[items.size()][cantidadColumnas];
        for (int i = 0; i < items.size(); i++) {
            for (int j = 0; j < cantidadColumnas; j++) {
                if (j == 0) {
                    forTable[i][j] = items.get(i).getLexem();
                }else if(j == 1){
                    forTable[i][j] = items.get(i).getLine();
                }else if(j == 2){
                    forTable[i][j] = items.get(i).getColumn();
                }else if(j == 3){
                    forTable[i][j] = items.get(i).getType().toString();
                }else {
                    forTable[i][j] = items.get(i).getDescription();
                }
            }
        }
        return forTable;
    }

    public static ArrayList<ObjectReport> getFigures() {
        return figures;
    }

    public static ArrayList<ObjectReport> getColors() {
        return colors;
    }

    public static ArrayList<ObjectReport> getAnimations() {
        return animations;
    }

    public static ArrayList<OperationsReport> getOperations() {
        return operations;
    }

    public static ArrayList<ErrorReport> getErrores() {
        return errores;
    }

}


