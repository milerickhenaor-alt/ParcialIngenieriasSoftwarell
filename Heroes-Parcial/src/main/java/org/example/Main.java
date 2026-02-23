package org.example;

import org.example.Interfaces.IMensajeService;
import org.example.Mensajeria.MensajeriaService;
import org.example.Misiones.MisionService;
import org.example.model.*;
import org.example.Misiones.Mision;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        System.out.println("=== SISTEMA DE ASIGNACIÓN DE MISIONES ===");

        IMensajeService mensajeService = new MensajeriaService();
        MisionService misionService = new MisionService(mensajeService);

        // 🔹 Crear héroes
        List<Heroe> heroes = Arrays.asList(
                new IronMan(),
                new Hulk(),
                new Thor(),
                new AquaMan()
        );


        Mision mision = new Mision(
                "Incendio aéreo",
                true,   // requiere vuelo
                true,   // requiere fuego
                false,
                false,
                false
        );
        Mision misionAcuatica = new Mision(
                "Rescate en las profundidades del océano",
                false,   // vuelo
                false,   // fuego
                false,   // trepar
                true,    // agua
                false    // sigilo
        );

        Mision misionEscalada = new Mision(
                "Rescate en rascacielos",
                true,   // vuelo
                false,   // fuego
                true,    // trepar
                false,   // agua
                false    // sigilo
        );


        try {

            System.out.println("Intentando asignar misión...");

            for (Heroe heroe : heroes) {

                misionService.intentarAsignacion(heroe, mision);
            }

            System.out.println("Misión asignada correctamente.");

        } catch (Exception e) {

            System.out.println("Error inesperado en el sistema:");
            e.printStackTrace();
        }
    }
}