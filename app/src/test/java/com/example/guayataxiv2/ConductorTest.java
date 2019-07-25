package com.example.guayataxiv2;

import org.junit.Before;
import org.junit.Test;

import guayataxi.Taxi;
import guayataxi.Conductor;
import static org.junit.Assert.*;

public class ConductorTest {
    Conductor conductorPrueba = null;
    Conductor conductorSinTaxi = null;
    Conductor conductorSinPapeles = null;

    @Before
    public void iniciarPruebas() {
        conductorPrueba = new Conductor("Wellington Matinez", "4937276890");
        conductorSinTaxi = new Conductor("Clara Alcazar", "0955778979");
    }

    @Test
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

    @Test
    public void sinTaxi() {
        Taxi taxi = null;
        boolean asignacionExitosa = false;        
        try {
            conductorPrueba.asignarUnTaxi(taxi);
            asignacionExitosa = false;
        } catch (AssertionError error){
            asignacionExitosa = true;
        }
        assertEquals(false, asignacionExitosa);
    }

    @Test
    public void verificacionCed() {
        boolean verificacion = false;
        conductorSinPapeles = new Conductor("Jose Alcivar", "02");
        verificacion = conductorPrueba.verificarCedula();
        assertEquals(false, verificacion);
        verificacion = conductorSinTaxi.verificarCedula();
        assertEquals(true, verificacion);
        verificacion = conductorSinPapeles.verificarCedula();
        assertEquals(false, verificacion);
    }

}
