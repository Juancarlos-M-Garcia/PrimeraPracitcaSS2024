package com.practica1.objects;

import com.practica1.emuns.token.Animations;

public class Animation {
    private  Animations type;
    private double posDestX;
    private double posDestY;
    private double orden;

    public Animation(Animations type, double posDestX, double posDestY, double orden) {
        this.type = type;
        this.posDestX = posDestX;
        this.posDestY = posDestY;
        this.orden = orden;
    }

    public Animations getType() {
        return type;
    }

    public void setType(Animations type) {
        this.type = type;
    }

    public double getPosDestX() {
        return posDestX;
    }

    public void setPosDestX(double posDestX) {
        this.posDestX = posDestX;
    }

    public double getPosDestY() {
        return posDestY;
    }

    public void setPosDestY(double posDestY) {
        this.posDestY = posDestY;
    }

    public double getOrden() {
        return orden;
    }

    public void setOrden(double orden) {
        this.orden = orden;
    }
}
