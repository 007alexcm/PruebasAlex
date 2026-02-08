package com.sinensia;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
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
        jug2.setDorsal(4);
        //IO.println(jug1.compareTo(jug2));

        //IO.println(jug1.getNombre() + " con el número " +
        //        jug1.getDorsal() + " es " + jug1.getPosicion());
        //jug1.pasar();
        //jug1.accionObjetivo();
        //jug2.accionObjetivo();
        //jug2.chutar();

        List<Jugador> miPlantilla = new ArrayList<>(List.of(jug1, jug2, jug3, jug4));
        
        //He creado la clase EquipoFutbol, y defino métodos para cada
        //cosa que quiero hacer, como fichar, mostrar, etc.
        EquipoFutbol miEquipo = new EquipoFutbol("España", miPlantilla);
        IO.println("Mi plantilla es: ");
        miEquipo.muestraEquipo();
        
        //IO.println(miEquipo.soloPorteros().getNombreEquipo()); //Devuelve el nombre del equipo
        //miEquipo.soloPorteros().muestraEquipo();               //Devuelve los jugadores del equipo que son porteros
        //IO.println(miEquipo.sinPorteros().getNombreEquipo());
        //miEquipo.sinPorteros().muestraEquipo();
        //miEquipo.fichar(jug5);
        //miEquipo.finContrato(jug2);
        //IO.println("Tras el fichaje mi plantilla es: ");
        //miEquipo.muestraEquipo();
        jug1.setLesion(false);
        jug2.setLesion(true);
        jug3.setLesion(false);
        jug4.setLesion(false);
        //miEquipo.proxPartido().muestraEquipo();
        //miEquipo.muestraEquipo();

        /**try (BufferedReader tuNombre = new BufferedReader(new FileReader("sinensia.txt"))) {
            String line = tuNombre.readLine();
            IO.println(line);
        } catch (IOException e) {
            IO.println("ERROR de I/O: " + e.getMessage());
        }*/
        IO.println("Dame tu nombre ");
        try (BufferedReader tuNombre = new BufferedReader(
            new InputStreamReader(System.in, StandardCharsets.UTF_8))){
                String line = tuNombre.readLine();
            } catch (IOException e) {
                IO.println("ERROR de I/O: " + e.getMessage());
            }
    }   
}
