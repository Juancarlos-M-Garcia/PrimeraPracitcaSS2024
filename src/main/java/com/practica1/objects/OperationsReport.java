package com.practica1.objects;

import com.practica1.emuns.token.Actions;

public class OperationsReport {
    private String name;
    private int line;
    private int column;
    private String lex;

    public OperationsReport(Actions action, int line, int column, String lex) {
        this.name = action.toString();
        this.line = line;
        this.column = column;
        this.lex = lex;
    }

    public OperationsReport(Actions action, String lex) {
        this.name = action.toString();
        this.lex = lex;
    }

    public String DefinirNombre(Actions action){
        return switch (action) {
            case ADD -> "Suma";
            case LESS -> "Resta";
            case MULTI -> "Multiplicación";
            case DIV -> "Division";
        };

    }

    public String getName() {
        return name ;
    }

    public int getLine() {
        return line;
    }

    public int getColumn() {
        return column;
    }

    public String getLex() {
        return lex;
    }
}
