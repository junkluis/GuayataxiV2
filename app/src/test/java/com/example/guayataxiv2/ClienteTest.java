package com.example.guayataxiv2;

import org.junit.Before;
import org.junit.Test;

import guayataxi.Billetera;
import guayataxi.Ubicacion;
import guayataxi.Cliente;

public class ClienteTest {
    Cliente clientePrueba = null;

    public void iniciarPruebas() {
        Billetera billetera = new Billetera(1);
        clientePrueba = new Cliente("Mildred", "0934869211", billetera);
    }
    
    @Test
     public void crearUnNuevoCliente() {
        boolean creacionExitosa = false;
        Billetera billetera = new Billetera(2);
        try {
            Cliente clienteJuan = new Cliente("Juan", "0934285443", billetera);
            creacionExitosa = true;
        }catch(AssertionError error) {
            creacionExitosa = false;
        }
        assertEquals(true, creacionExitosa);
     }
    
    @Test
    public void ubicarCasa() {
        boolean asignacionExitosa = false;
        try {
            clientePrueba.registrarCasa(33227, 3328217, 337226);
            asignacionExitosa = true;
        }catch(AssertionError error) {
            asignacionExitosa = false;
        }
        assertEquals(true, asignacionExitosa);
    }
}
