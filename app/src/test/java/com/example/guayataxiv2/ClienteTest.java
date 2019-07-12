package com.example.guayataxiv2;

import org.junit.Before;
import org.junit.Test;

import guayataxi.Cliente;
import guayataxi.Billetera;
import guayataxi.Ubicacion;

import static org.junit.Assert.*;


public class ClienteTest {

    public Cliente cliente = null;

    @Before
    public void iniciarPruebas(){
        Billetera billeteraPrueba = new Billetera(2);
        this.cliente = new Cliente("Mauricio Leiton Lazaro", "0989389265", billeteraPrueba);
    }

    @Test
    public void registrarCasa(){
        Ubicacion miCasa = this.cliente.registrarCasa(12.2f,12.2f,12.2f);
        assertTrue(miCasa instanceof Ubicacion);
    }
}
