package week6.Exercise101;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //raamtute info valjastamine
        /*Book cheese = new Book("Cheese Problems Solved", "Woodhead Publishing", 2007);
        System.out.println(cheese.title());
        System.out.println(cheese.publisher());
        System.out.println(cheese.year());

        System.out.println(cheese);*/


        //raamatute array-sse lisamine ja selle array valjastamine
        Library library = new Library();
/*
        Book cheese = new Book("Cheese Problems Solved", "Woodhead Publishing", 2007);
        //lisab libraryle juurde antud raamatu
        library.addBook(cheese);

        Book nhl = new Book("NHL Hockey", "Stanley Kupp", 1952);
        lisab libraryle juurde antud raamatu
        library.addBook(nhl);

        library.addBook(new Book("Battle Axes", "Tom A. Hawk", 1851));
        //prindib sisestatud raamatud
        library.printBooks();*/

        //Otsimine
        //saame otsitava ja siis ta suunab seda otsime

        library.addBook(new Book("Cheese Problems Solved", "Woodhead Publishing", 2007));
        library.addBook(new Book("The Stinky Cheese Man and Other Fairly Stupid Tales", "Penguin Group", 1992));
        library.addBook(new Book("NHL Hockey", "Stanley Kupp", 1952));
        library.addBook(new Book("Battle Axes", "Tom A. Hawk", 1851));

        ArrayList<Book> result = library.searchByTitle("CHEESE");
        for (Book book : result) {
            System.out.println(book);
        }

        System.out.println("---");
        for (Book book : library.searchByPublisher("PENGUIN")) {
            System.out.println(book);
        }

    }
}

