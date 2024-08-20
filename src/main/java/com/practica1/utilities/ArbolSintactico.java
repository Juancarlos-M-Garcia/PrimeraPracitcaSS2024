package com.practica1.utilities;

import java.util.ArrayList;

public class ArbolSintactico {
    private  String lex;
    private ArrayList<ArbolSintactico> hijos;

    public ArbolSintactico(String lex) {
        this.lex = lex;
        this.hijos = new ArrayList();
    }

    public void addHijo(ArbolSintactico as){
            this.hijos.add(as);
    }
}
