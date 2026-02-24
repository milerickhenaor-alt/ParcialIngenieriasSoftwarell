package org.example.model;

import org.example.Interfaces.ControladorFuego;
import org.example.Interfaces.Volador;
/** * Representa a Iron Man.
 * Integra tecnología de vuelo y combate térmico (repulsores).
 */
public class IronMan extends Heroe implements Volador, ControladorFuego {
    /** Inicializa a Tony Stark con su armadura Mark 85. */
    public IronMan() {
        super("Alta", "Armadura Mark 85", "Tony Stark", "Iron Man");
    }

    @Override
    public void volar() {
        System.out.println("Iron Man está volando 🚀");
    }

    @Override
    public void controlar() {
        System.out.println("Iron Man dispara repulsores 🔥");
    }

    @Override
    public void infiltrarse() {
        System.out.println("Iron Man se infiltra usando tecnología avanzada 🛰");
    }
}