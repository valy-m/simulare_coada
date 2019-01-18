import carduri.Card;

public class Coada {
    private Card[] listCoada;
    private int arraySize;
    private int setPosition;
    private int currentPosition;


    public Coada(int size) {
        if (size <= 0) {
            throw new IllegalArgumentException();
        } else arraySize = size;
        listCoada = new Card[size];
        setPosition = 0;
        currentPosition=0;
    }

    public void putCard(Card element) {
        try {
            listCoada[setPosition] = element;
            setPosition=setPosition+1;
        } catch (Exception e) {
        }
    }

    public Card getAndDeleteCard() {
        Card element = listCoada[currentPosition];
        for (int i = 0; i < listCoada.length-1; i++) {
            listCoada[i]=listCoada[i+1];
            setPosition=i+1;
        }
        listCoada[setPosition]=null;
            return element;
    }

    public void displayCard() {
        for (Card card : listCoada) {
            if ( card!=null )
                System.out.println(card.toString());
        }
    }

    public boolean esteInCoada(Strategie strategie) {
        boolean esteInCoada = false;
        for (Card card : listCoada) {
            if (strategie.conditie(card)) {
                esteInCoada = true;
                break;
            }
        }
        return esteInCoada;
    }

}
