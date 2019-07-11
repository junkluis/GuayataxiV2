package com.example.guayataxiv2;

import org.junit.Before;
import org.junit.Test;

import guayataxi.Billetera;
import guayataxi.Cliente;
import guayataxi.Ubicacion;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;


public class ClienteTest {
    private Billetera billeteraPrueba = null;
    private Cliente clientePrueba = null;

    @Before
    public void iniciarPruebas(){
        billeteraPrueba = new Billetera(2);
        clientePrueba = new Cliente("Nombre Completo", "0922503097", billeteraPrueba);
        billeteraPrueba.agregarFondos(10);
    }

    @Test
    public void crearNuevoCliente(){
        boolean creacionExito = false;
        String nombre = "jose fuentes";
        String cedula = "09224509";
        try{
            Cliente cliente = new Cliente(nombre, cedula, billeteraPrueba);
            creacionExito = true;
        } catch (AssertionError error){
            creacionExito = false;
        }
        assertTrue(creacionExito);

    }

    @Test
    public void registrarCasaTest(){
        boolean registroExitoso;
        try{
            clientePrueba.registrarCasa((float) 30, (float)30, (float)30);
            registroExitoso = true;
        } catch (AssertionError error){
            registroExitoso = false;
        }
        assertTrue(registroExitoso);
    }

}
