package org.example.Interfaces;

/**
 * Interfaz que define la capacidad de realizar acciones sin ser detectado.
 * <p>
 * Se utiliza para entidades que requieren lógica de movimiento táctico,
 * ocultamiento o acceso a áreas restringidas de manera silenciosa.
 * </p>
 * * @author milerickhenaor-alt
 * @version 1.0
 */
public interface Sigiloso {

    /**
     * Ejecuta la lógica de infiltración de la entidad.
     * <p>
     * La implementación debe definir el mecanismo de sigilo, ya sea
     * mediante camuflaje, movimiento silencioso o elusión de sensores/guardias.
     * </p>
     */
    void infiltrarse();
}