package com.example.guayataxiv2;

import org.junit.Before;
import org.junit.Test;
import guayataxi.Taxi;
import static org.junit.Assert.*;

public class TaxiTest {

    Taxi taxiPrueba;

    @Before
    public void iniciarPruebas() {
        taxiPrueba = new Taxi("asf-1233", "toyota", 01);
    }

    @Test
    public void creacionTaxi() {
        boolean creacionExito;
        try {
            Taxi nuevoTaxi = new Taxi("asf-1233", "toyota", 01);
            creacionExito = true;
        } catch (AssertionError error) {
            creacionExito = false;
        }
        assertTrue(creacionExito);

    }

    @Test
    public void setColorEnLista() {
        String mensaje = taxiPrueba.setColor("Rojo");
        String resultadoEsperado = "Al taxi se le asigno el color: Rojo";
        assertEquals(mensaje, resultadoEsperado);
    }

    @Test
    public void setColorNoEnLista() {
        String mensaje = taxiPrueba.setColor("Cyan");
        String resultadoEsperado = "Al taxi se le asigno el color: Rojo";
        assertNotEquals(mensaje, resultadoEsperado);
    }
}
