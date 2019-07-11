package com.example.guayataxiv2;
import org.junit.Test;

import guayataxi.Taxi;

import static org.junit.Assert.*;

public class TaxiTest {
    @Test
    public void ValidarColorNoValidoTaxi(){
        String placa = "HAS1289";
        String marca = "Ford";
        int idTaxi = 12;
        Taxi taxi = new Taxi(placa,marca,idTaxi);
        String color = "rojo";
        assertEquals("Debe seleccionar un color dentor de la lista posibles", taxi.setColor((color)));
    }

    @Test
    public void ValidarColorValidoTaxi(){
        String placa = "HAS1289";
        String marca = "Ford";
        int idTaxi = 12;
        Taxi taxi = new Taxi(placa,marca,idTaxi);
        String color = "Rojo";
        assertEquals("Al taxi se le asigno el color: Rojo", taxi.setColor((color)));
    }
}
