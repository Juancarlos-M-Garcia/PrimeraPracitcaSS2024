package com.practica1.objects;

public class Graficar {
    private Figure fig;
    private Animation anim;

    public Graficar(Figure fig, Animation anim) {
        this.fig = fig;
        this.anim = anim;
    }

    public Graficar(Figure fig) {
        this.fig = fig;
    }

    public Figure getFig() {
        return fig;
    }

    public void setFig(Figure fig) {
        this.fig = fig;
    }

    public Animation getAnim() {
        return anim;
    }

    public void setAnim(Animation anim) {
        this.anim = anim;
    }
}

