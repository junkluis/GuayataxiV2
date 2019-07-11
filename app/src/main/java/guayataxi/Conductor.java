package guayataxi;

import guayataxi.Taxi;

public class Conductor {

    private String nombreCompleto;
    private String cedula;
    private Taxi taxi;

    public Conductor(String nombreCompleto, String cedula) {
        this.nombreCompleto = nombreCompleto;
        this.cedula = cedula;
    }

    public boolean asignarUnTaxi(Taxi taxi){
        if(taxi != null){
            return true;
        } else {
            return false;
        }
    }


    public boolean verificarCedula(){
        boolean cedulaValida = false;
        if (cedula.length() == 10) {
            if(cedula.charAt(0) == '0'){
                cedulaValida = true;
            } else {
                cedulaValida = false;
            }
        } else {
            cedulaValida = false;
        }

        return cedulaValida;
    }

}


