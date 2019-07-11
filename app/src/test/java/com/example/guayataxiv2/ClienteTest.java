package com.example.guayataxiv2;

import org.junit.Before;
import org.junit.Test;

import guayataxi.Billetera;
import guayataxi.Cliente;
import guayataxi.Ubicacion;

import static org.junit.Assert.*;

public class ClienteTest {
    @Test
    public void RegistratCasaIntegerTest(){
        Billetera billetera = new Billetera(5);
        Cliente cliente = new Cliente("Jonathan", "125166116",billetera);
        float longitud = 1;
        float latitud = 14;
        float distancia = 10;
        Ubicacion tmp = new Ubicacion(longitud,latitud,distancia);
        tmp.setDescripcion("Mi Casa");
        assertEquals(tmp.getClass(), cliente.registrarCasa(longitud,latitud,distancia).getClass());
    }

    @Test
    public void RegistratCasaFloatTest(){
        Billetera billetera = new Billetera(5);
        Cliente cliente = new Cliente("Jonathan", "125166116",billetera);
        float longitud = Float.parseFloat("1.2");
        float latitud = Float.parseFloat("1.4");
        float distancia = Float.parseFloat("1.0");
        Ubicacion tmp = new Ubicacion(longitud,latitud,distancia);
        tmp.setDescripcion("Mi Casa");
        assertEquals(tmp.getClass(), cliente.registrarCasa(longitud,latitud,distancia).getClass());
    }


}
