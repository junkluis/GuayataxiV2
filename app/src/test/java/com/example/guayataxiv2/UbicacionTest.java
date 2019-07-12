package com.example.guayataxiv2;

import com.example.guayataxiv2.guayataxi.Ubicacion;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class UbicacionTest {

    Ubicacion ubicacionTest;

    @Before
    public void iniciarPruebas() {
        ubicacionTest = new Ubicacion(2.545f, -79.4343f, 11f);
    }

    @Test
    public void calcularPrecio2() {
        ubicacionTest = new Ubicacion(2.323f, -79.3234f, 4);
        float precioCalculado = ubicacionTest.calcularPrecio();
        assertEquals(2f, precioCalculado, 0);
    }

    @Test
    public void calcularPrecio5() {
        ubicacionTest = new Ubicacion(2.323f, -79.3234f, 20);
        float precioCalculado = ubicacionTest.calcularPrecio();
        assertEquals(5f, precioCalculado, 0);
    }

    @Test
    public void calcularPrecio10() {
        ubicacionTest = new Ubicacion(80f, -79.3234f, 35);
        float precioCalculado = ubicacionTest.calcularPrecio();
        assertEquals(10f, precioCalculado, 0);
    }

    @Test
    public void calcularPrecio15() {
        ubicacionTest = new Ubicacion(2.5465f, 80f, 35);
        float precioCalculado = ubicacionTest.calcularPrecio();
        assertEquals(15f, precioCalculado, 0);
    }



}
