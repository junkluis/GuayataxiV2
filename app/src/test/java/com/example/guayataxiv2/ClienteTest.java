package com.example.guayataxiv2;


import org.junit.Before;
import org.junit.Test;

import guayataxi.Cliente;
import guayataxi.Billetera;

import static org.junit.Assert.*;


public class ClienteTest {


	@Before
    public void iniciarPruebas(){
        Cliente clienteSeba = new Cliente("Sebastian Ramirez", "0954225447", billetera);
    }


	@Test
    public void crearUnaNuevoCliente(){
        boolean creacionExito = false;
        try{
        	Billetera billetera = new Billetera(1);
            Cliente clienteSeba = new Cliente("Sebastian Ramirez", "0954225447", billetera);
            creacionExito = true;
        } catch (AssertionError error){
            creacionExito = false;
        }
        assertEquals(true, creacionExito);
    }

}
