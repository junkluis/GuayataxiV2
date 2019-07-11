package com.example.guayataxiv2;

public class ClienteTest {
    Cliente clientePrueba = null;
    Ubicacion ubicacionPrueba = null;

    @Before
    public void iniciarTest(){

        this.clientePrueba = new Cliente("Carlos Garzon", "0999999999",new Billetera(5);)
    }

    @Test
    public void crearUnNuevoCliente(){
        boolean creacionExito = false;
        try{
            Cliente nuevoCliente = new Cliente("Carlos Garzon", "0999999999",new Billetera(5));
            creacionExito = true;
        } catch (AssertionError error){
            creacionExito = false;
        }
        assertEquals(true, creacionExito);
    }
    @Test
    public void registrarCasa(){
        boolean registroExito = false;
        try{
            Ubicacion Ubicacion= this.clientePrueba.registrarCasa(5.55, 2.55, 4.55);
            registroExito = true;
        } catch (AssertionError error){
            registroExito = false;
        }
        assertEquals(true, creacionExito);

    }
}
