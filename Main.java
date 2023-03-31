package Practica;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String valid = " vàlid";
        String valida = " vàlida";
        String punts = ":";
        Scanner teclat = new Scanner(System.in);
        boolean nom;
        boolean mail;
        boolean contras;
        do {
            System.out.println("Escriu un nom".concat(valid.concat(punts)));
            String nombre = teclat.nextLine();
            nom = Nom.compruebaNombre(nombre);
            if (nom) {
                System.out.println("El nom ingressat és vàlid");
            } else {
                System.out.println("El nom ingressat no és vàlid");
            }
        } while (!nom);
        do {
            System.out.println("Escriu un correu electrònic".concat(valid.concat(punts)));
            String email = teclat.nextLine();
            mail = Mail.compruebaMail(email);
            if (mail) {
                System.out.println("El mail ingressat és vàlid");
            } else {
                System.out.println("El mail ingressat no és vàlid");
            }
        } while (!mail);
        do {
            System.out.println("Escriu una contrassenya".concat(valida.concat(punts)));
            String contra = teclat.nextLine();
            contras = Contrassenya.compruebaContrasenya(contra);
            if (!contras) {
                System.out.println("La contrassenya ingresada no és vàlida");
            } else {
                System.out.println("La contrassenya ingresada és vàlida");
            }
        } while (!contras);
    }
}
