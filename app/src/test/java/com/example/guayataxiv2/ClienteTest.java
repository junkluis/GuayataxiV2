package com.example.guayataxiv2;

import org.junit.Before;
import org.junit.Test;

import guayataxi.Billetera;
import guayataxi.Cliente;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


public class ClienteTest {
    Billetera billeteraPrueba = null;

    @Before
    public void iniciarPruebas(){
        billeteraPrueba = new Billetera(2);
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


}
