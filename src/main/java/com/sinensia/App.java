package com.sinensia;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        Jugador jug1 = new Portero(); // Crear un objeto
        jug1.nombre = "Casillas";
        jug1.setDorsal(1);
        jug1.setPosicion("portero");
        JugadorCampo jug2 = new JugadorCampo();
        Jugador jug3 = new JugadorCampo();
        Jugador jug4 = new JugadorCampo();
        Jugador jug5 = new JugadorCampo();
        jug3.nombre = "Ramos";
        jug4.nombre = "Iniesta";
        jug5.nombre = "Torres";

        IO.println(jug1.nombre + " con el número " +
                jug1.getDorsal() + " es " + jug1.getPosicion());
        jug1.pasar();
        jug1.accionobjetivo();
        jug2.chutar();

        List<Jugador> miPlantilla = new ArrayList<>(); 
        miPlantilla.add(jug1);
        miPlantilla.add(jug3);
        miPlantilla.add(jug4);
        miPlantilla.add(jug5);
        miPlantilla.add(jug2);

        miPlantilla.contains(jug3);
        
        for (Jugador jug : miPlantilla) {
            IO.println(jug.nombre);
        }

    }
}
