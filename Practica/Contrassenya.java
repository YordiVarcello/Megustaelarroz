package Practica;

public class Contrassenya {
    static boolean compruebaContrasenya(String contra) {
        boolean validar;
        String especial = "@-_#";
        if (contra.length() != 8) {
            validar = false;
        }
        validar = false;
        for (int i = 0; i < contra.length()-2; i++) {
            for (int j = 0; j < especial.length(); j++) {
                if (contra.charAt(i) == especial.charAt(j)) {
                    validar = true;
                }
            }

        }
        if (!Character.isDigit(contra.charAt(6)) || !Character.isDigit(contra.charAt(7))) {
            validar = false;
        }

        return validar;
    }

}
