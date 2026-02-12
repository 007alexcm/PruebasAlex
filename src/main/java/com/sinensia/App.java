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
        List<Jugador> miPlantilla = List.of(
        new Portero("Casillas", 1, false),
        new JugadorCampo("Ramos", 4, true),
        new JugadorCampo("Torres", 9, false),
        new JugadorCampo("Iniesta", 8, false),
        new JugadorCampo("Pepe", 2, false)
);
        
        //IO.println(jug1.getNombre() + " con el número " +
        //        jug1.getDorsal() + " es " + jug1.getPosicion());
        //jug1.pasar();
        //jug1.accionObjetivo();
        //jug2.accionObjetivo();
        //jug2.chutar();

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

        IO.println("Lista para el próximo partido:");
        miEquipo.proxPartido().muestraEquipo();
        //miEquipo.muestraEquipo();

        /**try (BufferedReader tuNombre = new BufferedReader(new FileReader("sinensia.txt"))) {
            String line = tuNombre.readLine();
            IO.println(line);
        } catch (IOException e) {
            IO.println("ERROR de I/O: " + e.getMessage());
        }*/

        //A tener en cuenta: nombre puede ser null, pueden no ser letras
        /**IO.println("Hola nuevo jugador, ¿cuál es tu nombre? ");
        String name = null;
        try (BufferedReader br = new BufferedReader(
            new InputStreamReader(System.in, StandardCharsets.UTF_8))){
                name = br.readLine();
        } catch (IOException e) {
            IO.println("ERROR de I/O: " + e.getMessage());
        }*/

        //JugadorCampo usuario(name);
        //IO.println("¿Qué dorsal quieres?");


        //Falta pedir el resto de info con sus limitaciones
        //Lo ficho, y ya a hacer lo demás
    }   
}
