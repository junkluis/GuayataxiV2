package com.example.guayataxiv2;

import org.junit.Before;
import org.junit.Test;

import guayataxi.Conductor;
import guayataxi.Taxi;

import static org.junit.Assert.*;

public class TaxiTest {

    Taxi taxiPrueba = null;

    @Before
    public void iniciarPruebas(){
        taxiPrueba = new Taxi("GGY-1234","Reanult",1);
    }

    @Test
    public void crearTaxi(){
        boolean creacionExito = false;
        try{
            Taxi taxi = new Taxi("GBT-2434","Chevrolet",3);
            creacionExito = true;
        } catch (AssertionError error){
            creacionExito = false;
        }
        assertEquals(true, creacionExito);
    }

    @Test
    public void setColor(){
        String mensajeEsperado = "Al taxi se le asigno el color: Rojo";
        String valor = taxiPrueba.setColor("Rojo");
        assertEquals(mensajeEsperado, valor);
    }

    @Test
    public void setBadColor(){
        String mensajeEsperado = "Debe seleccionar un color dentor de la lista posibles";
        String valor = taxiPrueba.setColor("Negro");
        assertEquals(mensajeEsperado, valor);
    }
}
