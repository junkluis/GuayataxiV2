package com.example.guayataxiv2;

import org.junit.Before;
import org.junit.Test;

import guayataxi.Billetera;

import static org.junit.Assert.*;

public class ClienteTest {

    Cliente clientePrueba = null;
    Billetera billetera = null;

    @Before
    public void iniciarPruebas() {
        clientePrueba = new Cliente("John Cuesta", "0806335896", billetera);

        clientePrueba.registrarCasa(-2.125556, -79.846667, 52);
    }

    @Test
    public void crearNuevoCliente() {
        boolean creacionExito = false;
        try{
            Cliente clienteNuevo = new Cliente("Jose Cueva", "0606435156", billetera);
            creacionExito = true;
        } catch (AssertionError error){
            creacionExito = false;
        }
        assertEquals(true, creacionExito);
    }


    @Test
    public void crearClienteRepetido() {
        boolean creacionExito = false;
        try{
            Cliente clienteRepetido = new Cliente("Jose Cueva", "0606435156", billetera);
            creacionExito = true;
        } catch (AssertionError error){
            creacionExito = false;
        }
        assertEquals(true, creacionExito);
    }


    @Test
    public void registrarNuevaCasa() {
        clienteNuevo.registrarCasa(-3, -80, 60);
    }

}
