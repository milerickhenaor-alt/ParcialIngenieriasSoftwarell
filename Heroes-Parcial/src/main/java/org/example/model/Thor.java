package org.example.model;


import org.example.Interfaces.Volador;
/** * Representa al Dios del Trueno.
 * Basado en fuerza divina y capacidad de vuelo mediante el Mjolnir.
 */
public class Thor extends Heroe implements Volador {
    /** Inicializa a Thor Odinson con su martillo y fuerza de nivel Dios. */
    public Thor() {
        super("Alta", "Mjolnir", "Thor Odinson", "Thor");
    }

    @Override
    public void volar() {
        System.out.println("Thor vuela usando el poder de Mjolnir ⚡");
    }

    @Override
    public void infiltrarse() {
        System.out.println("Thor no es muy bueno en misiones de sigilo 😅");
    }
}