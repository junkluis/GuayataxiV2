package com.example.guayataxiv2;
import org.junit.Before;
import org.junit.Test;

import guayataxi.Taxi;


import static org.junit.Assert.assertEquals;

public class TaxiTest {
    Taxi taxi = null;
    @Before
    public void iniciarTest(){
        this.taxi = new Taxi("aaaa","bbbb",1);

    }
    @Test
    public void crearTaxiNuevo(){
        boolean creacionExito = false;
        try{
            Taxi nuevoCliente = new Taxi("aaaa","bbbb",1);
            creacionExito = true;
        } catch (AssertionError error){
            creacionExito = false;
        }
        assertEquals(true, creacionExito);
    }

    @Test
    public void asignarColorValido(){
        String respuesta = this.taxi.setColor("Rojo");
        assertEquals("Al taxi se le asigno el color: Rojo" ,respuesta);
    }

    @Test
    public void asignarColorInvalido(){
        String respuesta = this.taxi.setColor("Plateado");
        assertEquals("Debe seleccionar un color dentor de la lista posibles" ,respuesta);
    }
}
