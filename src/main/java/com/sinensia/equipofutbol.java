package com.sinensia;

import java.util.ArrayList;
import java.util.List;

public class EquipoFutbol {
    
    private String nombreEquipo;
    private List<Jugador> plantilla = new ArrayList<>();
    static final int MAX = 3;

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
        plantilla.add(jug);
        IO.println("FICHADO " + jug.getNombre() + " nuevo jugador de " + nombreEquipo);
    }
    public void finContrato(Jugador jug) {
        plantilla.remove(jug);
        IO.println("Adiós a " + jug.getNombre());
    }
    //Este método devuelve los porteros de un equipo
    //lo hago primero con estructuras for tradicional
    public EquipoFutbol soloPorteros() {
        List<Jugador> porteros = new ArrayList<>();
            for (Jugador j : plantilla) {
                if (j instanceof Portero) porteros.add(j);
            }
        return new EquipoFutbol("Porteros de " + nombreEquipo, porteros);
    }
    //Este método devuelve los jugadores de campo de un equipo
    //ahora lo hago mejor con streams().filter().toList()
    public EquipoFutbol sinPorteros() {
        return new EquipoFutbol("Jugadores de campo de " + nombreEquipo, 
        plantilla.stream().filter(JugadorCampo.class::isInstance).toList());
    }
    public EquipoFutbol proxPartido() {
        //primero vamos a quitarnos a los lesionados
        List<Jugador> sanos = plantilla.stream().filter(j -> !j.getLesion()).toList();
        //se devuelven los mejores jugadores disponibles (12 como max)
        if (sanos.size() < MAX){
            return new EquipoFutbol (nombreEquipo, sanos);//.sort(Comparable::compareTo));
        } else return new EquipoFutbol (nombreEquipo, sanos.subList(0, MAX));
    }
}

