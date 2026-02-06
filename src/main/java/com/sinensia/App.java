package com.sinensia;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        Jugador jug1 = new Portero("Casillas");
        JugadorCampo jug2 = new JugadorCampo("Ramos");
        Jugador jug3 = new JugadorCampo("Ramos");
        Jugador jug4 = new JugadorCampo("Iniesta");
        Jugador jug5 = new JugadorCampo("Torres");
        jug1.setDorsal(1);
        jug1.setPosicion("portero");

        IO.println(jug1.getNombre() + " con el número " +
                jug1.getDorsal() + " es " + jug1.getPosicion());
        jug1.pasar();
        jug1.accionObjetivo();
        jug2.accionObjetivo();
        jug2.chutar();

        EquipoFutbol miPlantilla = new EquipoFutbol();
        /**miPlantilla.add(jug1);
        miPlantilla.add(jug3);
        miPlantilla.add(jug4);
        miPlantilla.add(jug5);
        miPlantilla.add(jug2);

        
        for (Jugador jug : miPlantilla) {
            IO.println(jug.getNombre());
        }
        */
    }
}
