package Practica;

public class Contrassenya {
    static boolean compruebaContrasenya(String contra) {
        boolean valid = true;

        if (contra.length() != 8) {
            valid = false;
        }
        if (!contra.contains("@") || !contra.contains("-") || !contra.contains("_") || !contra.contains("#")) {
            valid = false;
        }
        if (!Character.isDigit(contra.charAt(6)) && !Character.isDigit(contra.charAt(7))) {
            valid = false;
        }

        return valid;
    }

}
