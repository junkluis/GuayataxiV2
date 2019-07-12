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
        Billetera billetera = new Billetera(2);
        this.cliente = new Cliente("Steeven T", "0919195446", billetera);
    }

    @Test
    public void registrarCasa(){
        Ubicacion home = this.cliente.registrarCasa(15.2f,13.2f,16.2f);
        assertNotNull(home);
    }
}