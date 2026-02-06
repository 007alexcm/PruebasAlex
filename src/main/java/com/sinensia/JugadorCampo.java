package com.sinensia;

public final class JugadorCampo extends Jugador implements Chutable {
    
    public void chutar() {
        IO.println("Dispara el jugador");
    }

    //Constructor
    public JugadorCampo (String nombre){
        super(nombre);
    }

}
