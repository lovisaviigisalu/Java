package week4.Exercise77;

public class Main {
    public static void main(String[] args) {
        //kaks kaarti
        LyyraCard cardPekka = new LyyraCard(20);
        LyyraCard cardBrian = new LyyraCard(30);
        //lisame kaardi omanike nimed
        cardBrian.setOwner("Brian");
        cardPekka.setOwner("Pekka");
        //Pekka buys gourmet lunch
        cardPekka.payGourmet();
        //Brian buys economical lunch
        cardBrian.payEconomical();
        //cards are printed (both on their own row, starting with the name of the card owner)
        System.out.println(cardPekka);
        System.out.println(cardBrian);
        //Pekka loads 20 euros
        cardPekka.loadMoney(20);
        //Brian buys gourmet lunch
        cardBrian.payGourmet();
        //cards are printed (both on their own row, starting with the name of the card owner)
        System.out.println(cardPekka);
        System.out.println(cardBrian);
        //Pekka buys economical lunch 2x
        cardPekka.payEconomical();
        cardPekka.payEconomical();
        //Brian loads 50 euros
        cardBrian.loadMoney(50);
        //cards are printed (both on their own row, starting with the name of the card owner)
        System.out.println(cardPekka);
        System.out.println(cardBrian);
    }
    }
