package week8.Exercise11;

public class CD implements ToBeStored {
    private String artist;
    private String title;
    private int publishing_year;
    private double weight;

    public CD(String artist, String title, int publishing_year){
        this.artist = artist;
        this.title = title;
        this.publishing_year=publishing_year;
        this.weight = 0.1;
    }

    public double weight() {
        return weight;
    }

    @Override
    public String toString() {
        return artist + ": " + title + " (" + publishing_year + ")";
    }
}
