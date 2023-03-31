package Practica;

import java.security.SecureRandom;
import java.util.Random;

public class ValidadorCodigo {


    public static boolean validarCodigo(String codigoIngresado) {
        return codigoIngresado.equals(Main.CODIGO_GENERADO);
    }

    // El código generado por el generador de códigos es estático, por lo que podemos
    // acceder a ella desde un método static. Aquí te dejo un ejemplo de cómo podría
    // ser la implementación de este método, similar al que te mostré antes.

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
}
