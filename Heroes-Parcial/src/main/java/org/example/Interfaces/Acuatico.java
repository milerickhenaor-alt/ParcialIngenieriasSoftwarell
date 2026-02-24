package org.example.Interfaces;

/**
 * Interfaz que define el comportamiento para entidades con capacidad de desplazamiento en agua.
 * <p>
 * Esta interfaz debe ser implementada por cualquier clase que represente un ser u objeto
 * capaz de realizar la acción de nadar o navegar.
 * </p>
 * * @author milerickhenaor-alt
 * @version 1.0
 */
public interface Acuatico {

    /**
     * Define la lógica de movimiento o desplazamiento a través del medio acuático.
     * <p>
     * Las clases implementadoras deben especificar si el nado es propulsado,
     * por aletas, motor u otros mecanismos.
     * </p>
     */
    void nadar();
}