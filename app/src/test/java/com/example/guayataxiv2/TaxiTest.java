package com.example.guayataxiv2;

import org.junit.Before;
import org.junit.Test;

import guayataxi.Taxi;

import static org.junit.Assert.*;

public class TaxiTest {

	Taxi taxiPrueba = null;

    @Before
    public void iniciarPruebas(){
        taxiPrueba = new Taxi("ABC1234", "nuevo", 2);
    }

    @Test
    public void crearUnNuevoTaxi(){
        boolean creacionExito = false;
        try{
        	Taxi taxiABC = new Taxi("ABC1234", "nuevo", 2);
            creacionExito = true;
        } catch (AssertionError error){
            creacionExito = false;
        }
        assertEquals(true, creacionExito);
    }

    
}
