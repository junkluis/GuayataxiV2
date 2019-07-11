package com.example.guayataxiv2;
import org.junit.Before;
import org.junit.Test;

import guayataxi.Billetera;
import guayataxi.Ubicacion;
import guayataxi.Cliente;

import static org.junit.Assert.*;

public class ClienteTest {
    CLiente cliente = null;
    Ubicacion ubicacion = null;
    Billetera billetera = null;

    @Before
    public void iniciarPruebas(){
        billetera = new Billetera(2);
        billetera.agregarFondos(10);

        cliente = new Cliente("Carlos Veintemilla","0705786564",billetera);
        billeteraSinFondos = new Billetera(3);
    }

    @Test
    public void agregarUnaUbicacion(){
        boolean creacionExito = false;
        try{
            cliente.registrarCasa(1.1, 1.1, 10.1);
            creacionExito = true;
        } catch (AssertionError error){
            creacionExito = false;
        }
        assertEquals(true, creacionExito);
    }

    @Test
    public void crearNuevoCliente(){
        boolean creacionExito = false;
        try{
            Billetera billeteraNueva = new Billetera(2)
            Cliente clienteNuevo =new Cliente("Carlos Veintemilla","0705786564",billeteraNueva);
            creacionExito = true;
        } catch (AssertionError error){
            creacionExito = false;
        }
        assertEquals(true, creacionExito);
    }
}
