package com.example.guayataxiv2;

import org.junit.Before;
import org.junit.Test;

import guayataxi.Conductor;
import guayataxi.Taxi;

import static org.junit.Assert.*;

public class ConductorTest {

    Conductor conductorPrueba = null;
    Taxi taxi = null;

    @Before
    public void iniciarPruebas(){
        conductorPrueba = new Conductor("conductor prueba","0987654321");
    }

    @Test
    public void crearConductor(){
        boolean creacionExito = false;
        try{
            Conductor nuevoConductor = new Conductor("Jose Luis","1234567890");
            creacionExito = true;
        } catch (AssertionError error){
            creacionExito = false;
        }
        assertEquals(true, creacionExito);
    }



}
