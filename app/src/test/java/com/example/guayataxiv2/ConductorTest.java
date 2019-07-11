package com.example.guayataxiv2;

public class ConductorTest {

    @Test
    public void verificarCedulaInvalida5digitos(){
        Coductor conductor_1 = new Coductor("Mauricio Leiton Lazaro", "09893");
        boolean valida = conductor_1.verificarCedula();
        assertTrue(!valida);
    }

    @Test
    public void verificarCedulaInvalida10digitos0Inicial(){
        Coductor conductor_1 = new Coductor("Mauricio Leiton Lazaro", "0989389265");
        boolean valida = conductor_1.verificarCedula();
        assertTrue(valida);
    }

    @Test
    public void verificarCedulaInvalida10digitos1Inicial(){
        Coductor conductor_1 = new Coductor("Mauricio Leiton Lazaro", "1989389265");
        boolean valida = conductor_1.verificarCedula();
        assertTrue(!valida);
    }

    @Test
    public void asignarTaxiNulo(){
        Coductor conductor_1 = new Coductor("Mauricio Leiton Lazaro", "0989389265");
        boolean valida = conductor_1.verificarCedula();
        Taxi taxi = null;
        boolean validaTaxi = conductor_1.asignarUnTaxi(taxi);
        assertTrue(!validaTaxi);
    }

    @Test
    public void asignarTaxiOk(){
        Coductor conductor_1 = new Coductor("Mauricio Leiton Lazaro", "0989389265");
        boolean valida = conductor_1.verificarCedula();
        Taxi taxi = new Taxi("GYA1223", "Mazda", 1);
        boolean validaTaxi = conductor_1.asignarUnTaxi(taxi);
        assertTrue(validaTaxi);
    }
}
