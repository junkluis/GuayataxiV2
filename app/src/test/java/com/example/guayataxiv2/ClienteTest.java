package com.example.guayataxiv2;

import org.junit.Before;
import org.junit.Test;

import guayataxi.Billetera;
import guayataxi.Cliente;
import guayataxi.Ubicacion;
import guayataxi.Conductor;
import guayataxi.Taxi;

import static org.junit.Assert.*;

public class ConductorTest {
    Taxi taxiPrueba = null;
    Conductor conductorPrueba = null;

    @Before
    public void iniciarPruebas(){
        taxiPrueba = new Taxi("GSG-7978","KIA",1);

        conductorPrueba = new Conductor("Leonardo Castro","0926385998");
    }

    @Test
    public void crearUnNuevoConductor(){
        boolean creacionExito = false;
        try{
            Conductor conductorNuevo = new Conductor("Leonardo Castro","0926385998");
            creacionExito = true;
        } catch (AssertionError error){
            creacionExito = false;
        }
        assertEquals(true, creacionExito);
    }

    @Test
    public void asignarTaxiAlConductor(){
        boolean valor = conductorPrueba.asignarUnTaxi(taxiPrueba);
        assertEquals(true,valor);
    }

    @Test
    public void asignarTaxiCreado(){
        Taxi taxi = new Taxi("aaaaa","bbbbbb",1);
        boolean estado = this.conductor.asignarUnTaxi(taxi);
        assertEquals(true,estado);
    }

    @Test
    public void asignarTaxiNoCreado(){
        Taxi taxi = null;
        boolean estado = this.conductorPrueba.asignarUnTaxi(taxi);
        assertEquals(false,estado);
    }
    @Test
    public void verificarCedulaValida(){
        Conductor conductor= new Conductor("prueba Conductor", "0987654321");
        boolean validez = conductor.verificarCedula();
        assertEquals(true, validez);
    }
    @Test
    public void verificarCedulaValid1(){
        Conductor conductor= new Conductor("prueba Conductor", "9987654321");
        boolean validez = conductor.verificarCedula();
        assertEquals(false, validez);
    }

    @Test
    public void verificarCedulaInalida2(){
        Conductor conductor= new Conductor("prueba Conductor", "0654321");
        boolean validez = conductor.verificarCedula();
        assertEquals(false, validez);
    }

}