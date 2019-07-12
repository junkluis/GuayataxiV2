package com.example.guayataxiv2;

import org.junit.Before;
import org.junit.Test;

import guayataxi.Taxi;
import guayataxi.Conductor;
import static org.junit.Assert.*;

public class ConductorTest {
    Conductor conductorPrueba = null;
    Conductor conductorSinTaxi = null;
    
    public void iniciarPruebas() {
        conductorPrueba = new Conductor("Wellington Matinez", "4937276890");
        conductorSinTaxi = new Conductor("Clara Alcazar", "0955778979");
    }
    
    public void asignarTaxi() {
        boolean asignacionExitosa = false;
        Taxi taxi = new Taxi("GXZ093", "Ferarari", 1);
        try {
            conductorPrueba.asignarUnTaxi(taxi);
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
            conductorPrueba.asignarUnTaxi(taxi);
            asignacionExitosa = true;
        } catch (AssertionError error){
            asignacionExitosa = false;
        }
        assertEquals(true, asignacionExitosa);         
    }
    
    public void verificacionCed(Conductor conductor) {
        boolean verificacion = false;
        verificacion = conductor.verificarCedula();
        assertEquals(true, verificacion);         

    }
    
    public void verificarCedulaDeConductores() {
        Conductor conductorSinPapeles = new Conductor("Jose Alcivar", "02");
        verificacionCed(conductorPrueba);
        verificacionCed(conductorSinTaxi);
        verificacionCed(conductorSinPapeles);
    }
}
