package com.example.guayataxiv2;

import org.junit.Before;
import org.junit.Test;

import guayataxi.Billetera;
import guayataxi.Cliente;
import guayataxi.Ubicacion;
import guayataxi.Conductor;
import guayataxi.Taxi;

import static org.junit.Assert.*;

public class UbicacionTest {
    Ubicacion ubicacionPrueba = null;

    @Before
    public void iniciarPruebas(){
        ubicacionPrueba = new Ubicacion(0.8f,0.6f,0.45f);
    }

    @Test
    public void crearUnaNuevaUbicacion(){
        boolean creacionExito = false;
        try{
            Ubicacion ubicacionNueva = new Ubicacion(0.8f,0.6f,0.45f);
            creacionExito = true;
        } catch (AssertionError error){
            creacionExito = false;
        }
        assertEquals(true, creacionExito);
    }

    @Test
    public void calcularPrecioPrueba(){
        float valor = 2;
        float valorEsperado = ubicacionPrueba.calcularPrecio();


        assertEquals(valor,valorEsperado);
    }
}
