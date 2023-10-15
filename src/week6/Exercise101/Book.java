package week6.Exercise101;

public class Book {
    private String title;
    private String publisher;
    private int year;

//saab Main meetodilt kätte pealkirja, kirjastaja ja aasta ning tagastab selle kui üks raamat
    public Book(String title, String publisher, int year) {
        this.title = title;
        this.publisher = publisher;
        this.year = year;
    }

    public String getTitle() {
        return this.title;
    }

    public String getPublisher() {
        return publisher;
    }


    public int getYear() {
        return year;
    }


    public String toString() {
        return this.title + ", " + this.publisher + ", " + this.year;
    }
}
