package com.example.guayataxiv2;

import org.junit.Before;
import org.junit.Test;

import guayataxi.Ubicacion;

public class UbicacionTest {

    Ubicacion ubicacionPrueba, ubicacionNull = null;

    @Before
    public void iniciarPruebas() {
        ubicacionPrueba = new Ubicacion(-2, -79, 52);
    }

    @Test
    public void calcularPrecioUbicacionPrueba() {
        ubicacionPrueba.calcularPrecio();
    }

    @Test
    public void calcularPrecioUbicacionNull() {
        ubicacionNull.calcularPrecio();
    }

    @Test
    public void descripcionUbicacionPrueba() {
        ubicacionPrueba.setDescripcion("Ubicación de prueba");
    }

    @Test
    public void descripcionUbicacionNull() {
        ubicacionNull.setDescripcion("Ubicación nula");
    }

}
