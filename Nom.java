package Practica;

import java.security.PrivateKey;
import java.util.Scanner;

public class Nom {
    
     static boolean compruebaNombre(String nom) {
         String nombres = "Juan,Ana,Carlos,Maria,Luis,Patricia,Santiago,Daniela,Diego,Valentina";
        boolean valid = true;
        if (nom == null || nom.length() == 0 || nombres.contains(nom)) {
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
}
