package com.example.guayataxiv2;

import org.junit.Before;
import org.junit.Test;

import guayataxi.Taxi;

import static org.junit.Assert.*;

public class TaxiTest {
  
  Taxi taxiValido = null;
  Taxi taxiNoValido = null;

  @Before
  public void iniciarPruebas() {
    taxiValido = new Taxi("GCZ567", "Hiundai", 2);
    taxiNoValido = new Taxi("GCV653", "Renaul", 3);
  }

  @Test
  public void confirmarColores() {
    String mensaje1 =taxiValido.setColor("Rojo");
    String mensaje2 = taxiNoValido.setColor("Negro");

    assertEquals("Al taxi se le asigno el color: Rojo", mensaje1);
    assertEquals("Debe seleccionar un color dentor de la lista posibles", mensaje2);
  }
}
