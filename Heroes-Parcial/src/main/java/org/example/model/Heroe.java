package org.example.model;

public class Heroe {
    private String fuerza;
    private String traje;
    private String identidad;
    private String nombre;

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

    public Heroe(String fuerza, String traje, String identidad, String nombre) {
        this.fuerza = fuerza;
        this.traje = traje;
        this.identidad = identidad;
        this.nombre = nombre;
    }
}
