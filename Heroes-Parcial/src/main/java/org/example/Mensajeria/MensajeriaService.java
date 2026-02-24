package org.example.Mensajeria;

import okhttp3.OkHttpClient;
import okhttp3.HttpUrl;
import okhttp3.Request;
import okhttp3.Response;

import org.example.Interfaces.IMensajeService;
import org.example.config.ConfigAPI;

import java.io.IOException;

/**
 * Servicio encargado del envío de mensajes a través de la API de Telegram.
 * <p>
 * Esta implementación utiliza el cliente {@link OkHttpClient} para realizar
 * peticiones GET a los servidores de Telegram, utilizando un token de bot
 * y un ID de chat configurados externamente.
 * </p>
 * * @author milerickhenaor-alt
 * @version 1.0
 */
public class MensajeriaService implements IMensajeService {

    /**
     * URL base de la API de bots de Telegram.
     */
    private static final String URL = "https://api.telegram.org/bot";

    /**
     * Envía un mensaje de texto de forma síncrona a un chat de Telegram específico.
     * <p>
     * Construye la URL con los parámetros necesarios (token, chat_id y texto)
     * y ejecuta una petición HTTP. Se encarga de capturar posibles errores de red.
     * </p>
     * * @param mensaje El contenido del mensaje que se enviará al chat.
     * @throws RuntimeException si ocurre un error de E/S durante la ejecución de la llamada.
     */
    @Override
    public void enviarMensaje(String mensaje) {

        OkHttpClient client = new OkHttpClient();

        // Construcción de la URL con parámetros de consulta
        HttpUrl url = HttpUrl.parse(
                        URL + ConfigAPI.getToken() + "/sendMessage")
                .newBuilder()
                .addQueryParameter("chat_id", ConfigAPI.getChatId())
                .addQueryParameter("text", mensaje)
                .build();

        // Configuración de la petición GET
        Request request = new Request.Builder()
                .url(url)
                .get()
                .build();

        // Ejecución de la llamada y manejo de respuesta/recursos
        try (Response response = client.newCall(request).execute()) {
            if (response.isSuccessful()) {
                System.out.println("Mensaje enviado correctamente a Telegram");
            } else {
                System.out.println("Error en la respuesta de Telegram: " + response.code());
            }
        } catch (IOException e) {
            System.err.println("Error de red enviando mensaje");
            e.printStackTrace();
        }
    }
}