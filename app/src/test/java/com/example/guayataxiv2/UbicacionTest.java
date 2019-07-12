package com.example.guayataxiv2;

import org.junit.Test;

import guayataxi.Ubicacion;

import static org.junit.Assert.assertEquals;

public class UbicacionTest {


    @Test
    public void precio_2(){
        Ubicacion miCasa = new Ubicacion(12.2f,12.2f,5.0f);
        float precio = miCasa.calcularPrecio();
        assertEquals(precio,2.0f,0.5f);
    }

    @Test
    public void precio_5(){
        Ubicacion miCasa = new Ubicacion(12.2f,12.2f,15.0f);
        float precio = miCasa.calcularPrecio();
        assertEquals(precio,5.0f,0.5f);
    }

    @Test
    public void precio_10(){
        Ubicacion miCasa = new Ubicacion(51.0f,12.2f,31.0f);
        float precio = miCasa.calcularPrecio();
        assertEquals(precio,10.0f,0.5f);
    }

    @Test
    public void precio_15(){
        Ubicacion miCasa = new Ubicacion(19.1f,52.2f,31.0f);
        float precio = miCasa.calcularPrecio();
        assertEquals(precio,15.0f,0.5f);
    }

}
