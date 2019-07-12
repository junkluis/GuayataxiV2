package com.example.guayataxiv2;

import org.junit.Test;
import org.junit.Before;

import guayataxi.Ubicacion;

import static org.junit.Assert.assertEquals;

public class UbicacionTest{


    Ubicacion casaVenta = null;


    @Before
    public void iniciarPruebas(){
       casaVenta = new Ubicacion(22.2f,22.2f,8.0f);

    }

    @Test
    public void precioCondicion1(){
        Ubicacion casa = new Ubicacion(22.2f,22.2f,8.0f);
        float precio = casa.calcularPrecio();
        assertEquals(precio,2.0f,0.5f);
    }

    @Test
    public void precioCondicion2(){
        Ubicacion casa = new Ubicacion(22.2f,22.2f,25.0f);
        float precio = casa.calcularPrecio();
        assertEquals(precio,5.0f,0.5f);
    }

    @Test
    public void precioCondicion3(){
        Ubicacion casa = new Ubicacion(61.0f,22.2f,42.0f);
        float precio = casa.calcularPrecio();
        assertEquals(precio,10.0f,0.5f);
    }

    @Test
    public void precioCondicion4(){
        Ubicacion casa = new Ubicacion(22.1f,62.2f,41.0f);
        float precio = casa.calcularPrecio();
        assertEquals(precio,15.0f,0.5f);
    }

    @Test
    public void setDescripcion(){

        boolean creacionExito = false;
        try{
            Ubicacion miCasa = new Ubicacion(21.1f,72.2f,41.0f);
            miCasa.setDescripcion("Casa");
            creacionExito = true;
        } catch (AssertionError error){
            creacionExito = false;
        }
        assertEquals(true, creacionExito);
    }



}
