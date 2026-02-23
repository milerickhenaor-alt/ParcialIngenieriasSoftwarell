package org.example.model;

import org.example.Interfaces.ControladorFuego;
import org.example.Interfaces.Volador;

public class IronMan extends Heroe implements Volador, ControladorFuego {

    public IronMan() {
        super("Alta", "Armadura Mark 85", "Tony Stark", "Iron Man");
    }

    @Override
    public void volar() {
        System.out.println("Iron Man está volando 🚀");
    }

    @Override
    public void controlar() {
        System.out.println("Iron Man dispara repulsores 🔥");
    }

    @Override
    public void infiltrarse() {
        System.out.println("Iron Man se infiltra usando tecnología avanzada 🛰");
    }
}