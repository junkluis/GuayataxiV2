package com.example.guayataxiv2;
import org.junit.Before;
import org.junit.Test;

import guayataxi.Billetera;
import guayataxi.Cliente;
import guayataxi.Ubicacion;

import static org.junit.Assert.*;


public class ClienteTest {


    Cliente clienteprueba = null;
    Billetera billeteracliente=null;
    Ubicacion ubicacioncliente=null;

    @Before
    public void Pruebascliente(){
       clienteprueba = new Cliente("Daniel Saigua","0935475689",billeteracliente);
       ubicacioncliente=new Ubicacion(2.3f,2.5f,5.9f);


    }



    @Test
    public void crearcliente(){
        boolean creacionExito = false;
        try{
            Cliente cliente1 = new Cliente("Luis Mora","0935234519",billeteracliente);
            creacionExito = true;
        } catch (AssertionError error){
            creacionExito = false;
        }
        assertEquals(true, creacionExito);
    }






}
