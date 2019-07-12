package com.example.guayataxiv2;

import org.junit.Before;
import org.junit.Test;


import static org.junit.Assert.*;

import guayataxi.Billetera;
import guayataxi.Cliente;
import guayataxi.Ubicacion;

public class ClienteTest {

    Cliente clienteSinCasa = null;
    Billetera billetera = null;

    @Before
    public void initTest() {
         this.billetera = new Billetera(1);
         this.clienteSinCasa = new Cliente(
                 "Jose Luis Alvarez",
                 "0922180674",
                 this.billetera
         );
    }

    @Test
    public void testRegistrarCasa() {
        Ubicacion casa = this.clienteSinCasa.registrarCasa(1.5345f, 1.3424f, 15f);

        assertNotEquals(null, casa);

    }
}
