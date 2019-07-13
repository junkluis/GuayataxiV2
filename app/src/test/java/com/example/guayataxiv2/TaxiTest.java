package com.example.guayataxiv2;

import org.junit.Before;
import org.junit.Test;
import guayataxi.Taxi;

public class TaxiTest {

    Taxi taxiPrueba, taxiNull = null;

    @Before
    public void iniciarPruebas() {
        taxiPrueba = new Taxi("GGG 1234", "Toyota", 1);
    }

    @Test
    public void setColorExistenteTaxiPrueba() {
        taxiPrueba.setColor("Amarillo");
    }

    @Test
    public void setColorNoExistenteTaxiPrueba() {
        taxiPrueba.setColor("Blanco");
    }

    @Test
    public void setColorExistenteTaxiNull() {
        taxiNull.setColor("Amarillo");
    }

    @Test
    public void setColorNoExistenteTaxiNull() {
        taxiNull.setColor("Blanco");
    }

}
