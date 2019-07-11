package com.example.guayataxi;

import java.util.Arrays;
import java.util.List;

public class Taxi {

    private String placa;
    private String marca;
    private String color;
    private int taxiId;

    public Taxi(String placa, String marca, int taxiId) {
        this.placa = placa;
        this.marca = marca;
        this.taxiId = taxiId;
    }

    public String setColor(String nuevoColor){
        String mensaje = "";

        List<String> coloresPosibles = Arrays.asList("Rojo", "Amarillo", "Verde");
        if(coloresPosibles.contains(nuevoColor)){
            this.color = nuevoColor;
            mensaje = "Al taxi se le asigno el color: " + nuevoColor;
        } else {
            mensaje = "Debe seleccionar un color dentor de la lista posibles";
            this.color = null;
        }

        return mensaje;

    }

}
