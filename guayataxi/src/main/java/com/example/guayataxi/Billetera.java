package com.example.guayataxi;

public class Billetera {

    private int billeteraId;
    private float valor;
    private boolean habilitada;

    public Billetera(int billeteraId) {
        this.billeteraId = billeteraId;
        this.habilitada = true;
        this.valor = 0;
    }


    public String agregarFondos(float valorAgregar){
        String mensaje = "";
        if (habilitada == true){
            if(valor + valorAgregar > 100 ){
                mensaje = "Sobre pasa el valor maximo a guardar";
            } else {
                valor += valorAgregar;
                mensaje = "Se agregaron los fondos con exito";
            }
        } else {
            mensaje = "La Billetera ha sido bloqueada";
        }
        return mensaje;
    }


    public boolean habilitarBilletera(boolean habilitar){
        this.habilitada = habilitar;
        return this.habilitada;
    }


    public String getValorBilletera(){
        String mensaje = "";
        if( valor == 0 ){
            mensaje = "Su billetera esta vacia";
        } else {
            mensaje = "Su billetera dispone de " + this.valor;
        }
        return mensaje;
    }



}
