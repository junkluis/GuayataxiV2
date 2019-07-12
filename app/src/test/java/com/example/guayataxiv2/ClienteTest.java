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
    public void agregarUbicacionAlCliente(){
        Ubicacion ubicacionPrueba = new Ubicacion(0.8f,0.6f,0.45f);
        ubicacionPrueba.setDescripcion("Mi Casa");
        Ubicacion ubicacion = clienteCreado.registrarCasa(0.8f,0.6f,0.45f);


        assertEquals(ubicacionPrueba, ubicacion);
    }
}
