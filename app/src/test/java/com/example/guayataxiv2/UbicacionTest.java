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
    public void preciocorrectoprimeravalidacion(){

        Ubicacion ubicacion = new Ubicacion(10.6f,10.3f,18.0f);
        float valor = ubicacion.calcularPrecio();
        assertEquals(valor,5.0f,0.5f);

    }

    @Test
    public void preciocorrectosegundavalidacion(){
        Ubicacion ubicacion1 = new Ubicacion(58.0f,10.6f,35.0f);
        float valor = ubicacion1.calcularPrecio();
        assertEquals(valor,10.0f,0.5f);
    }


}
