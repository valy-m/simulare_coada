package carduri;

import java.util.Arrays;

public class CardMaestro extends Card {

    public CardMaestro(String nume, String numar) {
        super(nume, numar);
    }


    public String toString() {
        String toString = "";
        return toString = "tip card: Maestro" + "\n" + "Nume utilizator: " + numeUtilizator + "\n"
                + "Numar card: " + new String(numar) + "\n";
    }

}
