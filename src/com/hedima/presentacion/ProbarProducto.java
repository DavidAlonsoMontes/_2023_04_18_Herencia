package com.hedima.presentacion;

import com.hedima.modelo.Producto;
import com.hedima.modelo.ProductoPerecedero;

import java.time.LocalDate;

public class ProbarProducto {
    public static void main(String[] args) {

        Producto p1=new Producto("Manzana", 3,1.23);
        System.out.println(p1.toString());

        ProductoPerecedero pp1=new ProductoPerecedero("Manzana", 3, 1.35, LocalDate.of(2023,4,21));
        System.out.println(pp1.toString());
    }
}
