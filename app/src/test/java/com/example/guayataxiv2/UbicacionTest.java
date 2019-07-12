package com.example.guayataxiv2;

import org.junit.Before;
import org.junit.Test;

import guayataxi.Ubicacion;

import static org.junit.Assert.*;

public class UbicacionTest {

    private Ubicacion u1 = null;
    private Ubicacion u2 = null;
    private Ubicacion u3 = null;
    private Ubicacion u4 = null;
    private Ubicacion u5 = null;

    @Before
    public void iniciarPruebas() {
        u1 = new Ubicacion(20F, 30F, -1);
        u2 = new Ubicacion(20F, 30F, 5);
        u3 = new Ubicacion(20F, 30F, 29.9F);
        u4 = new Ubicacion(50.01F, 30F, 30.01F);
        u5 = new Ubicacion(30.01F, 51.01F, 31F);
    }

    @Test
    public void calcularPrecioDistanciaNegativa() {
        float precio = u1.calcularPrecio();
        assertTrue(precio == 0);
    }

    @Test
    public void calcularPrecioDistanciaC1() {
        float precio = u2.calcularPrecio();
        assertTrue(precio == 2);
    }

    @Test
    public void calcularPrecioDistanciaC2() {
        float precio = u3.calcularPrecio();
        assertTrue(precio == 5);
    }

    @Test
    public void calcularPrecioDistanciaC3() {
        float precio = u4.calcularPrecio();
        assertTrue(precio == 10);
    }

    @Test
    public void calcularPrecioDistanciaC4() {
        float precio = u5.calcularPrecio();
        assertTrue(precio == 15);
    }

}
