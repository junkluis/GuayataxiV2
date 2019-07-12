package com.example.guayataxiv2;

import org.junit.Before;
import org.junit.Test;

import guayataxi.Billetera;
import guayataxi.Cliente;
import guayataxi.Ubicacion;

import static org.junit.Assert.*;
public class ClienteTest {
    Cliente clientePrueba = null;
    Ubicacion ubicacionPrueba = null;
    Billetera billetera = null;

    @Before
    public void iniciarTest(){
        this.billetera = new Billetera(6);
        this.clientePrueba = new Cliente("Carlos Garzon", "0999999999",new Billetera(5));
    }

    @Test
    public void crearUnNuevoCliente(){
        boolean creacionExito = false;
        try{
            Cliente nuevoCliente = new Cliente("Carlos Garzon", "0999999999",new Billetera(5));
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
            Ubicacion ubicacion= this.clientePrueba.registrarCasa(5, 55, 45);

            registroExito = true;
        } catch (AssertionError error){
            registroExito = false;
        }
        assertEquals(true, registroExito);

    }
}
