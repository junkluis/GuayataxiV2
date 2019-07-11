package com.example.guayataxiv2;

import org.junit.Before;
import org.junit.Test;

import guayataxi.Taxi;

public class TaxiTest {
  
  Taxi taxiValido = null;
  Taxi taxiNoValido = null;
  
  public iniciarPruebas() {
    taxiValido = new Taxi("GCZ567", "Hiundai", 2);
    taxiNoValido = new Taxi("GCV653", "Renaul", 3);
    

  }
  
  public void confirmarColores() {
    String mensaje1 =taxiValido.setColor("Rojo");
    String mensaje2 = taxiNoValido.setColor("Negro");
    
    stringEquals("Al taxi se le asigno el color: Rojo", mensaje1);
    stringEquals("Debe seleccionar un color dentor de la lista posibles", mensaje2);
  }
}
