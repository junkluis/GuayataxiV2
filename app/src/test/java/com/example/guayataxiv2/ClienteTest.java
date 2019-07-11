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

}
