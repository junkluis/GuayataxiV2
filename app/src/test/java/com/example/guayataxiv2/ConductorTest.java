package com.example.guayataxiv2;

import org.junit.Before;
import org.junit.Test;

import guayataxi.Conductor;
import guayataxi.Taxi;

import static org.junit.Assert.*;


public class ConductorTest {

	Conductor conductorPrueba = null;

	@Before
	public void iniciarPruebas(){
        conductorPrueba = new Conductor("Conductor 1", "0942663452");
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

    @Test
    public void verificarCedula10(){
    	boolean verificarExito = false;
    	try{
    		Condutor conductor1 = new Conductor("Conductor 1", "0942663452");
    		verificarExito = conductorPrueba.verificarCedula();
    	} catch (AssertionError error){
            verificarExito = false;
        }
        assertEquals(true, verificarExito);
    }

    @Test
    public void verificarCedulaMenor10(){
    	boolean verificarExito = false;
    	try{
    		Condutor conductor1 = new Conductor("Conductor 1", "094266345");
    		verificarExito = conductorPrueba.verificarCedula();
    	} catch (AssertionError error){
            verificarExito = false;
        }
        assertEquals(true, verificarExito);
    }

    @Test
    public void verificarCedulaMayor10(){
    	boolean verificarExito = false;
    	try{
    		Condutor conductor1 = new Conductor("Conductor 1", "09426634501");
    		verificarExito = conductorPrueba.verificarCedula();
    	} catch (AssertionError error){
            verificarExito = false;
        }
        assertEquals(true, verificarExito);
    }

    @Test
    public void verificarCedulaEmpiezaDiferenteDeCero(){
    	boolean verificarExito = false;
    	try{
    		Condutor conductor1 = new Conductor("Conductor 1", "1942663450");
    		verificarExito = conductorPrueba.verificarCedula();
    	} catch (AssertionError error){
            verificarExito = false;
        }
        assertEquals(true, verificarExito);
    }


}
