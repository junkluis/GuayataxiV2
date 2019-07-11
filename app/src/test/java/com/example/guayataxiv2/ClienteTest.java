import org.junit.Before;
import org.junit.Test;

import guayataxi.Cliente;
import guayataxi.Billetera;

import static org.junit.Assert.*;

package com.example.guayataxiv2;

public class ClienteTest {

    Billetera billeteraPrueba = null;


    @Before
    public void iniciarPruebas(){
        billeteraPrueba = new Billetera(2);
        billeteraPrueba.agregarFondos(10);
    }

    @Test
    public void crearCliente(){
        boolean creacionExito = false;
        try{
            Cliente clienteByron = new Cliente('Byron Povea','1726873431',billeteraPrueba);
            creacionExito = true;
        } catch (AssertionError error){
            creacionExito = false;
        }
        assertEquals(true, creacionExito);
    }
}
