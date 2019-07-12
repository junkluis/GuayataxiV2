package com.example.guayataxiv2;

import com.example.guayataxiv2.guayataxi.Billetera;
import com.example.guayataxiv2.guayataxi.Cliente;
import com.example.guayataxiv2.guayataxi.Ubicacion;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class ClienteTest {

    Cliente clientePrueba;

    @Before
    public void iniciarPruebas(){
        Billetera billetera = new Billetera(1);
        clientePrueba = new Cliente("Miguel Sanchez", "0927724187", billetera);
    }

    @Test
    public void registrarUbicacion(){
        float latitud = 2.3243f;
        float longitud = -79.434f;
        float distancia = 10f;

        Ubicacion ubicacion = new Ubicacion(latitud, longitud, distancia);
        Ubicacion ubicacionDevuelta = clientePrueba.registrarCasa(latitud, longitud, distancia);
        assertEquals(ubicacion, ubicacionDevuelta);
    }

}
