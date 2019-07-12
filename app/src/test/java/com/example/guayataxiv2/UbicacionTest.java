package com.example.guayataxiv2;
import guayataxi.Cliente;
import guayataxi.Ubicacion;
import guayataxi.Conductor;
import guayataxi.Taxi;
import org.junit.Before;
import org.junit.Test;
import guayataxi.Billetera;
import static org.junit.Assert.*;
import static junit.framework.TestCase.assertTrue;


public class UbicacionTest {



    @Test
    public void crearubicacion(){
        boolean creacionExito = false;
        try{
            Ubicacion ubicacion1 = new Ubicacion(2.0f,2.2f,4.9f);
            creacionExito = true;
        } catch (AssertionError error){
            creacionExito = false;
        }
        assertEquals(true, creacionExito);
    }

    @Test
    public void preciocorrecto(){
        String mensajeEsperado = "Se agregaron los fondos con exito";
        ubicacion =new Ubicacion(3.2f,4.6f,5.9f);
        string valorcorrecto = ubicacion.calcularPrecio();
        assertEquals(mensajeEsperado,valorcorrecto);


    }


}
