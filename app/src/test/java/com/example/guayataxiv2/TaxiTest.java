package com.example.guayataxiv2;

public class TaxiTest {

    Taxi taxiPrueba = null;

    @Before
    public void iniciarPruebas(){
        taxiPrueba = new Taxi("GSM 123","KIA",2);
    }

    @Test
    public void crearUnNuevoTaxi(){
        boolean creacionExito = false;
        try{
            Taxi taxiNuevo = new Taxi("GSM 123","MAZDA",5);
            creacionExito = true;
        } catch (AssertionError error){
            creacionExito = false;
        }
        assertEquals(true, creacionExito);
    }

    @Test
    public void ColorAdecuado(){
        String mensajeEsperado = "Al taxi se le asigno el color: Rojo";
        String valor = taxiPrueba.setColor("Rojo");
        assertEquals(mensajeEsperado, valor);
    }

    @Test
    public void ColorInadecuado(){
        String mensajeEsperado = "Debe seleccionar un color dentor de la lista posibles";
        String valor = taxiPrueba.setColor("Gris");
        assertEquals(mensajeEsperado, valor);
    }
}
