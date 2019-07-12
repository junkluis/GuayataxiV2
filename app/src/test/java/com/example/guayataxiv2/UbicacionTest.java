package com.example.guayataxiv2;

import org.junit.Before;
import org.junit.Test;

import guayataxi.Ubicacion;

import static org.junit.Assert.*;

public class UbicacionTest {

	Ubicacion ubicacionPrueba = null;

    @Before
    public void iniciarPruebas(){
        ubicacionPrueba = new Ubicacion(2.31f, 2.31f, 450.21f);
    }

    @Test
    public void crearNuevaUbicacion(){
    	boolean creacionExito = false;
        try{
        	Ubicacion ubicacion1 = new Ubicacion(2.31f, 2.31f, 450.21f);
            creacionExito = true;
        } catch (AssertionError error){
            creacionExito = false;
        }
        assertEquals(true, creacionExito);
    }

    @Test
    public void setDescripcion(){
    	boolean creacionExito = false;
        try{
        	String descripcion = "descripcion";
            ubicacionPrueba.setDescripcion(descripcion);
        } catch (AssertionError error){
            creacionExito = false;
        }
        assertEquals(true, creacionExito);
    }

    @Test
    public void precioCalculadoCero(){
    	float precioEsperado = 0;
    	Ubicacion ubicacion1 = new Ubicacion(2.31f, 2.31f, 0);
    	float precioObtenido = ubicacion1.calcularPrecio();
    	assertEquals(precioEsperado, precioObtenido);
    }

    @Test
    public void precioCalculadoCero1(){
    	float precioEsperado = 0;
    	Ubicacion ubicacion1 = new Ubicacion(2.31f, 2.31f, 40);
    	float precioObtenido = ubicacion1.calcularPrecio();
    	assertEquals(precioEsperado, precioObtenido);
    }

    @Test
    public void precioCalculadoDos(){
    	float precioEsperado = 2;
    	Ubicacion ubicacion1 = new Ubicacion(2.31f, 2.31f, 5);
    	float precioObtenido = ubicacion1.calcularPrecio();
    	assertEquals(precioEsperado, precioObtenido);
    }

    @Test
    public void precioCalculadoCinco(){
    	float precioEsperado = 5;
    	Ubicacion ubicacion1 = new Ubicacion(2.31f, 2.31f, 10);
    	float precioObtenido = ubicacion1.calcularPrecio();
    	assertEquals(precioEsperado, precioObtenido);
    }

    @Test
    public void precioCalculadoDiez(){
    	float precioEsperado = 10;
    	Ubicacion ubicacion1 = new Ubicacion(60, 2.31f, 40);
    	float precioObtenido = ubicacion1.calcularPrecio();
    	assertEquals(precioEsperado, precioObtenido);
    }

    @Test
    public void precioCalculadoQuince(){
    	float precioEsperado = 15;
    	Ubicacion ubicacion1 = new Ubicacion(2.31f, 60, 40);
    	float precioObtenido = ubicacion1.calcularPrecio();
    	assertEquals(precioEsperado, precioObtenido);
    }
}
