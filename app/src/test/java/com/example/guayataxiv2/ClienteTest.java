package com.example.guayataxiv2;

import org.junit.Before;
import org.junit.Test;

import guayataxi.Billetera;
import guayataxi.Cliente;
import guayataxi.Ubicacion;

import static org.junit.Assert.assertEquals;

public class ClienteTest{

    Billetera billeteraPrueba = null;

    Cliente clientePrueba = null;
    Ubicacion ubicacion = null;


    @Before
    public void iniciarPruebas(){
        billeteraPrueba = new Billetera(2);
        billeteraPrueba.agregarFondos(10);
        clientePrueba = new Cliente("Pedro","09200558696",billeteraPrueba);

    }

    @Test
    public void crearUnaNuevoCliente(){
        boolean creacionExito = false;
        try{
            Cliente clienteLuis = new Cliente("Luis","09200558696",billeteraPrueba);
            creacionExito = true;
        } catch (AssertionError error){
            creacionExito = false;
        }
        assertEquals(true, creacionExito);
    }

    @Test
    public void registrarCasa(){
        boolean creacionExito = false;
        try{
            clientePrueba.registrarCasa(22,25,12);
            creacionExito = true;
        } catch (AssertionError error){
            creacionExito = false;
        }
        assertEquals(true, creacionExito);
    }






}
