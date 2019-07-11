package com.example.guayataxiv2;

public class ClienteTest {
    Cliente clientePrueba = null;
    Ubicacion ubicacion = null;
    Billetera billetera = null;

    public void iniciarPruebas() {
        ubicacion = registrarCasa(20051, 55450, 33796);
        billetera = new Billetera(1);
        clientePrueba = new Cliente("Jorge", "0934869211", ubicacion, billetera);
    }

    public Ubicacion registrarCasa(float px, float py, float pz) {
        Ubicacion ubicacion = new Ubicacion(px, py, pz);
        return ubicacion;
    }
    
    @Test
     public void crearUnNuevoCliente() {
        boolean creacionExitosa = false;
        Ubicacion ubicacion = registrarCasa(30099843, 223284, 3332223);
        try {
            Cliente clienteJuan = new Cliente("Juan", "0934285443", ubicacion);
            creacionExitosa = true;
        }catch(AssertionError error) {
            creacionExitosa = false;
        }
         assertEquals(true, creacionExitosa);
}
