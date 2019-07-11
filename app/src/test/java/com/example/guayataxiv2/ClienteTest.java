package com.example.guayataxiv2;

import org.junit.Before;
import org.junit.Test;

import guayataxi.Billetera;
import guayataxi.Ubicacion;
import guayataxi.Cliente;

public class ClienteTest {
    Cliente clientePrueba = null;

    public void iniciarPruebas() {
        Ubicacion ubicacion = new Ubicacion(20051, 55450, 33796);
        Billetera billetera = new Billetera(1);
        clientePrueba = new Cliente("Mildred", "0934869211", ubicacion, billetera);
    }
    
    @Test
     public void crearUnNuevoCliente() {
        boolean creacionExitosa = false;
        Ubicacion ubicacion = new Ubicacion(30099843, 223284, 3332223);
        Billetera billetera = new Billetera(2);
        try {
            Cliente clienteJuan = new Cliente("Juan", "0934285443", ubicacion, billetera);
            creacionExitosa = true;
        }catch(AssertionError error) {
            creacionExitosa = false;
        }
         assertEquals(true, creacionExitosa);
}
