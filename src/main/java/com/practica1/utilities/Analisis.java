package com.practica1.utilities;


import com.practica1.emuns.token.*;
import com.practica1.objects.Figure;
import com.practica1.objects.*;

public class Analisis {


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
//            ReportData.addOperation(act, 0, 0, lex);
            System.out.println("Se realizo la siguiente operacion:"+lex);
            System.out.println("Resultado:"+ resultado);
            return resultado;
        }catch(NumberFormatException e){
            return 0;
        }
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
            case CUADRADO:
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


}
