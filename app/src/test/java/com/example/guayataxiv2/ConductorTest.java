package com.example.guayataxiv2;

import org.junit.Before;
import org.junit.Test;

import guayataxi.Billetera;
import guayataxi.Cliente;
import guayataxi.Conductor;
import guayataxi.Taxi;

import static org.junit.Assert.assertEquals;

public class ConductorTest {


    Billetera billeteraPrueba = null;

    Cliente clientePrueba = null;
    Taxi taxi = null;


    @Before
    public void iniciarPruebas(){
        billeteraPrueba = new Billetera(2);
        billeteraPrueba.agregarFondos(10);
        clientePrueba = new Cliente("Pedro","09200558696",billeteraPrueba);

    }

    @Test
    public void crearUnaNuevoConductor(){
        boolean creacionExito = false;
        try{
            Conductor clienteLuis = new Conductor("Luis","09200558696");
            creacionExito = true;
        } catch (AssertionError error){
            creacionExito = false;
        }
        assertEquals(true, creacionExito);
    }

    @Test
    public void bloquearBilletera(){
        boolean estado = billeteraPrueba.habilitarBilletera(false);
        assertEquals(false, estado);
    }

    @Test
    public void registrarCasa(){
        boolean creacionExito = false;
        try{
            Ubicacion casaLuis = new Ubicacion(22,25,12);
            creacionExito = true;
        } catch (AssertionError error){
            creacionExito = false;
        }
        assertEquals(true, creacionExito);
    }



}
