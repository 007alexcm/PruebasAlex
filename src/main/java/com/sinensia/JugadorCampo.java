package com.sinensia;

public class JugadorCampo extends Jugador implements Chutable {
    
    public void chutar() {
        IO.println("Dispara el jugador");
    }

    //Constructor
    public JugadorCampo (String nombre){
        super(nombre);
    }
}
