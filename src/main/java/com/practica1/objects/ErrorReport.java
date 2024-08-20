package com.practica1.objects;

import com.practica1.emuns.token.ErrorType;
public class ErrorReport {
    private String lexem;
    private int line;
    private int column;
    private ErrorType type;
    private String description;

    public ErrorReport(ErrorType type, int line, int column, String lexem, String description) {
        this.type = type;
        this.line = line;
        this.column = column;
        this.lexem = lexem;
        this.description = description;

    }

    public String getLexem() {
        return lexem;
    }

    public void setLexem(String lexem) {
        this.lexem = lexem;
    }

    public int getLine() {
        return line;
    }

    public void setLine(int line) {
        this.line = line;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    public ErrorType getType() {
        return type;
    }

    public void setType(ErrorType type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
