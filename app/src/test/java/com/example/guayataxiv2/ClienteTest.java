package com.example.guayataxiv2;

public class ClienteTest {


    Cliente clienteubicacionreal = null;


    @Before
    public void iniciarPruebas(){



        clientePrueba = new Cliente(2);
        billeteraPrueba.agregarubicacion(10);


    }

    @Test
    public void crearcliente(){
        boolean creacionExito = false;
        try{
            Cliente clientedaniel = new Cliente(1);
            creacionExito = true;
        } catch (AssertionError error){
            creacionExito = false;
        }
        assertEquals(true, creacionExito);
    }

    @Test
    public void agregarubicacion(){
        String mensajeEsperado = "Se agregaron la ubicacion con exito";
        String valor = clienteubicacionreal.agregarubicacion(50);
        assertEquals(mensajeEsperado, valor);
    }




}
