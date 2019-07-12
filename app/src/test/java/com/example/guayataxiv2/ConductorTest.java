package com.example.guayataxiv2;

import org.junit.Before;
import org.junit.Test;

import guayataxi.Conductor;

import static org.junit.Assert.*;


public class ConductorTest {

	Conductor conductorPrueba = null;

	@Before
	public void iniciarPruebas(){
        conductorPrueba = new Conductor("Conductor 12", "0942663452");
    }

    @Test
    public void crearNuevoConductor(){
    	boolean creacionExito = false;
        try{
            Condutor conductor1 = new Conductor("Conductor 1", "0942663452");
            creacionExito = true;
        } catch (AssertionError error){
            creacionExito = false;
        }
        assertEquals(true, creacionExito);
    }

    @Test
    public void asignarUnTaxi(){
    	boolean asinacionExito = false;
    	try{
    		Taxi taxiPrueba = new Taxi("ABC1234", "Marca", 1);
    		asinacionExito = conductorPrueba.asignarUnTaxi(taxiPrueba);
    	} catch (AssertionError error){
            asinacionExito = false;
        }
        assertEquals(true, asinacionExito);


    }


}
