package com.example.guayataxiv2;

import org.junit.Test;

import guayataxi.Conductor;
import guayataxi.Taxi;

import static junit.framework.TestCase.assertTrue;

public class ConductorTest {

    @Test
    public void verificarCedulaInvalida5digitos(){
        Conductor conductor_1 = new Conductor("Mauricio Leiton Lazaro", "09893");
        boolean valida = conductor_1.verificarCedula();
        assertTrue(!valida);
    }

    @Test
    public void verificarCedulaInvalida10digitos0Inicial(){
        Conductor conductor_1 = new Conductor("Mauricio Leiton Lazaro", "0989389265");
        boolean valida = conductor_1.verificarCedula();
        assertTrue(valida);
    }

    @Test
    public void verificarCedulaInvalida10digitos1Inicial(){
        Conductor conductor_1 = new Conductor("Mauricio Leiton Lazaro", "1989389265");
        boolean valida = conductor_1.verificarCedula();
        assertTrue(!valida);
    }

    @Test
    public void asignarTaxiNulo(){
        Conductor conductor_1 = new Conductor("Mauricio Leiton Lazaro", "0989389265");
        boolean valida = conductor_1.verificarCedula();
        Taxi taxi = null;
        boolean validaTaxi = conductor_1.asignarUnTaxi(taxi);
        assertTrue(!validaTaxi);
    }

    @Test
    public void asignarTaxiOk(){
        Conductor conductor_1 = new Conductor("Mauricio Leiton Lazaro", "0989389265");
        boolean valida = conductor_1.verificarCedula();
        Taxi taxi = new Taxi("GYA1223", "Mazda", 1);
        boolean validaTaxi = conductor_1.asignarUnTaxi(taxi);
        assertTrue(validaTaxi);
    }
}
