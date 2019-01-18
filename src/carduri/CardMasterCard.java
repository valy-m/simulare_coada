package carduri;

import java.util.Arrays;

public class CardMasterCard extends Card {
    private char[] numarControl;

    public CardMasterCard(String nume, String numar, String nrControl) {
        super(nume, numar);
        this.numarControl=new char[3];
        this.numarControl = nrControl.toCharArray();
    }

    public char[] getNumarControl() {
        return numarControl;
    }

    public void setNumarControl(char[] numarControl) {
        this.numarControl = numarControl;
    }


    public String toString() {
        String toString = "";
        return toString = "tip card: MasterCard" + "\n" + "Nume utilizator: " + numeUtilizator +
                "\n" + "Numar card: " + new String(numar) + "\n" + "Numar control: " + new String(numarControl) + "\n";
    }
}
