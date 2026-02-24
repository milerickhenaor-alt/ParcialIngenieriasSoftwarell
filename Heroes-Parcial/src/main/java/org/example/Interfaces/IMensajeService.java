package org.example.Interfaces;

/**
 * Interfaz base para servicios de comunicación y notificación.
 * <p>
 * Define el contrato estándar para cualquier servicio que necesite despachar
 * mensajes de texto, permitiendo intercambiar implementaciones (como Telegram,
 * APIs externas o Logs) sin afectar al cliente que las utiliza.
 * </p>
 * * @author milerickhenaor-alt
 * @version 1.0
 */
public interface IMensajeService {

    /**
     * Envía un mensaje de texto a un destinatario o canal preconfigurado.
     * <p>
     * La implementación de este método determinará el protocolo de transporte
     * (HTTP, SMTP, SMS, etc.) y el destino final del contenido.
     * </p>
     * * @param mensaje Cadena de texto que contiene la información a transmitir.
     */
    void enviarMensaje(String mensaje);
}