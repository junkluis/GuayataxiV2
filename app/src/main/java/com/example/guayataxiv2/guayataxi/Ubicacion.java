package com.example.guayataxiv2.guayataxi;


public class Ubicacion {

    private float longitud;
    private float latitud;
    private String descripcion;
    private float distancia;
    private float precio;

    public Ubicacion(float longitud, float latitud, float distancia) {
        this.longitud = longitud;
        this.latitud = latitud;
        this.distancia = distancia;
    }


    public float calcularPrecio(){
        float precioCalculado = 0;
        if(distancia > 0 && distancia < 10){
            precioCalculado = 2;
        } else if(distancia >= 10 && distancia < 30){
            precioCalculado = 5;
        } else if(distancia > 30 && longitud > 50){
            precioCalculado = 10;
        } else if(distancia > 30 && latitud > 50){
            precioCalculado = 15;
        }
        this.precio = precioCalculado;
        return precioCalculado;

    }

    public void setDescripcion(String descripcion){
        this.descripcion = descripcion;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ubicacion ubicacion = (Ubicacion) o;
        return Float.compare(ubicacion.longitud, longitud) == 0 &&
                Float.compare(ubicacion.latitud, latitud) == 0 &&
                Float.compare(ubicacion.distancia, distancia) == 0;
    }

}
