package com.example.guayataxiv2;

import org.junit.Test;

import guayataxi.Ubicacion;

import static org.junit.Assert.assertEquals;

public class UbicacionTest {

    @Test
    public void precio_Calculado2(){
        Ubicacion home = new Ubicacion(12.2f,12.2f,5.0f);
        float value = home.calcularPrecio();
        assertEquals(value,2.0f,0.5f);
    }

    @Test
    public void precio_Calculado5(){
        Ubicacion home = new Ubicacion(12.2f,12.2f,15.0f);
        float value = home.calcularPrecio();
        assertEquals(value,5.0f,0.5f);
    }

    @Test
    public void precio_Calculado10(){
        Ubicacion home = new Ubicacion(51.0f,12.2f,31.0f);
        float value = home.calcularPrecio();
        assertEquals(value,10.0f,0.5f);
    }

    @Test
    public void precio_Calculado15(){
        Ubicacion home = new Ubicacion(19.1f,52.2f,31.0f);
        float value = home.calcularPrecio();
        assertEquals(value,15.0f,0.5f);
    }

    @Test
    public void setDescripcion(){
        Ubicacion home = new Ubicacion(2.1f,21.2f,14.2f);
        float value = home.calcularPrecio();
        home.setDescripcion("Mi casa grande");
        assertEquals(value,5.0f,0.5f);
    }

}