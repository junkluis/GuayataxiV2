package com.example.guayataxiv2;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import guayataxi.Taxi;

public class TaxiTest {

    Taxi taxiSinColor = null;

    @Before
    public void initTest() {
        this.taxiSinColor = new Taxi(
                "GYE1900",
                "Volvo",
                101
        );
    }

    @Test
    public void testSettearColorInvalido() {
        String mensaje = this.taxiSinColor.setColor("Violeta");
        assertEquals("Debe seleccionar un color dentor de la lista posibles", mensaje);
    }
}
