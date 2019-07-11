package com.example.guayataxiv2;

import org.junit.Before;
import org.junit.Test;

import guayataxi.Ubicacion;

import static org.junit.Assert.assertEquals;

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
    public void calcularPrecioDistacia_0A10(){
        float precioEsperado = 2;
        Ubicacion ubicacion = new Ubicacion(55,5,5);
        float precioObtenido = ubicacion.calcularPrecio();
        assertEquals(precioEsperado, precioObtenido );
    }

    @Test
    public void calcularPrecioDistacia_10A30(){
        float precioEsperado = 5;
        Ubicacion ubicacion = new Ubicacion(55,55,15);
        float precioObtenido = ubicacion.calcularPrecio();
        assertEquals(precioEsperado, precioObtenido );
    }

    @Test
    public void calcularPrecioDistaciaMayorA30LongitudMayor50(){
        float precioEsperado = 10;
        Ubicacion ubicacion = new Ubicacion(55,5,145);
        float precioObtenido = ubicacion.calcularPrecio();
        assertEquals(precioEsperado, precioObtenido );
    }
    @Test
    public void calcularPrecioDistaciaMayorA30LatitudMayor50(){
        float precioEsperado = 15;
        Ubicacion ubicacion = new Ubicacion(55,55,145);
        float precioObtenido = ubicacion.calcularPrecio();
        assertEquals(precioEsperado, precioObtenido );
    }

    @Test
    public void calcularPrecioRangosNoPermitidos(){
        float precioEsperado = 0;
        Ubicacion ubicacion = new Ubicacion(5,5,145);
        float precioObtenido = ubicacion.calcularPrecio();
        assertEquals(precioEsperado, precioObtenido );
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
