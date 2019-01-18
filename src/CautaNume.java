import carduri.Card;

public class CautaNume implements Strategie {
    String nume;

    public CautaNume(String nume) {
        this.nume = nume;
    }

    @Override
    public boolean conditie(Card element) {
               if (this.nume.equals(element.getNumeUtilizator()))
            return true;
        else
            return false;
    }
}
