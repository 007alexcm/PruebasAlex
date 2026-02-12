package com.sinensia;

import java.util.Objects;

public abstract sealed class Jugador implements Comparable<Jugador> permits JugadorCampo, Portero {
    //Atributos
    private String nombre;
    //private String posicion; //delantero, medio, defensa, portero
    private Integer dorsal;
    private boolean lesion; //para determinar si pueden jugar
    
    //Métodos
    @Override
    public int compareTo(Jugador j) {
        return this.dorsal.compareTo(j.dorsal);
    }

    @Override
    public boolean equals(Object o) {
       if (this == o)
        return true;
       if (o == null || getClass() != o.getClass())
        return false;
       Jugador jugador = (Jugador) o;
       return dorsal.equals(jugador.dorsal);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dorsal);
    }

    public void pasar() {
        IO.println(this.nombre + " pasa");
    }
    public void accionObjetivo() {
        IO.println("El jugador chuta a puerta");
    }
    
    public String getNombre() { return nombre; }    //los getter permiten
    //public String getPosicion() { return posicion; } // obtener los atributos
    public int getDorsal() { return dorsal; }
    public boolean getLesion() { return lesion; }
    public void setNombre (String nombre) {     //los setter me permiten 
        this.nombre = nombre;                   // cambiar los atributos
    }
    //public void setPosicion(String posicion) {        this.posicion = posicion;    }
    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    } 
    public void setLesion(boolean lesion) {
        this.lesion = lesion;
    }

    //Constructor 
    public Jugador(String nombre, int dorsal, boolean lesion) {
        this.nombre = nombre;
        this.dorsal = dorsal;
        this.lesion = lesion;
    }
    public Jugador(String nombre) {
        this.nombre = nombre;
    }



    /**public interface Parable {
        void parar();
    }*/
}

