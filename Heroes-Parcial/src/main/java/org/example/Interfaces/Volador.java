package org.example.Interfaces;

/**
 * Interfaz que define el comportamiento para entidades con capacidad de locomoción aérea.
 * <p>
 * Esta interfaz es una pieza clave en sistemas que requieren polimorfismo para
 * diferentes tipos de desplazamiento, permitiendo que el cliente ignore la
 * implementación específica del vuelo.
 * </p>
 * * @author milerickhenaor-alt
 * @version 1.0
 */
public interface Volador {

    /**
     * Define la lógica de sustentación y desplazamiento a través del aire.
     * <p>
     * Las clases implementadoras deben detallar el método de vuelo, como el
     * aleteo biológico, propulsión mecánica o levitación.
     * </p>
     */
    void volar();
}