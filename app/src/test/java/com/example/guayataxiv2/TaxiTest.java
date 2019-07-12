package com.example.guayataxiv2;

import org.junit.Test;

import guayataxi.Taxi;

import static org.junit.Assert.assertEquals;

public class TaxiTest {

    @Test
    public void colorImposible(){
        Taxi taxi = new Taxi("GQL502", "Toyota", 3);
        String colorImposible = taxi.setColor("Turquesa");
        assertEquals(colorImposible,"Debe seleccionar un color dentor de la lista posibles");
    }

    @Test
    public void colorPosible(){
        Taxi taxi = new Taxi("GQL502", "Toyota", 5);
        String colorPosible = taxi.setColor("Amarillo");
        assertEquals(colorPosible, "Al taxi se le asigno el color: Amarillo");
    }


}