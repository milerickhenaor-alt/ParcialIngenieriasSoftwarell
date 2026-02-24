package org.example.model;

import org.example.Interfaces.Trepador;
/**
 * Representa al héroe Hulk.
 * Basado en fuerza bruta y capacidad de escalada.
 */
public class Hulk extends Heroe implements Trepador {
    /** Constructor: Define los atributos Gamma de Bruce Banner. */
    public Hulk() {
        super("Muy Alta", "Fuerza Gamma", "Bruce Banner", "Hulk");
    }

    @Override
    public void trepar() {
        System.out.println("Hulk trepa edificios usando su fuerza bruta 💪");
    }

    @Override
    public void infiltrarse() {
        System.out.println("Hulk intenta infiltrarse... pero rompe todo 😅");
    }
}