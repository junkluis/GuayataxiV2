package com.example.guayataxiv2;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

import guayataxi.Ubicacion;

public class UbicacionTest {
  Ubicacion u1 = null, u2 = null, u3 = null, u4 = null;

  @Before
  public void iniciarPruebas() {
    u1 = new Ubicacion(4, 4, 4);
    u2 = new Ubicacion(340, 435, 34);
    u3 = new Ubicacion(132, 12, 48);
    u3 = new Ubicacion(12, 443, 67);
    
    u1.setDescripcion("Guayaquil");
    u2.setDescripcion("Milagro");
    u3.setDescripcion("Guayaquil");
    u4.setDescripcion("Quito");
  }

  @Test
  public void verPrecios() {
    float r1, r2, r3, r4;
    
    r1 = u1.calcularPrecio();
    r2 = u2.calcularPrecio();
    r3 = u3.calcularPrecio();
    r4 = u4.calcularPrecio();
    
    assertEquals(2, r1);
    assertEquals(5, r2);
    assertEquals(10, r3);
    assertEquals(15, r4);
  }
}
