package org.example.Config;


import org.example.Interfaces.IMensajeService;
import org.example.Mensajeria.MensajeriaAPI;
/** * Configuración central para la integración con la API de mensajería.
 * Contiene las credenciales de acceso (Token y Chat ID).
 */
public class ConfigAPI {
    // Credenciales de acceso para la API
    private static final String TOKEN = "8697907407:AAEP1et-_1v912pCFutgKCxEuMhWat0giQQ";
    private static final String CHAT_ID = "5609723663";
    /** Retorna el token de autenticación. */
    public static String getToken() {
        return TOKEN;
    }
    /** Retorna el identificador del chat de destino. */
    public static String getChatId() {
        return CHAT_ID;
    }
}