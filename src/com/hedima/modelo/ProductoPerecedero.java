package com.hedima.modelo;

import java.time.LocalDate;

public class ProductoPerecedero extends Producto{
    private LocalDate fCaducidad;

    public ProductoPerecedero()
    {
        super();
    }

    public ProductoPerecedero(String nombre, int cantidad, double pvp, LocalDate fCaducidad){
        super(nombre, cantidad, pvp);
        this.fCaducidad=fCaducidad;
    }

    @Override
    public String toString() {
        return super.toString() + "\nProductoPerecedero{" +
                "fCaducidad=" + fCaducidad +
                '}';
    }
}
