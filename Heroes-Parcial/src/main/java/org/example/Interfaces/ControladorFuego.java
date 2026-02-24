package org.example.Interfaces;

/**
 * Interfaz que define la capacidad de manipular o gestionar el elemento fuego.
 * <p>
 * Esta abstracción permite que diferentes entidades (personajes, sistemas
 * de extinción, etc.) implementen su propia lógica de control sobre llamas
 * o altas temperaturas.
 * </p>
 * * @author milerickhenaor-alt
 * @version 1.0
 */
public interface ControladorFuego {

    /**
     * Ejecuta la acción de controlar el fuego.
     * <p>
     * La implementación específica determinará si el control implica
     * extinción, manipulación mágica o regulación técnica.
     * </p>
     */
    void controlar();
}