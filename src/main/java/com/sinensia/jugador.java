package com.sinensia;

public class Jugador extends EquipoFutbol {
    //Atributos
    private String posicion; //delantero, medio, defensa, portero
    private int dorsal;
    private boolean lesion; //para determinar si pueden jugar
    //Métodos
    void pasar() {
        IO.println("El jugador pasa");
    }
    void accionobjetivo() {
        //EquipoFutbol.contadorChuts++;
        IO.println("El jugador chuta a puerta");
    }
    
    public String getPosicion() {
        return posicion;
    }
    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }
    public int getDorsal() {
        return dorsal;
    }
    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }
    public Boolean getLesion() {
        return lesion;
    }
    public void setLesion(Boolean lesion) {
        this.lesion = lesion;
    }

    /**public interface Parable {
        void parar();
    }*/
}
