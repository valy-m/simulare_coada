import carduri.Card;

public class VerificaNumar implements Strategie {
    char numar;

    public VerificaNumar(char numar) {
        this.numar = numar;
    }

    @Override
    public boolean conditie(Card element) {
        int count = 0;
        for (int i = 0; i < element.getNumar().length; i++) {
            if (element.getNumar()[i] == numar)
                count += 1;
        }
        if (count == 3) {
            return true;
        } else
            return false;
    }
}
