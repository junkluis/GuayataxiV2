package com.example.guayataxiv2;

import org.junit.Before;
import org.junit.Test;

import guayataxi.Taxi;

public class ConductorTest {
    Conductor conductorPrueba = null;
    Conductor conductorSinTaxi = null;
    
    public iniciarPruebas() {
        conductorPrueba = new Conductor("Wellington Matinez", "0937276890");
        ConductorSinTaxi = new Conductor("Clara Alcazar", "0955778979");
    }
    
    public void asignarTaxi() {
        boolean asignacionExitosa = false;
        Taxi taxi = new Taxi("GXZ093", "Ferarari", 1);
        try {
            conductorPrueba.asignarTaxi(taxi);
            asignacionExitosa = true;
        } catch (AssertionError error){
            asignacionExitosa = false;
        }
        assertEquals(true, asignacionExitosa);        
    }
    
    public void sinTaxi() {
        Taxi taxi = null;
        boolean asignacionExitosa = false;        
        try {
            conductorPrueba.asignarTaxi(taxi);
            asignacionExitosa = true;
        } catch (AssertionError error){
            asignacionExitosa = false;
        }
        assertEquals(true, asignacionExitosa);         
    }
}
