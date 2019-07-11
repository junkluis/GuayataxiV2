import org.junit.Before;
import org.junit.Test;

import guayataxi.Cliente;
import guayataxi.Billetera;
import guayataxi.Ubicacion;

import static org.junit.Assert.*;

package com.example.guayataxiv2;

public class ClienteTest {

    Billetera billeteraPrueba = null;
    Cliente clientePrueba = null;


    @Before
    public void iniciarPruebas(){
        billeteraPrueba = new Billetera(2);
        billeteraPrueba.agregarFondos(10);
        clientePrueba = new Cliente('Yesenia Murillo','0913852890',billeteraPrueba);
    }

    @Test
    public void crearCliente(){
        boolean creacionExito = false;
        try{
            Cliente clienteByron = new Cliente('Byron Povea','1726273531',billeteraPrueba);
            creacionExito = true;
        } catch (AssertionError error){
            creacionExito = false;
        }
        assertEquals(true, creacionExito);
    }

    @Test
    public void testRegistrarCasa(){
        Ubicacion miCasa = null;
        miCasa = clientePrueba.registrarCasa(-2.1,16.5,500)
        assertNotEquals(null,miCasa)
    }
}
