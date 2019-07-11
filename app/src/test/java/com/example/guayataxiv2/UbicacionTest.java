package com.example.guayataxiv2;
import org.junit.Test;

import guayataxi.Ubicacion;

import static org.junit.Assert.*;
public class UbicacionTest {

    @Test
    public  void ValidarUbicacion(){
        float longitud = (float)1.2;
        float latitud = (float)1.4;
        float distancia = (float)1.3;
        Ubicacion tmp = new Ubicacion(longitud,latitud,distancia);
        assertEquals((float)2, tmp.calcularPrecio(),(float)2);
    }
}
