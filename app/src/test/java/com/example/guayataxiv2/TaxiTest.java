package com.example.guayataxiv2;

import org.junit.Before;
import org.junit.Test;

import guayataxi.Taxi;

import static org.junit.Assert.assertEquals;

public class TaxiTest {

    private Taxi taxiPrueba = null;

    @Before
    public void iniciarPruebas() {
        taxiPrueba = new Taxi("GXY-2981", "NISSAN", 1);
    }

    @Test
    public void setColorValido() {
        String mensaje = taxiPrueba.setColor("Rojo");
        assertEquals("Al taxi se le asigno el color: Rojo", mensaje);
    }

    @Test
    public void setColorNoValido() {
        String mensaje = taxiPrueba.setColor("Azul");
        assertEquals("Debe seleccionar un color dentor de la lista posibles", mensaje);
    }

}
