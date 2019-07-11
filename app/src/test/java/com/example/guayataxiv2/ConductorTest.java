package com.example.guayataxiv2;

import org.junit.Before;
import org.junit.Test;

import guayataxi.Conductor;
import guayataxi.Taxi;

import static org.junit.Assert.*;

public class ConductorTest {

    Taxi taxiPrueba;
    Conductor conductorPruebaCiValido;
    Conductor conductorPruebaCicorto;
    Conductor conductorPruebaCiInvalido;

    @Before
    public void IniciarPrueba(){
        taxiPrueba = new Taxi("asd-1234", "toyota", 1);
        conductorPruebaCiValido = new Conductor("nombre Completo", "0948392854");
        conductorPruebaCicorto = new Conductor("nombre Completo", "094839");
        conductorPruebaCiInvalido = new Conductor("nombre Completo", "8948392854");

    }
    @Test
    public void crearNuevoConductor() {
        boolean creacionExito;
        try{
            Conductor nuevoConductor = new Conductor(" Nombre Completo", "0933948576");
            creacionExito = true;
        }catch (AssertionError error){
            creacionExito = false;
        }
        assertTrue(creacionExito);
    }

    @Test
    public void asignacionTaxi() {
        assertTrue(conductorPruebaCiValido.asignarUnTaxi(taxiPrueba));
    }

    @Test
    public void asignacionTaxiNulo() {
        assertFalse(conductorPruebaCiValido.asignarUnTaxi(null));
    }

    @Test
    public void verificarCedulaNumeroCaracteresIncorrecto(){
        assertFalse(conductorPruebaCicorto.verificarCedula());
    }

    @Test
    public void verificarCedulaInvalida(){
        assertFalse(conductorPruebaCiInvalido.verificarCedula());
    }

    @Test
    public void verificarCedulaValida(){
        assertTrue(conductorPruebaCiValido.verificarCedula());
    }
}
