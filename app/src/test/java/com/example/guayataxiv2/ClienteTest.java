package com.example.guayataxiv2;


import org.junit.Before;
import org.junit.Test;

import guayataxi.Cliente;
import guayataxi.Billetera;
import guayataxi.Ubicacion;

import static org.junit.Assert.*;


public class ClienteTest {

    Cliente clientePrueba = null;
    Billetera billeteraPrueba = null;
    Ubicacion ubicacionPrueba = null;

    /*@Before
    public void iniciarPruebas(){
        billeteraPrueba = new Billetera(1);
        clientePrueba = new Cliente("Sebastian Ramirez", "0954225447", billeteraPrueba);
        ubicacionPrueba = new Ubicacion(2.34f, 2.34f, 450.26f);
    }

    @Test
    public void crearUnNuevoCliente(){
        boolean creacionExito = false;
        try{
            Cliente clienteSeba = new Cliente("Sebastian Ramirez", "0954225447", billeteraPrueba);
            creacionExito = true;
        } catch (AssertionError error){
            creacionExito = false;
        }
        assertEquals(true, creacionExito);
    }

    @Test
    public void crearUnaNuevaUbicacion(){
        boolean creacionExito = false;
        try{
            Ubicacion ubicacion123 = new Ubicacion(2.31f, 2.31f, 450.21f);
            creacionExito = true;
        } catch (AssertionError error){
            creacionExito = false;
        }
        assertEquals(true, creacionExito);
    }

    @Test
    public void registrarCasa(){
        boolean registroExito = false;
        try{
            Ubicacion ubicacionCasa = clientePrueba.registrarCasa(2.35f, 2.34f, 450.26f);
            registroExito = true;
        } catch (AssertionError error){
            registroExito = false;
        }
        assertEquals(true, registroExito);
    }*/

}
