package Practica;

import java.util.ArrayList;

public class Mail {
    private static ArrayList<String> terminacions1 = new ArrayList<String>();
    private static ArrayList <String> terminacions2 = new ArrayList<>();
    private static ArrayList <String> terminacions3 = new ArrayList<>();

    static boolean compruebaMail(String mail) {
        boolean valid = true;
        String patron = "^[a-zA-Z0-9]+@+[a-zA-Z0-9]+\\.[a-zA-Z0-9-.]+$";
        return mail.matches(patron);
    }

}
