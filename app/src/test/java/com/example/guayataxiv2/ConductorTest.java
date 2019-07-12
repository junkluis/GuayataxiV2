package com.example.guayataxiv2;

import org.junit.Test;
import static org.junit.Assert.*;

import guayataxi.Conductor;
import guayataxi.Taxi;

public class ConductorTest {
    @Test
    public void ConductorAsignarTaxiTets(){
        String nombre = "Juan";
        String cedula = "0846456406";
        Conductor conductor = new Conductor(nombre, cedula);
        String placa = "HAS1289";
        String marca = "Ford";
        int idTaxi = 12;
        Taxi taxi = new Taxi(placa,marca,idTaxi);
        assertEquals(true, conductor.asignarUnTaxi(taxi));
    }

    @Test
    public void ConductorAsignarTaxiFailTets(){
        String nombre = "Juan";
        String cedula = "0846456406";
        Conductor conductor = new Conductor(nombre, cedula);
        Taxi taxi = null;
        assertEquals(false, conductor.asignarUnTaxi(taxi));
    }


    @Test
    public void ConductorVerificarCedulaTets(){
        String nombre = "Juan";
        String cedula = "0846456406";
        Conductor conductor = new Conductor(nombre, cedula);
        assertEquals(true, conductor.verificarCedula());
    }

    @Test
    public void ConductorVerificarCedulaFalseTets(){
        String nombre = "Juan";
        String cedula = "08464406";
        Conductor conductor = new Conductor(nombre, cedula);
        assertEquals(false, conductor.verificarCedula());
    }

    @Test
    public void ConductorVerificarCedulaFalseCeroTets(){
        String nombre = "Juan";
        String cedula = "4846440615";
        Conductor conductor = new Conductor(nombre, cedula);
        assertEquals(false, conductor.verificarCedula());
    }
}
