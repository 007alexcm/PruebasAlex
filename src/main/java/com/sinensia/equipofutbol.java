package com.sinensia;

import java.util.ArrayList;
import java.util.List;

public class EquipoFutbol {
    
    private String nombreEquipo;
    private List<Jugador> plantilla = new ArrayList<>();

    //Constructor
    public EquipoFutbol (String nombreEquipo, List<Jugador> plantilla) {
        this.nombreEquipo = nombreEquipo;
        this.plantilla = plantilla;
    }
    public EquipoFutbol (String nombreEquipo) { //En el caso de crear equipo aún sin jugadores
        this.nombreEquipo = nombreEquipo;
    }
    
    //Getter y Setter
    public String getNombreEquipo(){ return nombreEquipo; }
    public List<Jugador> getPlantilla(){ return plantilla; }
    public void setNombreEquipo (String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
    }
    public void setPlantilla (List<Jugador> plantilla) {
        this.plantilla = plantilla;
    }

    //Métodos
    public void muestraEquipo(){
        for (Jugador jug : this.plantilla) {
            IO.println(jug.getNombre());
        }
    }
    public void fichar(Jugador jug){
        this.plantilla.add(jug);
        IO.println(jug.getNombre() + " nuevo jugador de " + this.nombreEquipo);
    }
    
}

