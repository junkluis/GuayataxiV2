package guayataxi;

public class Ubicacion {

    private Double longitud;
    private Double latitud;
    private String descripcion;
    private Double distancia;
    private float precio;

    public Ubicacion(Double longitud, Double latitud, Double distancia) {
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



}
