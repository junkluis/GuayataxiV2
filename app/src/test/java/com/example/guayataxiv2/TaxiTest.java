package com.example.guayataxiv2;

import org.junit.Before;
import org.junit.Test;

import guayataxi.Billetera;
import guayataxi.Cliente;
import guayataxi.Ubicacion;
import guayataxi.Conductor;
import guayataxi.Taxi;

import static org.junit.Assert.*;

public class TaxiTest {
    Taxi taxiPrueba = null;

    @Before
    public void iniciarPruebas(){
        taxiPrueba = new Taxi("GSG-7978","KIA",1);
    }

    @Test
    public void crearUnNuevoTaxi(){
        boolean creacionExito = false;
        try{
            Taxi taxiNuevo = new Taxi("GSG-7978","KIA",1);
            creacionExito = true;
        } catch (AssertionError error){
            creacionExito = false;
        }
        assertEquals(true, creacionExito);
    }

    @Test
    public void setColorPrueba(){
        String mensaje = "Al taxi se le asigno el color: Rojo";
        String mensajePrueba = taxiPrueba.setColor("Rojo");

        assertEquals(mensaje,mensajePrueba);
    }
}
