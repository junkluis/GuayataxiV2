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

	@Before
    public void iniciarPruebas(){
        clientePrueba = new Cliente("Sebastian Ramirez", "0954225447", billetera);
    }


	@Test
    public void crearUnNuevoCliente(){
        boolean creacionExito = false;
        try{
        	billeteraPrueba = new Billetera(1);
            clientePrueba = new Cliente("Sebastian Ramirez", "0954225447", billeteraPrueba);
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
        	ubicacionPrueba = new Ubicacion(2.3456456, 2.3456456, 450.26);
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
        	billeteraPrueba = new Billetera(1);
            clientePrueba = new Cliente("Sebastian Ramirez", "0954225447", billeteraPrueba);
        	ubicacionPrueba = clientePrueba.registrarCasa(2.3456456, 2.3456456, 450.26)
            creacionExito = true;
        } catch (AssertionError error){
            creacionExito = false;
        }
        assertEquals(true, creacionExito);
    }

}
