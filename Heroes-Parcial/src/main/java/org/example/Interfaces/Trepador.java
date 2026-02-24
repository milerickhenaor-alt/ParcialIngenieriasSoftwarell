package org.example.Interfaces;

/**
 * Interfaz que define la capacidad de desplazamiento vertical sobre superficies.
 * <p>
 * Esta abstracción permite que diversas entidades (escaladores, drones,
 * animales, etc.) implementen su propia lógica de ascenso sobre muros,
 * árboles o estructuras complejas.
 * </p>
 * * @author milerickhenaor-alt
 * @version 1.0
 */
public interface Trepador {

    /**
     * Ejecuta la acción de escalar o ascender verticalmente.
     * <p>
     * Las clases implementadoras deben especificar la técnica de ascenso,
     * ya sea mediante herramientas, extremidades especializadas o
     * sistemas de succión/agarre.
     * </p>
     */
    void trepar();
}