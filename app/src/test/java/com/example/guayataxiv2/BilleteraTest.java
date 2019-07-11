package com.example.guayataxiv2;

import org.junit.Before;
import org.junit.Test;

import guayataxi.Billetera;

import static org.junit.Assert.*;


public class BilleteraTest {

    Billetera billeteraPrueba = null;
    Billetera billeteraSinFondos = null;



    @Before
    public void iniciarPruebas(){
        billeteraPrueba = new Billetera(2);
        billeteraPrueba.agregarFondos(10);

        billeteraSinFondos = new Billetera(3);
    }

    @Test
    public void crearUnaNuevaBilletera(){
        boolean creacionExito = false;
        try{
            Billetera billeteraLuis = new Billetera(1);
            creacionExito = true;
        } catch (AssertionError error){
            creacionExito = false;
        }
        assertEquals(true, creacionExito);
    }



    @Test
    public void bloquearBilletera(){
        boolean estado = billeteraPrueba.habilitarBilletera(false);
        assertEquals(false, estado);
    }



    @Test
    public void getValorBilletera(){
        String mensajeEsperado = "Su billetera dispone de 10.0";
        String valor = billeteraPrueba.getValorBilletera();
        assertEquals(mensajeEsperado, valor);
    }



    @Test
    public void getValorBilleteraSinValor(){
        String mensajeEsperado = "Su billetera esta vacia";
        String valor = billeteraSinFondos.getValorBilletera();
        assertEquals(mensajeEsperado, valor);
    }

    @Test
    public void agregarFondos(){
        String mensajeEsperado = "Se agregaron los fondos con exito";
        String valor = billeteraSinFondos.agregarFondos(50);
        assertEquals(mensajeEsperado, valor);
    }


    @Test
    public void agregarFondosBilleteraBloqueada(){
        String mensajeEsperado = "La Billetera ha sido bloqueada";
        billeteraSinFondos.habilitarBilletera(false);
        String valor = billeteraSinFondos.agregarFondos(50);

        assertEquals(mensajeEsperado, valor);
    }


    @Test
    public void agregarFondosSuperioresA100(){
        String mensajeEsperado = "Sobre pasa el valor maximo a guardar";
        billeteraSinFondos.habilitarBilletera(true);
        String valor = billeteraSinFondos.agregarFondos(150);

        assertEquals(mensajeEsperado, valor);
    }





}