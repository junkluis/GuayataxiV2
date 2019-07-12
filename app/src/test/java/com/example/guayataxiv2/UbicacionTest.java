package com.example.guayataxiv2;

public class UbicacionTest {

    Ubicacion ubicacionPrueba1 = null;
    Ubicacion ubicacionPrueba2 = null;
    Ubicacion ubicacionPrueba3 = null;
    Ubicacion ubicacionPrueba4 = null;

    @Before
    public void iniciarPruebas(){
        ubicacionPrueba1 = new Ubicacion(10,10,6);
        ubicacionPrueba2 = new Ubicacion(10,10,22);
        ubicacionPrueba3 = new Ubicacion(60,10,40);
        ubicacionPrueba4 = new Ubicacion(10,60,41);
    }

    @Test
    public void crearUnaNuevaUbicacion(){
        boolean creacionExito = false;
        try{
            Ubicacion ubicacionNew = new Ubicacion(10,10,12);
            creacionExito = true;
        } catch (AssertionError error){
            creacionExito = false;
        }
        assertEquals(true, creacionExito);
    }

    @Test
    public void precioDos(){
        float valorEsperado = 2;
        float valor = ubicacionPrueba1.calcularPrecio();
        assertEquals(valorEsperado, valor);
    }

    @Test
    public void precioCinco(){
        float valorEsperado = 5;
        float valor = ubicacionPrueba2.calcularPrecio();
        assertEquals(valorEsperado, valor);
    }

    @Test
    public void precioDiez(){
        float valorEsperado = 10;
        float valor = ubicacionPrueba3.calcularPrecio();
        assertEquals(valorEsperado, valor);
    }

    @Test
    public void precioQuince(){
        float valorEsperado = 15;
        float valor = ubicacionPrueba4.calcularPrecio();
        assertEquals(valorEsperado, valor);
    }

    @Test
    public void setDescription(){
        String mensajeEsperado = "nueva ubicacion confirmada";
        ubicacionPrueba1.setDescription("nueva ubicacion confirmada");
        String valor = ubicacionPrueba1.getDescription();
        assertEquals(mensajeEsperado, valor);
    }
}
