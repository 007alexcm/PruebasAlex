package com.sinensia;

public final class Portero extends Jugador {

    private static final int NUM_GUANTES = 2;
    public int getGuantes() {
        return NUM_GUANTES;
    }
    
    @Override
    public void accionObjetivo() {
        IO.println("Paradón del portero");
    }
    
    //Constructor
    public Portero (String nombre, int dorsal, boolean lesion) {
        super(nombre);
        super.setDorsal(dorsal);
        super.setLesion(lesion);
    }

    public Portero (String nombre) {
        super(nombre);
    } 
}
