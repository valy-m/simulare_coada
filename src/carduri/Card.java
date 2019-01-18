package carduri;

public  class Card {

    protected String numeUtilizator;
    protected char[] numar;



    public Card(String nume, String nr) {
        if ((nume.length() >= 16)) {
            this.numeUtilizator = nume.substring(0, 15);
        } else {
            this.numeUtilizator = nume;
        }
        this.numar=new char[16];
        this.numar= nr.toCharArray();
    }

    public String getNumeUtilizator() {
        return numeUtilizator;
    }

    public void setNumeUtilizator(String numeUtilizator) {
        this.numeUtilizator = numeUtilizator;
    }

    public char[] getNumar() {
        return numar;
    }

}
