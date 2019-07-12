package com.example.guayataxiv2;

import org.junit.Before;
import org.junit.Test;

import guayataxi.Ubicacion;

import static org.junit.Assert.*;

public class UbicacionTest {

    Ubicacion ubicacionPrueba = null;
    Ubicacion ubicacionDistancia1 = null;
    Ubicacion ubicacionDistancia2 = null;
    Ubicacion ubicacionDistancia3 = null;
    Ubicacion ubicacionDistancia4 = null;

    @Before
    public void iniciarPruebas(){
        ubicacionPrueba = new Ubicacion(-2.5f,16.5f,300);
        ubicacionDistancia1 = new Ubicacion(-2.5f,16.5f,9);
        ubicacionDistancia2 = new Ubicacion(-2.5f,16.5f,15);
        ubicacionDistancia3 = new Ubicacion(52.5f,16.5f,35);
        ubicacionDistancia4 = new Ubicacion(-2.5f,56.5f,40);
    }

    @Test
    public void crearUbicacion(){
        boolean creacionExito = false;
        try{
            Ubicacion crearUbicacion = new Ubicacion(-3.1f,10.2f,200);
            creacionExito = true;
        } catch (AssertionError error){
            creacionExito = false;
        }
        assertEquals(true, creacionExito);
    }

    @Test
    public void calcularPrecio1(){
        Float precioEsperado = 2f;
        Float valor = ubicacionDistancia1.calcularPrecio();
        assertEquals(precioEsperado, valor);
    }

    @Test
    public void calcularPrecio2(){
        Float precioEsperado = 5f;
        Float valor = ubicacionDistancia2.calcularPrecio();
        assertEquals(precioEsperado, valor);
    }

    @Test
    public void calcularPrecio3(){
        Float precioEsperado = 10f;
        Float valor = ubicacionDistancia3.calcularPrecio();
        assertEquals(precioEsperado, valor);
    }

    @Test
    public void calcularPrecio4(){
        Float precioEsperado = 15f;
        Float valor = ubicacionDistancia4.calcularPrecio();
        assertEquals(precioEsperado, valor);
    }

}
