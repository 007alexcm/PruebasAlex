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
    public String getNombreEquipo() { return nombreEquipo; }
    public List<Jugador> getPlantilla() { return plantilla; }
    public void setNombreEquipo (String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
    }
    public void setPlantilla (List<Jugador> plantilla) {
        this.plantilla = plantilla;
    }

    //Métodos
    public void muestraEquipo() {
        plantilla.forEach(jug -> IO.println(jug.getNombre()));
    }
    public void fichar(Jugador jug) {
        this.plantilla.add(jug);
        IO.println("FICHADO " + jug.getNombre() + " nuevo jugador de " + this.nombreEquipo);
    }
    public void finContrato(Jugador jug) {
        this.plantilla.remove(jug);
        IO.println("Adiós a " + jug.getNombre());
    }
    //Este método devuelve los porteros de un equipo
    public EquipoFutbol soloPorteros() {
        List<Jugador> porteros = new ArrayList<>();
            for (Jugador j : plantilla) {
                if (j instanceof Portero) porteros.add(j);
            }
        return new EquipoFutbol("Porteros de " + nombreEquipo, porteros);
    }
    //Este método devuelve los jugadores de campo de un equipo
    public EquipoFutbol sinPorteros() {
        List<Jugador> noporteros = new ArrayList<>();
            for (Jugador j : plantilla) {
                if (j instanceof JugadorCampo) noporteros.add(j);
            }
        return new EquipoFutbol("Jugadores de campo de " + nombreEquipo, noporteros);
    }
}

