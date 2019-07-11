package com.example.guayataxiv2;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import guayataxi.Taxi;

public class TaxiTest {
    Taxi taxi = null;

    @Before
    public void iniciarPruebas(){
        taxi = new Taxi("asadasa", "marca", 1);
    }

    @Test
    public void crearUnaTaxi(){
        boolean creacionExito = false;
        try{
            Taxi taxiNuevo = new Taxi("asadasa", "marca", 1);
            creacionExito = true;
        } catch (AssertionError error){
            creacionExito = false;
        }
        assertEquals(true, creacionExito);
    }

    @Test
    public void setColorCorrecto(){
        String color = "Rojo";
        String mensajeEsperado = "Al taxi se le asigno el color: " + color;
        String valor = taxi.setColor(color);
        assertEquals(mensajeEsperado, valor);
    }

    @Test
    public void setColorIncorrecto(){
        String color = "Violeta";
        String mensajeEsperado = "Debe seleccionar un color dentor de la lista posibles";
        String valor = taxi.setColor(color);
        assertEquals(mensajeEsperado, valor);
    }
}
