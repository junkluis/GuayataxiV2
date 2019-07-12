package com.example.guayataxiv2;

import org.junit.Before;
import org.junit.Test;

import guayataxi.Billetera;
import guayataxi.Ubicacion;
import guayataxi.Cliente;

import static org.junit.Assert.*;


public class ClienteTest {

    Billetera billeteraPrueba = null;
    Cliente clientePrueba = null;
    Cliente clienteSinFondos = null;

    @Before
    public void iniciarPruebas(){
        billeteraPrueba = new Billetera(2);
        billeteraPrueba.agregarFondos(10);

        clientePrueba = new Cliente("Jose Masson", "0931753354", billeteraPrueba);
    }

    @Test
    public void crearNuevoCliente(){
        boolean creacionExito = false;
        try{
            Billetera billeteraJose = new Billetera(1);
            Cliente clienteJose = new Cliente("Jose Masson", "0931753354", billeteraJose);
            creacionExito = true;
        } catch (AssertionError error){
            creacionExito = false;
        }
        assertEquals(true, creacionExito);
    }

    @Test
    public void registrarCasa() {
        boolean registroExito = false;
        try {
            Ubicacion casa = clientePrueba.registrarCasa(-2.3F, -79.3F, 20F);
            registroExito = true;
        } catch (AssertionError error){
            registroExito = false;
        }
        assertEquals(true, registroExito);
    }

}
