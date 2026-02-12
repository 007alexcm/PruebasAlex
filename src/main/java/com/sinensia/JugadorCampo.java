package com.sinensia;

public final class JugadorCampo extends Jugador implements Chutable {
    
    public void chutar() {
        IO.println("Dispara el jugador");
    }

    //Constructor
    public JugadorCampo (String nombre){
        super(nombre);
    }

    public JugadorCampo (String nombre, int dorsal, boolean lesion) {
        super(nombre);
        super.setDorsal(dorsal);
        super.setLesion(lesion);
    }

}
