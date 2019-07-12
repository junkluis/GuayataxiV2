package com.example.guayataxiv2;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import guayataxi.Ubicacion;

public class UbicacionTest {
    Ubicacion ubicacion = null;

    @Before
    public void initTest() {
        this.ubicacion = new Ubicacion(1.34534f, 0.7234234f, 15f);

    }

    @Test
    public void testCalcularPrecio() {
        float costo = this.ubicacion.calcularPrecio();
        assertEquals(5f, costo, 0);
    }
}
