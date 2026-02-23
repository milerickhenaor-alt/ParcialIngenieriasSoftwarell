package org.example.model;

import org.example.Interfaces.Acuatico;

public class AquaMan extends Heroe implements Acuatico {

    public AquaMan() {
        super("Media", "Tridente Atlante", "Arthur Curry", "AquaMan");
    }

    @Override
    public void nadar() {
        System.out.println("AquaMan nada a gran velocidad 🌊");
    }

    @Override
    public void infiltrarse() {
        System.out.println("AquaMan se infiltra desde el océano 🌊");
    }
}