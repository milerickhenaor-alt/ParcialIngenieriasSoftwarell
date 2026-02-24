package org.example.Mensajeria;

import org.example.Interfaces.IMensajeService;

/**
 * Implementación del servicio de mensajería que interactúa con una API externa.
 * <p>
 * Esta clase se encarga de simular el envío de notificaciones o mensajes
 * a través de un endpoint remoto, cumpliendo con el contrato definido
 * en {@link IMensajeService}.
 * </p>
 * * @author milerickhenaor-alt
 * @version 1.0
 */
public class MensajeriaAPI implements IMensajeService {

    /**
     * Envía un mensaje de texto a través de una simulación de API externa.
     * <p>
     * El proceso imprime en consola el cuerpo del mensaje y simula una 
     * respuesta de servidor exitosa (HTTP 200).
     * </p>
     * * @param mensaje El contenido de texto que se desea enviar.
     */
    @Override
    public void enviarMensaje(String mensaje) {
        System.out.println("Enviando mensaje a API externa...");
        System.out.println("Mensaje: " + mensaje);
        System.out.println("Status: 200 OK");
    }
}