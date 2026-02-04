package com.sinensia;

/**
 * Hello world!
 */

public class App {
    public static void main(String[] args) {
        Jugador jug1 = new Jugador(); // Crear un objeto
        jug1.nombre = "Casillas";
        jug1.dorsal = 1;
        jug1.posicion = "portero";

        IO.println(jug1.nombre + " con el número " +
         jug1.dorsal + " es " + jug1.posicion);
        jug1.pasar(); // Llama al método
    }
}
