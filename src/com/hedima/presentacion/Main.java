package com.hedima.presentacion;

import com.hedima.modelo.Empleado;
import com.hedima.modelo.Gerente;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Empleado emp1=new Empleado("David", 30000, LocalDate.of(1975, 10, 29));

        emp1.mostrarInfo();

        Gerente g1=new Gerente("Antonio",5_000, LocalDate.of(1978,2,23),"Comercial");
        g1.mostrarInfo();
    }

}