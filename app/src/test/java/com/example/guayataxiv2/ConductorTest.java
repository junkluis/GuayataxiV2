package com.example.guayataxiv2;

import org.junit.Test;

import guayataxi.Conductor;
import guayataxi.Taxi;

import static junit.framework.TestCase.assertTrue;

public class ConductorTest {

    @Test
    public void verificarCedula5(){
        Conductor driver = new Conductor("Steeven Rodriguez", "09191");
        boolean valid = driver.verificarCedula();
        assertTrue(!valid);
    }

    @Test
    public void verificarCedula10(){
        Conductor conductor_1 = new Conductor("Steeven Rodriguez", "0919195446");
        boolean valida = conductor_1.verificarCedula();
        assertTrue(valida);
    }

    @Test
    public void verificarCedulaInvalida1(){
        Conductor conductor_1 = new Conductor("Steeven Rodriguez", "1919195446");
        boolean valida = conductor_1.verificarCedula();
        assertTrue(!valida);
    }
    @Test
    public void asignarTaxi(){
        Conductor driver = new Conductor("Steeven Rodriguez", "0989389265");
        boolean valida = driver.verificarCedula();
        Taxi taxi = new Taxi("GRA7116", "Mazda", 1);
        boolean validaTaxi = driver.asignarUnTaxi(taxi);
        assertTrue(validaTaxi);
    }

    @Test
    public void asignarTaxiNulo(){
        Conductor driver = new Conductor("Steeven Rodriguez", "0989389265");
        //boolean valida = driver.verificarCedula();
        Taxi taxi = null;

        boolean validaTaxi = driver.asignarUnTaxi(taxi);
        assertTrue(!validaTaxi);
    }


}