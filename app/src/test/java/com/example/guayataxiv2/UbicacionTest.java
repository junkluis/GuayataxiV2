package com.example.guayataxiv2;

import org.junit.Before;
import org.junit.Test;

import guayataxi.Ubicacion;

import static org.junit.Assert.*;

public class UbicacionTest {

    Ubicacion ubicacion = null;

    @Before
    public void iniciarTest(){

        this.ubicacion = new Ubicacion(55,5,20);
    }

    @Test
    public void crearNuevaUbicacion(){

        boolean creacionExito = false;
        try{

            Ubicacion ubicacion = new Ubicacion(55,5,20);

            creacionExito = true;
        } catch (AssertionError error){
            creacionExito = false;
        }
        assertEquals(true, creacionExito);
    }

    @Test
    public void calcularPrecio1(){
        float precioEsperado = 2;
        Ubicacion ubicacion = new Ubicacion(55,5,5);
        float precioObtenido = ubicacion.calcularPrecio();
        assertEquals(precioEsperado, precioObtenido, 0.1);
    }

    @Test
    public void calcularPrecio2(){
        float precioEsperado = 5;
        Ubicacion ubicacion = new Ubicacion(55,55,15);

        float precioObtenido = ubicacion.calcularPrecio();
        assertEquals(precioEsperado, precioObtenido, 0.1);
    }

    @Test
    public void calcularPrecio3(){
        float precioEsperado = 10;
        Ubicacion ubicacion = new Ubicacion(55,5,145);

        float precioObtenido = ubicacion.calcularPrecio();
        assertEquals(precioEsperado, precioObtenido, 0.1);
    }
    @Test
    public void calcularPrecio4(){
        float precioEsperado = 15;
        Ubicacion ubicacion = new Ubicacion(5,55,145);

        float precioObtenido = ubicacion.calcularPrecio();
        assertEquals(precioEsperado, precioObtenido, 0.1);
    }

    @Test
    public void calcularPrecioRangosNoPermitidos(){
        float precioEsperado = 0;

        Ubicacion ubicacion = new Ubicacion(0,0,0);

        float precioObtenido = ubicacion.calcularPrecio();
        assertEquals(precioEsperado, precioObtenido, 0.1);
    }

    @Test
    public void colocarDescripcion(){
        boolean registroExito = false;
        try{

            Ubicacion ubicacion= new Ubicacion(5, 5, 455);

            ubicacion.setDescripcion("descripcion");
            registroExito = true;
        } catch (AssertionError error){
            registroExito = false;
        }
        assertEquals(true, registroExito);

    }



}
