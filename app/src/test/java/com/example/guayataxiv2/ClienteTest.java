package com.example.guayataxiv2;

public class ClienteTest {

    Cliente clientePrueba = null;
    Billetera billeteraPrueba = new Billetera(2);
    Ubicacion casaPrueba = new Ubicacion(10,10,10);

    @Before
    public void iniciarPruebas(){
        billeteraPrueba.agregarFondos(10);
        clientePrueba = new Cliente("Alex Ubilla","0987654567",billeteraPrueba);

    }

    @Test
    public void crearUnNuevoCliente(){
        boolean creacionExito = false;
        try{
            Cliente clienteLuis = new Cliente("Luis Vera","0987654323",billeteraPrueba);
            creacionExito = true;
        } catch (AssertionError error){
            creacionExito = false;
        }
        assertEquals(true, creacionExito);
    }

    @Test
    public void registrarCasa(){
        String mensajeEsperado = "Mi casa";
        String valor = casaPrueba.getDescription();
        assertEquals(mensajeEsperado, valor);
    }
}
