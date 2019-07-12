package com.example.guayataxiv2;
import org.junit.Test;

import guayataxi.Ubicacion;

import static org.junit.Assert.*;
public class UbicacionTest {

    @Test
    public  void ValidarUbicacion1(){
        float longitud = (float)1.2;
        float latitud = (float)1.4;
        float distancia = (float)1.3;
        Ubicacion tmp = new Ubicacion(longitud,latitud,distancia);
        assertEquals((float)2, tmp.calcularPrecio(),(float)2);
    }

    @Test
    public  void ValidarUbicacion2(){
        float longitud = (float)1.2;
        float latitud = (float)1.4;
        float distancia = (float)21.3;
        Ubicacion tmp = new Ubicacion(longitud,latitud,distancia);
        assertEquals((float)5, tmp.calcularPrecio(),(float)2);
    }

    @Test
    public  void ValidarUbicacion3(){
        float longitud = (float)61.2;
        float latitud = (float)6.4;
        float distancia = (float)35.3;
        Ubicacion tmp = new Ubicacion(longitud,latitud,distancia);
        assertEquals((float)10, tmp.calcularPrecio(),(float)2);
    }

    @Test
    public  void ValidarUbicacion4(){
        float longitud = (float)1.2;
        float latitud = (float)61.4;
        float distancia = (float)31.3;
        Ubicacion tmp = new Ubicacion(longitud,latitud,distancia);
        assertEquals((float)15, tmp.calcularPrecio(),(float)2);
    }
}
