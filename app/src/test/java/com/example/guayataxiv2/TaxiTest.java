package com.example.guayataxiv2;
package com.example.guayataxiv2;
import guayataxi.Cliente;
import guayataxi.Ubicacion;
import guayataxi.Conductor;
import guayataxi.Taxi;
import org.junit.Before;
import org.junit.Test;
import guayataxi.Billetera;
import static org.junit.Assert.*;
import static junit.framework.TestCase.assertTrue;


public class TaxiTest {



    Taxi taxi1 = null;


    @Before
    public void Pruebastaxi(){
        taxi1 = new Taxi("GBN433","MAZDA",11);



    }

    @Test
    public void creartaxi(){
        boolean creacionExito = false;
        try{
            Taxi taxi = new Taxi("GOV623","CHEVROLET",14);
            creacionExito = true;
        } catch (AssertionError error){
            creacionExito = false;
        }
        assertEquals(true, creacionExito);
    }
}
