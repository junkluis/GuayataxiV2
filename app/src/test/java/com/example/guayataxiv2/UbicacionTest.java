package com.example.guayataxiv2;

import org.junit.Before;
import org.junit.Test;

import guayataxi.Ubicacion;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class UbicacionTest {
    Ubicacion ubicacionPrueba;

    @Test
    public void crearNuevaUbicacion(){
        boolean creacionExito;
        float longitud = (float)10.5;
        float latitud = (float)10.5;
        float distancia = (float) 38.5;
        try{
            Ubicacion nuevaUbicacion = new Ubicacion(longitud, latitud, distancia);
            creacionExito = true;
        } catch (AssertionError error){
            creacionExito = false;
        }
        assertTrue(creacionExito);

    }

    @Test
    public void calcularPrecioMenor10(){
        float precioCalculado;
        ubicacionPrueba = new Ubicacion((float)12.5, (float) 9.5, (float) 5);
        precioCalculado = ubicacionPrueba.calcularPrecio();
        assertEquals((float)2, precioCalculado,0);

    }
    @Test
    public void calcularPrecioMenor30(){
        float precioCalculado;
        ubicacionPrueba = new Ubicacion((float)12.5, (float) 9.5, (float) 12);
        precioCalculado = ubicacionPrueba.calcularPrecio();
        assertEquals((float)5, precioCalculado,0);

    }

    @Test
    public void calcularPrecioLongitudmayor50(){
        float precioCalculado;
        ubicacionPrueba = new Ubicacion((float)70, (float) 9.5, (float) 35);
        precioCalculado = ubicacionPrueba.calcularPrecio();
        assertEquals((float)10, precioCalculado,0);

    }
    @Test
    public void calcularPrecioLaitudmayor50(){
        float precioCalculado;
        ubicacionPrueba = new Ubicacion((float)12, (float) 75, (float) 35);
        precioCalculado = ubicacionPrueba.calcularPrecio();
        assertEquals((float)15, precioCalculado,0);

    }

    @Test
    public void SetDescriptionTest(){
        boolean setExito;
        ubicacionPrueba = new Ubicacion((float)12, (float) 75, (float) 35);
        try {
            ubicacionPrueba.setDescripcion("descrpcion");
            setExito = true;
        }
        catch (AssertionError error){
            setExito = false;
        }
    assertTrue(setExito);


    }
}
