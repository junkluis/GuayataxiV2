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

public class ConductorTest {

    Taxi taxi = null;
    Conductor conductor=null;
    Ubicacion ubicacion1=null;


    @Before
    public void Pruebasconductor(){
        taxi = new Taxi("GOV456","CHEVROLET",12);
        conductor =new Conductor("Daniel Fernando Saigua Labre","0952475688");


    }

    @Test
    public void crearconductor(){
        boolean creacionExito = false;
        try{
            Conductor conductor = new Conductor("Daniela Mera","0935234519");
            creacionExito = true;
        } catch (AssertionError error){
            creacionExito = false;
        }
        assertEquals(true, creacionExito);
    }



    @Test
    public void comprobarcedula(){
        conductor =new Conductor("Daniel Fernando Saigua Labre","0952475688");
        boolean valorcorrecto = conductor.verificarCedula();
        assertTrue(valorcorrecto);
    }

    @Test
    public void asignarTaxi(){
        boolean valor = conductor.asignarUnTaxi(taxi);
        assertEquals(true,valor);
    }

    @Test
    public void comprobarcedulainvalida(){
        Conductor conductor= new Conductor("Daniel Saigua Labre", "952475689");
        boolean valor = conductor.verificarCedula();
        assertFalse(valor);
    }

    @Test
    public void comprobarcedulainvalidamenosdigitos(){
        Conductor conductor= new Conductor("Daniel Saigua Labre", "09524756");
        boolean valor = conductor.verificarCedula();
        assertFalse(valor);
    }

}
