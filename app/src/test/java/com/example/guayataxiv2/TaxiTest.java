package com.example.guayataxiv2;

import org.junit.Test;

import guayataxi.Taxi;

import static org.junit.Assert.assertEquals;

public class TaxiTest {

    @Test
    public void colorOk(){
        Taxi taxi = new Taxi("GYA1223", "Mazda", 1);
        String colorOK = taxi.setColor("Rojo");
        assertEquals(colorOK, "Al taxi se le asigno el color: Rojo");
    }

    @Test
    public void colorError(){
        Taxi taxi = new Taxi("GYA1223", "Mazda", 1);
        String colorOK = taxi.setColor("aaaaa");
        assertEquals(colorOK,"Debe seleccionar un color dentor de la lista posibles");
    }
}
