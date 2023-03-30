package Practica;

import java.util.ArrayList;

public class Mail {
    static boolean compruebaMail(String mail) {
        boolean valid = true;
        String patron = "^[a-zA-Z0-9]+@+[a-zA-Z0-9]+\\.[a-zA-Z0-9-.]+$";
        return mail.matches(patron);
    }

}
