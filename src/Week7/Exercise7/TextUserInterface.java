package Week7.Exercise7;

import java.util.Scanner;

public class TextUserInterface {
        private Scanner reader;
        private Dictionary dictionary;

        public TextUserInterface(Scanner reader, Dictionary dictionary) {
            this.reader = reader;
            this.dictionary = dictionary;
        }
    public void start() {
        System.out.println("Statements:\n  add - adds a word pair to the dictionary");
        System.out.println("  translate - asks a word and prints its translation");
        System.out.println("  quit - quits the text user interface");

        while (true) {
            System.out.print("Statement: ");
            String input = reader.nextLine();

            if (input.equals("quit")) {
                System.out.println("Cheers!");
                break;
            } else if (input.equals("add")) {
                addWordPair();
            } else if (input.equals("translate")) {
                translateWord();
            } else {
                System.out.println("Unknown statement");
            }
        }
    }

    public void addWordPair() {
        System.out.print("In Finnish: ");
        String word = reader.nextLine();
        System.out.print("Translation: ");
        String translation = reader.nextLine();
        dictionary.add(word, translation);
    }

    public void translateWord() {
        System.out.print("Give a word: ");
        String word = reader.nextLine();
        String translation = dictionary.translate(word);
        if (translation != null) {
            System.out.println("Translation: " + translation);
        } else {
            System.out.println("Unknown word");
        }
    }

        public static void main(String[] args) {
            Scanner reader = new Scanner(System.in);
            Dictionary dictionary = new Dictionary();

            TextUserInterface ui = new TextUserInterface(reader, dictionary);
            ui.start();
            reader.close();
        }
}


