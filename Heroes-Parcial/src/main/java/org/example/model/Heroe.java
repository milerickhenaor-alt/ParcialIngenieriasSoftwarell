package org.example.model;
/**
 * Clase base para todos los héroes del sistema.
 * Define atributos comunes y el método obligatorio de infiltración.
 */
public abstract class Heroe {
    private String fuerza;
    private String traje;
    private String identidad;
    private String nombre;

    // Getters y Setters
    public String getFuerza() {
        return fuerza;
    }

    public void setFuerza(String fuerza) {
        this.fuerza = fuerza;
    }

    public String getTraje() {
        return traje;
    }

    public void setTraje(String traje) {
        this.traje = traje;
    }

    public String getIdentidad() {
        return identidad;
    }

    public void setIdentidad(String identidad) {
        this.identidad = identidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    // Constructor general
    public Heroe(String fuerza, String traje, String identidad, String nombre) {
        this.fuerza = fuerza;
        this.traje = traje;
        this.identidad = identidad;
        this.nombre = nombre;
    }
    /** Define cómo el héroe entra en territorio enemigo sin ser visto. */
    public abstract void infiltrarse();
}