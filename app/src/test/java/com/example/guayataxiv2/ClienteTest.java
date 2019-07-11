package com.example.guayataxiv2;

public class ClienteTest {

    public Cliente cliente = null;

    @Before
    public void iniciarPruebas(){
        Billetera billeteraPrueba = new Billetera(2);
        this.cliente = new Cliente("Mauricio Leiton Lazaro", "0989389265", billeteraPrueba);
    }

    @Test
    public void registrarCasa(){
        Ubicacion miCasa = this.cliente.registrarCasa(12.2,12.2,12.2);
        assertTrue(miCasa instanceof Ubicacion);
    }
}
