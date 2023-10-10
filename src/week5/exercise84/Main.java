package week5.exercise84;

public class Main {
    public static void main(String[] args) {

        // Loome uue lugeja, algväärtusega 10 ja kontroll on sisse lülitatud
        Counter counter1 = new Counter(10, true);
        // Loome teise lugeja, algväärtusega 5 (kontroll on vaikimisi välja lülitatud)
        Counter counter2 = new Counter(5);
        // Loome kolmanda lugeja, vaikimisi algväärtuse ja kontrolliga
        Counter counter3 = new Counter(true);
        // Loome neljanda lugeja, vaikimisi algväärtuse ja kontrollita
        Counter counter4 = new Counter();

        // Väljastame esimese lugeja algväärtuse
        System.out.println("Counter 1 algväärtus: " + counter1.getValue());

        // Suurendame esimese lugeja väärtust
        counter1.increase();
        System.out.println("Counter 1 väärtus pärast suurendamist: " + counter1.getValue());

        // Vähendame lugeja väärtust
        counter1.decrease();
        System.out.println("Counter 1 väärtus pärast vähendamist: " + counter1.getValue());

        // Väljastame teise lugeja algväärtuse
        System.out.println("Counter 2 algväärtus: " + counter2.getValue());

        // Vähendame teise lugeja väärtust 3 võrra
        counter2.decrease(3);
        System.out.println("Counter 2 väärtus pärast vähendamist: " + counter2.getValue());

        // Väljastame kolmanda lugeja algväärtuse
        System.out.println("Counter 3 algväärtus: " + counter3.getValue());

        // Suurendame kolmanda lugeja väärtust 7 võrra
        counter3.increase(7);
        System.out.println("Counter 3 väärtus pärast suurendamist: " + counter3.getValue());


        // Väljastame neljanda lugeja algväärtuse
        System.out.println("Counter 4 algväärtus: " + counter4.getValue());

        // Vähendame neljanda lugeja väärtust 2 võrra (kontroll on vaikimisi välja lülitatud)
        counter4.decrease(2);
        System.out.println("Counter 4 väärtus pärast vähendamist: " + counter4.getValue());
    }
}

