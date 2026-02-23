package org.example.model;

import org.example.Interfaces.Trepador;
import org.example.Interfaces.Sigiloso;

public class SpiderMan extends Heroe implements Trepador, Sigiloso {

    public SpiderMan() {
        super(
                "Media-Alta",          // fuerza
                "Traje Arácnido",      // traje
                "Peter Parker",       // identidad
                "Spider Man"          // nombre
        );
    }

    @Override
    public void trepar() {
        System.out.println("Spider Man está trepando edificios...");
    }

    @Override
    public void infiltrarse() {
        System.out.println("Spider Man se mueve con sigilo...");
    }

}