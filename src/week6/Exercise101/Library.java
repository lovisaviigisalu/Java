package week6.Exercise101;

import java.util.List;
import java.util.ArrayList;

public class Library {
    private List<Book> books;
    //teeb Array nendest raamatutest mida on sisestatud läbi addBooki meetodi
    public Library() {
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }


    //prindib raamatu
    public void printBooks() {
        for (Book book : books) {
            System.out.println(book.toString());
        }
    }



    /*saame Otsitava sõna või väärtuse
    public ArrayList<Book> searchByTitle(String title) {
        //teeb uue array, et mahutada sobivaid raamatuid
        ArrayList<Book> booksThatMatch = new ArrayList<>();
        //vaatab kõiki raamatuid ja kui leiab midagi, mis sobib otsitavaga, siis ta lisab sellele array´le
        for (Book book : books) {
            if (book.title().contains(title)) {
                booksThatMatch.add(book);
            }
        }
        //tagastab selle Array Main classyle
        return booksThatMatch;
    };*/


    //teeb uue Array sobivate raamatute jaoks, vaatab läbi kõik raamatud ning tagastab need, mis on sobiv match
    public ArrayList<Book> searchByTitle(String title) {
        ArrayList<Book> booksThatMatch = new ArrayList<>();
        for (Book book : books) {
            if (StringUtils.included(book.getTitle(), title)) {
                booksThatMatch.add(book);
            }
        }
        return booksThatMatch;
    }

//teeb uue Array sobivate raamatute jaoks, vaatab läbi kõik raamatud ning tagastab need, mis on sobiv match
public ArrayList<Book> searchByPublisher(String publisher) {
    ArrayList<Book> booksThatMatch = new ArrayList<>();
    for (Book book : books) {
        if (StringUtils.included(book.getPublisher(), publisher)) {
            booksThatMatch.add(book);
        }
    }
    return booksThatMatch;
}

//otsib, kas on sellise aastaga raamatut
    public ArrayList<Book> searchByYear(int year) {
        ArrayList<Book> booksThatMatch = new ArrayList<>();
        for (Book book : books) {
            if (book.getYear() == year) {
                booksThatMatch.add(book);
            }
        }
        return booksThatMatch;
    }
}

