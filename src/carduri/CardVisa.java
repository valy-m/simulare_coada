package carduri;

public class CardVisa extends Card {
    protected char[] numarControl;

    public CardVisa(String nume, String nr, String nrControl) {
        super(nume, nr);
        this.numarControl=new char[3];
        this.numarControl = nrControl.toCharArray();
    }

    public char[] getNumarControl() {
        return numarControl;
    }

    public String toString() {
        String toString = "";
        return toString = "tip card: Visa" + "\n" + "Nume utilizator: " + numeUtilizator + "\n" + "Numar card: " +
                new String(numar) + "\n" + "Numar control: " + new String(numarControl)+ "\n";
    }

}
