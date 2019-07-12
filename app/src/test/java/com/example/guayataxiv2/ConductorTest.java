package com.example.guayataxiv2;

import org.junit.Before;
import org.junit.Test;

import guayataxi.Conductor;

import static org.junit.Assert.*;

public class ConductorTest {

    Conductor conductorPruebaValido = null;
    Conductor conductorNoValido = null;
    Conductor conductorNoValido2 = null;

    @Before
    public void iniciarPruebas() {
        conductorPruebaValido = new Conductor("José Massón", "0932753354");
        conductorNoValido = new Conductor("José Massón", "093275335");
        conductorNoValido2 = new Conductor("José Massón", "1931753354");
    }

    @Test
    public void crearConductor() {
        boolean creacionExito = false;
        try {
            Conductor conductor = new Conductor("José Luis Massón Pinzón", "0931753354");
            creacionExito = true;
        } catch (AssertionError error) {
            creacionExito = false;
        }
        assertTrue(creacionExito);
    }

    @Test
    public void verificarCedulaValida() {
        boolean cedulaValida = conductorPruebaValido.verificarCedula();
        assertTrue(cedulaValida);
    }

    @Test
    public void verificarCedulaNoValidaMenorLongitud() {
        boolean cedulaValida = conductorNoValido.verificarCedula();
        assertTrue(!cedulaValida);
    }

    @Test
    public void verificarCedulaNoValidaPrimerCaracter() {
        boolean cedulaValida = conductorNoValido2.verificarCedula();
        assertTrue(!cedulaValida);
    }
}
