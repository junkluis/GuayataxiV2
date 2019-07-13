package com.example.guayataxiv2;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import guayataxi.Conductor;
import guayataxi.Taxi;

public class ConductorTest {

    Conductor conductorPrueba, conductorNull = null;
    Taxi taxiPrueba, taxiNull = null;

    @Before
    public void iniciarPruebas() {
        conductorPrueba = new Conductor("John Cuesta", "0806335896");
    }

    @Test
    public void asignarConductorPruebaTaxiPrueba() {
        conductorPrueba.asignarUnTaxi(taxiPrueba);
    }
/*
    @Test
    public void asignarConductorNullTaxiPrueba() {
        conductorNull.asignarUnTaxi(taxiPrueba);
    }
*/
    @Test
    public void asignarConductorPruebaTaxiNull() {
        conductorPrueba.asignarUnTaxi(taxiNull);
    }
/*
    @Test
    public void asignarConductorNullTaxiNull() {
        conductorNull.asignarUnTaxi(taxiNull);
    }
*/
    @Test
    public void verificarCedulaConductorPrueba() {
        conductorPrueba.verificarCedula();
    }
/*
    @Test
    public void verificarCedulaConductorNull() {
        conductorNull.verificarCedula();
    }
*/
}
