package com.example.guayataxiv2;

import org.junit.Before;
import org.junit.Test;

import guayataxi.Billetera;
import guayataxi.Cliente;
import guayataxi.Ubicacion;

import static org.junit.Assert.*;

public class ClienteTest {

    Billetera billeteraPrueba = null;
    Cliente clienteCreado = null;

    @Before
    public void iniciarPruebas(){
        billeteraPrueba = new Billetera(2);
        billeteraPrueba.agregarFondos(10);

        clienteCreado = new Cliente("Leonardo Castro","0926385998",billeteraPrueba);
    }

    @Test
    public void crearUnNuevoCliente(){
        boolean creacionExito = false;
        try{
            Cliente clienteLeonardo = new Cliente("Leonardo Castro","0926385998",billeteraPrueba);
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
            Ubicacion ubicacion= this.clienteCreado.registrarCasa(5, 55, 45);

            registroExito = true;
        } catch (AssertionError error){
            registroExito = false;
        }
        assertEquals(true, registroExito);

    }
}
