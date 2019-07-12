package com.example.guayataxiv2;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

import guayataxi.Conductor;
import guayataxi.Taxi;

public class ConductorTest {

    Conductor conductorSinTaxi = null;
    Conductor conductorCedulaInvalida = null;

    @Before
    public void initTest() {
        this.conductorSinTaxi = new Conductor(
                "Javier Antuarez",
                "0922190673"
        );
        this.conductorCedulaInvalida = new Conductor(
                "Javier Antuarez",
                "9922190673"
        );
    }


    @Test
    public void testAsignarTaxi(){
        Taxi taxi = new Taxi(
                "GYE18990",
                "Mercedes",
                100
        );

        boolean asigno = this.conductorSinTaxi.asignarUnTaxi(taxi);
        assertEquals(true, asigno);
    }

    @Test
    public void testVerificarCedula(){

        boolean cedulaValida = this.conductorCedulaInvalida.verificarCedula();
        assertEquals(false, cedulaValida);
    }
}
