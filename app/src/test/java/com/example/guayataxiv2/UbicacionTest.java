package com.example.guayataxiv2;

import org.junit.Test;

import guayataxi.Ubicacion;

import static org.junit.Assert.*;

public class UbicacionTest {


    @Test
    public void crearUnaNuevaUbicacion(){
        boolean creacionExito = false;
        try{
            Ubicacion ubicacion = new Ubicacion(101,103,20);
            creacionExito = true;
        } catch (AssertionError error){
            creacionExito = false;
        }
        assertEquals(true, creacionExito);
    }

    @Test
    public void calcularDistancia1(){
        float cantidad = 2;
        Ubicacion ubicacion = new Ubicacion(101,103,8);
        float valor = ubicacion.calcularPrecio();

        assertEquals(cantidad, valor,0.1);
    }

    @Test
    public void calcularDistancia2(){
        float cantidad = 5;
        Ubicacion ubicacion = new Ubicacion(101,103,11);
        float valor = ubicacion.calcularPrecio();
        assertEquals(cantidad, valor,0.1);
    }

    @Test
    public void calcularDistancia3(){
        float cantidad = 10;
        Ubicacion ubicacion = new Ubicacion(101,103,35);
        float valor = ubicacion.calcularPrecio();
        assertEquals(cantidad, valor,0.1);
    }

    @Test
    public void calcularDistancia4(){
        float cantidad = 15;
        Ubicacion ubicacion = new Ubicacion(33,103,32);
        float valor = ubicacion.calcularPrecio();
        assertEquals(cantidad, valor,0.1);
    }

    @Test
    public void calcularDistancia5(){
        float cantidad = 0;
        Ubicacion ubicacion = new Ubicacion(101,103,0);
    float valor = ubicacion.calcularPrecio();
    assertEquals(cantidad, valor,0.1);
}

    @Test
    public void setDescripcion(){
        boolean creacionExito = false;
        try{
            Ubicacion ubicacion = new Ubicacion(101,103,0);
            ubicacion.setDescripcion("Casa");
            creacionExito = true;
        } catch (AssertionError error){
            creacionExito = false;
        }
        assertEquals(true, creacionExito);
    }
}
