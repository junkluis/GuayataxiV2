package com.example.guayataxiv2;
import org.junit.Before;
import org.junit.Test;

import guayataxi.Conductor;
import guayataxi.Taxi;

import static org.junit.Assert.*;

public class ConductorTest {
    Conductor conductor = null;
    Taxi taxi = null;

    @Before
    public void iniciarPruebas(){
        conductor = new Conductor("Carlos Veintemilla", "0705786564");
        taxi = new Taxi("asadasa", "marca", "aaa");
    }

    @Test
    public void crearUnaConductor(){
        boolean creacionExito = false;
        try{
            Conductor conductorNuevo = new Conductor("Carlos Veintemilla", "0705786564");
            creacionExito = true;
        } catch (AssertionError error){
            creacionExito = false;
        }
        assertEquals(true, creacionExito);
    }

    @Test
    public void asignarTaxiLLeno(){
        Taxi taxiNuevo = new Taxi("asadasa", "marca", "aaa");
        boolean estado = conductor.asignarUnTaxi(taxiNuevo);

        assertEquals(true, estado);
    }

    @Test
    public void asignarTaxiVacio(){
        Taxi taxiNuevo = null;
        boolean estado = conductor.asignarUnTaxi(taxiNuevo);

        assertEquals(false, estado);
    }

    @Test
    public void cedulaValida(){
        Conductor nuevoCon = new Conductor("Carlos Veintemilla", "0705786564")
        boolean estado = nuevoCon.verificarCedula();

        assertEquals(true, estado);
    }

    @Test
    public void cedulaInvalidaTamaño(){
        Conductor nuevoCon = new Conductor("Carlos Veintemilla", "070578")
        boolean estado = nuevoCon.verificarCedula();

        assertEquals(false, estado);
    }

    @Test
    public void cedulaInvalidaPrincipio(){
        Conductor nuevoCon = new Conductor("Carlos Veintemilla", "1705786564")
        boolean estado = nuevoCon.verificarCedula();

        assertEquals(false, estado);
    }
}
