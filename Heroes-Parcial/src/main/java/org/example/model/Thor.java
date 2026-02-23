package org.example.model;


import org.example.Interfaces.Volador;

public class Thor extends Heroe implements Volador {

    public Thor() {
        super("Alta", "Mjolnir", "Thor Odinson", "Thor");
    }

    @Override
    public void volar() {
        System.out.println("Thor vuela usando el poder de Mjolnir ⚡");
    }

    @Override
    public void infiltrarse() {
        System.out.println("Thor no es muy bueno en misiones de sigilo 😅");
    }
}