package com.sinensia;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        Jugador jug1 = new Portero("Casillas");
        Jugador jug2 = new JugadorCampo("Ramos");
        Jugador jug3 = new JugadorCampo("Iniesta");
        Jugador jug4 = new JugadorCampo("Torres");
        Jugador jug5 = new JugadorCampo("Alex");
        Jugador jug6 = new JugadorCampo("Pepe");
        jug1.setDorsal(1);
        jug1.setPosicion("portero");

        IO.println(jug1.getNombre() + " con el número " +
                jug1.getDorsal() + " es " + jug1.getPosicion());
        jug1.pasar();
        //jug1.accionObjetivo();
        //jug2.accionObjetivo();
        //jug2.chutar();

        List<Jugador> miPlantilla = new ArrayList<>(List.of(jug1, jug2, jug3, jug4));
        
        //He creado la clase EquipoFutbol, y defino métodos para cada
        //cosa que quiero hacer, como fichar, mostrar, etc.
        EquipoFutbol miEquipo = new EquipoFutbol("España", miPlantilla);
        IO.println("Mi plantilla es: ");
        miEquipo.muestraEquipo();
        miEquipo.fichar(jug5);
        IO.println("Tras el fichaje mi plantilla es: ");
        miEquipo.muestraEquipo();
    }
}
