package Week7.Exercise7;
import java.util.HashMap;
import java.util.ArrayList;

public class Dictionary {
    private HashMap<String, String> wordMap;

    public Dictionary() {
        this.wordMap = new HashMap<>();
    }

    public void add(String word, String translation) {
        wordMap.put(word, translation);
    }

    public String translate(String word) {
        return wordMap.get(word);
    }

    public int amountOfWords() {
        return wordMap.size();
    }

    public ArrayList<String> translationList() {
        ArrayList<String> translation = new ArrayList<>();
        for (String key : wordMap.keySet()) {
            String value = wordMap.get(key);
            translation.add(key + " = " + value);
        }
        return translation;
    }

    public static void main(String[] args) {

        Dictionary dictionary = new Dictionary();
        dictionary.add("apina", "monkey");
        dictionary.add("banaani", "banana");
        dictionary.add("cembalo", "harpsichord");

        ArrayList<String> translations = dictionary.translationList();
        for (String translation : translations) {
            System.out.println(translation);
        }
    }
}
