package com.example.guayataxiv2;

import com.example.guayataxiv2.guayataxi.Conductor;
import com.example.guayataxiv2.guayataxi.Taxi;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConductorTest {

    Conductor conductorPrueba;

    @Before
    public void iniciarPruebas() {
        conductorPrueba = new Conductor("Miguel Sanchez", "0927724187");
    }

    @Test
    public void asignarTaxiNulo(){
        assertEquals(false, conductorPrueba.asignarUnTaxi(null));
    }

    @Test
    public void asignarTaxiValido(){
        Taxi taxi = new Taxi("GMS-468", "Hyundai", 1);
        assertEquals(true, conductorPrueba.asignarUnTaxi(taxi));
    }

    @Test
    public void verificarCedulaDiferenteLongitud(){
        conductorPrueba = new Conductor("Miguel Sanchez", "927724187");
        assertEquals(false, conductorPrueba.verificarCedula());
    }

    @Test
    public void verificarCedulaNoIniciadaEnCero(){
        conductorPrueba = new Conductor("Miguel Sanchez", "1927724187");
        assertEquals(false, conductorPrueba.verificarCedula());
    }

    @Test
    public void verificarCedulaValida(){
        conductorPrueba = new Conductor("Miguel Sanchez", "0927724187");
        assertEquals(true, conductorPrueba.verificarCedula());
    }
}
