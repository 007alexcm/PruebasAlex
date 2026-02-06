package com.sinensia;

public abstract class Jugador {
    //Atributos
    private String nombre;
    private String posicion; //delantero, medio, defensa, portero
    private int dorsal;
    private Boolean lesion; //para determinar si pueden jugar
    //Métodos
    void pasar() {
        IO.println("El jugador pasa");
    }
    void accionObjetivo() {
        //EquipoFutbol.contadorChuts++;
        IO.println("El jugador chuta a puerta");
    }
    
    public String getNombre() { return nombre; }
    public String getPosicion() { return posicion; }
    public int getDorsal() { return dorsal; }
    public Boolean getLesion() { return lesion; }
    public void setNombre (String nombre) {
        this.nombre = nombre;
    }
    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }
    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    } 
    public void setLesion(Boolean lesion) {
        this.lesion = lesion;
    }

    //Constructor 
    public Jugador(String nombre, String posicion, int dorsal, Boolean lesion) {
        this.nombre = nombre;
        this.posicion = posicion;
        this.dorsal = dorsal;
        this.lesion = lesion;
    }
    public Jugador (String nombre) {
        this.nombre = nombre;
    }



    /**public interface Parable {
        void parar();
    }*/
}
