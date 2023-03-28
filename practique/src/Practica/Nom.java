package Practica;

import java.security.PrivateKey;
import java.util.Scanner;

public class Nom {
    
    private static boolean compruebaNombre (String nom) {
        boolean valid = true;
        if (nom == null || nom.length() == 0) {
            valid = false;
        }
        for (int i = 0; i < nom.length(); i++) {
            char caracter = nom.charAt(i);
            if (!Character.isLetter(caracter)) {
                valid = false;
            }
        }
        return valid;
    }
    public static void main(String[] args) {
        Scanner teclat = new Scanner(System.in);
        System.out.println("Escriu el teu nom:");
        String nombre = teclat.nextLine();
        boolean resultat = compruebaNombre(nombre);
        if (resultat) {
            System.out.println("El nom ingressat és vàlid");
        } else {
            System.out.println("El nom ingressat no és vàlid");
        }
    }
}
