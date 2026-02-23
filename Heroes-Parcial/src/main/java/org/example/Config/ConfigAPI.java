package org.example.config;


import org.example.Interfaces.IMensajeService;
import org.example.Mensajeria.MensajeriaAPI;

public class ConfigAPI {
    private static final String TOKEN = "8697907407:AAEP1et-_1v912pCFutgKCxEuMhWat0giQQ";
    private static final String CHAT_ID = "5609723663";

    public static String getToken() {
        return TOKEN;
    }

    public static String getChatId() {
        return CHAT_ID;
    }
}