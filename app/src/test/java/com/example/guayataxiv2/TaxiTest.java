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

    @Test
    public void setearColorRojo(){
    	String mensajeEsperado = "Al taxi se le asigno el color: Rojo";
    	String mensajeObtenido = taxiPrueba.setColor("Rojo");
    	assertEquals(mensajeEsperado, mensajeObtenido);
    }

    @Test
    public void setearColorAmarillo(){
    	String mensajeEsperado = "Al taxi se le asigno el color: Amarillo";
    	String mensajeObtenido = taxiPrueba.setColor("Amarillo");
    	assertEquals(mensajeEsperado, mensajeObtenido);
    }

    @Test
    public void setearColorVerde(){
    	String mensajeEsperado = "Al taxi se le asigno el color: Verde";
    	String mensajeObtenido = taxiPrueba.setColor("Verde");
    	assertEquals(mensajeEsperado, mensajeObtenido);
    }

    @Test
    public void setearColorMal(){
    	String mensajeEsperado = "Debe seleccionar un color dentor de la lista posibles";
    	String mensajeObtenido = taxiPrueba.setColor("Morado");
    	assertEquals(mensajeEsperado, mensajeObtenido);
    }
    
}
