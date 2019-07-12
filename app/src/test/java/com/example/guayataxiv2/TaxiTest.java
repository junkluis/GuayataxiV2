package com.example.guayataxiv2;

import org.junit.Test;

import guayataxi.Taxi;

import static org.junit.Assert.assertEquals;

public class TaxiTest {
    @Test
    public void colorError(){
        Taxi taxi = new Taxi("GRA7116", "Mazda", 1);
        String colorOK = taxi.setColor("bdbdf");
        assertEquals(colorOK,"Debe seleccionar un color dentor de la lista posibles");
    }

    @Test
    public void colorOk(){
        Taxi taxi = new Taxi("GRA7116", "Mazda", 1);
        String colorOK = taxi.setColor("Amarillo");
        assertEquals(colorOK, "Al taxi se le asigno el color: Amarillo");
    }


}