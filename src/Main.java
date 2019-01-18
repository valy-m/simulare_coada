import carduri.CardMaestro;
import carduri.CardMasterCard;
import carduri.CardVisa;

public class Main {

    public static void main(String[] args) {
        Coada coada = new Coada(3);
        CardVisa card = new CardVisa("Ionescu Protopopescu", "1234567890123456", "123");
        CardMasterCard card1 = new CardMasterCard("Popescu", "55552222333444400", "111");
        CardMaestro card3 = new CardMaestro("Vasilescu", "55522223334644400");
        CardMaestro card4 = new CardMaestro("Vasilescu", "55522223334644400");
        coada.putCard(card);
        coada.putCard(card1);
        coada.putCard(card3);
        coada.putCard(card4);
        coada.displayCard();
        Strategie strategie = new CautaNume("Vasilescu");
        if (coada.esteInCoada(strategie)) {
            System.out.println("Cardul a fost gasit. ");
        } else System.out.println("Numele cautat nu exista");
        Strategie strategie1 = new VerificaNumar('5');
        if (coada.esteInCoada(strategie1)) {
            System.out.println("Cifra 5 apare de 3 ori in numarul cardului. ");
        } else System.out.println("Cautarea nu corespunde\n");

        System.out.println("Cardul sters este: \n"+coada.getAndDeleteCard());
        System.out.println("Cardurile existente dupa stergere sunt");
        coada.displayCard();
        coada.putCard(card);
        System.out.println("Cardurile existente dupa adaugarea unuia nou sunt");

        coada.displayCard();
        coada.putCard(card);
        System.out.println("Cardul sters este: \n"+coada.getAndDeleteCard());
        System.out.println("Cardul sters este: \n"+coada.getAndDeleteCard());
        System.out.println("Cardurile existente dupa stergere sunt");

        coada.displayCard();







    }
}
