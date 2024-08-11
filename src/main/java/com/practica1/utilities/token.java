package com.practica1.utilities;

import com.practica1.emuns.tokens;

public class token {
    private tokens token ;
    private String lexeme;
    private String ER;
    private int positionX;
    private int positionY;

    public token(tokens token, String lexeme, int posX, int posY, String ER ){
        this.token = token;
        this.lexeme = lexeme;
        this.positionX = posX;
        this.positionY = posY;
        this.ER = ER;
    }

    public tokens getToken() {
        return token;
    }

    public void setToken(tokens token) {
        this.token = token;
    }

    public String getLexeme() {
        return lexeme;
    }

    public void setLexeme(String lexeme) {
        this.lexeme = lexeme;
    }

    public String getER() {
        return ER;
    }

    public void setER(String ER) {
        this.ER = ER;
    }

    public int getPositionX() {
        return positionX;
    }

    public void setPositionX(int positionX) {
        this.positionX = positionX;
    }

    public int getPositionY() {
        return positionY;
    }

    public void setPositionY(int positionY) {
        this.positionY = positionY;
    }
}
