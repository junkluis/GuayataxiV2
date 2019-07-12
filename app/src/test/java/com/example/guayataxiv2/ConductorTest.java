package com.example.guayataxiv2;

import org.junit.Before;
import org.junit.Test;

import guayataxi.Conductor;
import guayataxi.Taxi;

import static org.junit.Assert.assertEquals;

public class ConductorTest{
    Taxi taxiPrueba = null;
    Conductor conductorPrueba = null;

    @Before
    public void iniciarPruebas(){
        taxiPrueba = new Taxi("GSG-7849","CHANGAN",8);

        conductorPrueba = new Conductor("Richard Robayo","0928963254");
    }

    @Test
    public void crearConductor(){
        boolean creacionExito = false;
        try{
            Conductor conductorNuevo = new Conductor("Christian Robayo","0928412369");
            creacionExito = true;
        } catch (AssertionError error){
            creacionExito = false;
        }
        assertEquals(true, creacionExito);
    }

    @Test
    public void asignarTaxi(){
        boolean valor = conductorPrueba.asignarUnTaxi(taxiPrueba);
        assertEquals(true,valor);
    }

    @Test
    public void asignarTaxiInexistente(){
        Taxi taxi = null;
        boolean estado = this.conductorPrueba.asignarUnTaxi(taxi);
        assertEquals(false,estado);
    }
    @Test
    public void verificarCedulaValida(){
        Conductor conductor= new Conductor("Mateo Ezequiel", "0947896324");
        boolean validez = conductor.verificarCedula();
        assertEquals(true, validez);
    }
    @Test
    public void verificarCedulaSinCero(){
        Conductor conductor= new Conductor("Cuadrado Emnuek", "9987123321");
        boolean validez = conductor.verificarCedula();
        assertEquals(false, validez);
    }

    @Test
    public void verificarCedulaInvalidaTamano(){
        Conductor conductor= new Conductor("Exe Ricardo", "0654321");
        boolean validez = conductor.verificarCedula();
        assertEquals(false, validez);
    }

}