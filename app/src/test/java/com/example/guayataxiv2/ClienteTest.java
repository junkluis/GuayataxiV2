package com.example.guayataxiv2;

public class ClienteTest {


    Cliente clienteprueba = null;
    Billetera billeteracliente=null;

    @Before
    public void Pruebascliente(){
       clienteprueba = new Cliente("Daniel Saigua","0935475689",billeteracliente);
       ubicacioncliente=new Ubicacion(2.3,2.5,5.9);


    }



    @Test
    public void crearcliente(){
        boolean creacionExito = false;
        try{
            Cliente cliente1 = new Cliente("Luis Mora","0935234519",billeteracliente);
            creacionExito = true;
        } catch (AssertionError error){
            creacionExito = false;
        }
        assertEquals(true, creacionExito);
    }

    @Test
    public void crearubicacion(){
        boolean creacionExito = false;
        try{
            Ubicacion ubicacion1 = new Ubicacion(2.0,2.2,4.9);
            creacionExito = true;
        } catch (AssertionError error){
            creacionExito = false;
        }
        assertEquals(true, creacionExito);
    }




}
