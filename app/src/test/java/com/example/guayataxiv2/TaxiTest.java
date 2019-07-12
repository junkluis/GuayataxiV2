package com.example.guayataxiv2;

import com.example.guayataxiv2.guayataxi.Taxi;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TaxiTest {

    Taxi taxiPrueba;

    @Before
    public void iniciarPruebas(){
        taxiPrueba = new Taxi("GMS-468", "Hyundai", 1);
    }

    @Test
    public void setColorValido(){
        String color = "Rojo";
        String resultado = taxiPrueba.setColor(color);
        assertEquals("Al taxi se le asigno el color: " + color, resultado);
    }

    @Test
    public void setColorNoValido(){
        String color = "Azul";
        String resultado = taxiPrueba.setColor(color);
        assertEquals("Debe seleccionar un color dentor de la lista posibles", resultado);
    }


}
