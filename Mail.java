package Practica;

import java.util.ArrayList;

public class Mail {
    static boolean compruebaMail(String mail) {
        boolean valid = true;
        String patron = "^[a-zA-Z0-9]+@+(gmail|hotmail|paucasesnovescifp|yahoo)+\\.(cat|com|es)+$";
        return mail.matches(patron);
    }

}
