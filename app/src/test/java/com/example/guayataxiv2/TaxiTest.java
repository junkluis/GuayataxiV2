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
}
