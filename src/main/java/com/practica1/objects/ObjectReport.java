package com.practica1.objects;

public class ObjectReport {
    private String  name;
    private  int cantidad;

    public ObjectReport(String name, int cantidad) {
        this.name = name;
        this.cantidad = cantidad;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
}
