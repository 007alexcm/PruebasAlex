package com.sinensia;

public class Portero extends Jugador {
 
    @Override
    public void accionObjetivo() {
        IO.println("Paradón del portero");
    }
    
    //Constructor
    public Portero (String nombre){
        super(nombre);
    } 
}
