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
        taxiPrueba = new Taxi('GSG-7978','KIA',1);

        conductorPrueba = new Conductor('Leonardo Castro','0926385998');
    }

    @Test
    public void crearUnNuevoConductor(){
        boolean creacionExito = false;
        try{
            Conductor conductorNuevo = new Conductor('Leonardo Castro','0926385998');
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
}
