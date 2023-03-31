package Practica;

import java.security.SecureRandom;
import java.util.Random;

public class GeneradorCodigo {
    // caracteres permitidos en el código generado
    private static final String ALLOWED_CHARACTERS = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz!@#%^&*()_+-=[]{}|;':\"<>?,./";

    // longitud del código a generar
    private static final int CODE_LENGTH = 8;

    // instancia de un objeto Random para generar números aleatorios
    private static final Random random = new SecureRandom();

    public static String generarCodigo() {
        StringBuilder codigoBuilder = new StringBuilder(CODE_LENGTH);

        // generar caracteres aleatorios y añadirlos al código
        for (int i = 0; i < CODE_LENGTH; i++) {
            int randomIndex = random.nextInt(ALLOWED_CHARACTERS.length());
            codigoBuilder.append(ALLOWED_CHARACTERS.charAt(randomIndex));
        }

        // devolver el código generado como cadena de texto
        return codigoBuilder.toString();
    }

}



