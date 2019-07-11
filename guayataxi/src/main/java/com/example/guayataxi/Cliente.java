package com.example.guayataxi;

public class Cliente {

    private String nombreCompleto;
    private String cedula;
    private Ubicacion casa;
    private Billetera billetera;

    public Cliente(String nombreCompleto, String cedula, Billetera billetera) {
        this.nombreCompleto = nombreCompleto;
        this.cedula = cedula;
        this.billetera = billetera;
    }

    public Ubicacion registrarCasa(float longitud, float latitud, float distancia){
        Ubicacion miCasa = new Ubicacion(longitud, latitud, distancia);
        miCasa.setDescripcion("Mi Casa");
        this.casa = miCasa;
        return miCasa;
    }



}
