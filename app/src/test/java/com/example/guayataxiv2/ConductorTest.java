package com.example.guayataxiv2;

import org.junit.Before;
import org.junit.Test;

import guayataxi.Conductor;
import guayataxi.Taxi;

import static org.junit.Assert.*;

public class ConductorTest {

    Conductor conductorPrueba = null;
    Conductor conductorPruebaCIncorrecta1 = null;
    Conductor conductorPruebaCIncorrecta2 = null;
    Taxi taxiPrueba = null;

    @Before
    public void iniciarPruebas(){
        conductorPrueba = new Conductor("conductor prueba","0987654321");
        conductorPruebaCIncorrecta1 = new Conductor("conductor prueba 1","098765432");
        conductorPruebaCIncorrecta2 = new Conductor("conductor prueba 2","1987654321");
        taxiPrueba = new Taxi("GGY-1234","Reanult",1);
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

    @Test
    public void asignarUnTaxi(){
        boolean creacionExito = false;
        try{
            creacionExito =  conductorPrueba.asignarUnTaxi(taxiPrueba);
        } catch (AssertionError error){
            creacionExito = false;
        }
        assertEquals(true, creacionExito);
    }

    @Test
    public void verificarCedulaCorrecta(){
        boolean verificacionExito = false;
        try{
            verificacionExito =  conductorPrueba.verificarCedula();
        } catch (AssertionError error){
            verificacionExito = false;
        }
        assertEquals(true, verificacionExito);
    }

    @Test
    public void verificarCedulaCorrecta1(){
        boolean verificacionExito = false;
        try{
            verificacionExito =  conductorPruebaCIncorrecta1.verificarCedula();
        } catch (AssertionError error){
            verificacionExito = false;
        }
        assertEquals(false, verificacionExito);
    }

    @Test
    public void verificarCedulaCorrecta2(){
        boolean verificacionExito = false;
        try{
            verificacionExito =  conductorPruebaCIncorrecta2.verificarCedula();
        } catch (AssertionError error){
            verificacionExito = false;
        }
        assertEquals(false, verificacionExito);
    }

}
