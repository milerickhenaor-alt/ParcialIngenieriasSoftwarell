package org.example.model;

import org.example.Interfaces.Trepador;

public class Hulk extends Heroe implements Trepador {

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