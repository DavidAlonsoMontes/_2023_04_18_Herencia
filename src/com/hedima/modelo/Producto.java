package com.hedima.modelo;

public class Producto {

    private String nombre;
    private int cantidad;
    private double pvp;

    public Producto()
    {}
    public Producto(String nombre, int cantidad, double pvp){
        this.nombre=nombre;
        this.cantidad=cantidad;
        this.pvp=pvp;
    }

    @Override
    public String toString() {
        //return super.toString();
        return("Nombre producto: "+nombre+" \nCantidad: "+cantidad+" \nPVP: "+pvp);
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
