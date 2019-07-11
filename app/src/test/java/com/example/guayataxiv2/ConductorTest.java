package com.example.guayataxiv2;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import guayataxi.Conductor;
import guayataxi.Taxi;

public class ConductorTest {

    Conductor conductor = null;
    Taxi taxi = null;
    @Before
    public void inicializarTest(){
        this.conductor = new Conductor("Conductor prueba", "0987654321");
        this.taxi = new Taxi("aaaaa","bbbbbb",1);
    }
    public void crearNuevoConductor(){
        boolean creacionExito = false;
        try{
            Conductor conductor = new Conductor("Conductor prueba", "0987654321"    );
            creacionExito = true;
        } catch (AssertionError error){
            creacionExito = false;
        }
        assertEquals(true, creacionExito);
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
        boolean estado = this.conductor.asignarUnTaxi(taxi);
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
