package com.example.guayataxiv2;

public class ConductorTest {

    Conductor conductorPrueba = null;
    Conductor conductorPrueba2 = null;
    Taxi taxiPrueba = null;

    @Before
    public void iniciarPruebas(){
        
        conductorPrueba = new Conductor("Alex Ubilla","0987654567");
        conductorPrueba2 = new Conductor("Alex Ubilla","09854567");

    }

    @Test
    public void crearUnNuevoCliente(){
        boolean creacionExito = false;
        try{
            Conductor conductorLuis = new Conductor("Luis Vera","0987654323");
            creacionExito = true;
        } catch (AssertionError error){
            creacionExito = false;
        }
        assertEquals(true, creacionExito);
    }

    @Test
    public void AsignarTaxiFalse(){
        boolean estado = conductorPrueba.asignarUnTaxi(taxiPrueba);
        assertEquals(false, estado);
    }

    taxiPrueba = new Taxi("GSM 123","KIA",3)

    @Test
    public void AsignarTaxiTrue(){
        boolean estado = conductorPrueba.asignarUnTaxi(taxiPrueba);
        assertEquals(true, estado);
    }

    @Test
    public void CedulaValida(){
        boolean estado = conductorPrueba.verificarCedula();
        assertEquals(true, estado);
    }

    @Test
    public void CedulaInvalida(){
        boolean estado = conductorPrueba2.verificarCedula();
        assertEquals(false, estado);
    }
}
