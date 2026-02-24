package org.example.model;

import org.example.Interfaces.Acuatico;

/**
 * Representa al héroe AquaMan.
 * Hereda de la clase Heroe e implementa habilidades acuáticas.
 */
public class AquaMan extends Heroe implements Acuatico {

    /**
     * Constructor por defecto.
     * Inicializa a AquaMan con sus atributos característicos:
     * Fuerza media, su Tridente, nombre real y alias.
     */
    public AquaMan() {
        super("Media", "Tridente Atlante", "Arthur Curry", "AquaMan");
    }

/**
 * Realiza la acción de nadar a alta velocidad.*/
    @Override
    public void nadar() {
        System.out.println("AquaMan nada a gran velocidad 🌊");
    }
/* Ejecuta una táctica de infiltración usando el entorno marino.*/
    @Override
    public void infiltrarse() {
        System.out.println("AquaMan se infiltra desde el océano 🌊");
    }
}