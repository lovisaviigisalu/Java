package week3;
import java.util.Scanner;
//programm, mis tagastab teksti tagurpidi
public class Exercise56 {
    public static String reverse(String text) {
        String help = ""; // Koht, kuhu tahed lisatakse, et neid valjastada
        int index = text.length() - 1; // Kuna loendamist alustatakse 0st, siis lahutatakse oigete tahtede saamiseks 1 maha

        while (index >= 0) {
            char character = text.charAt(index); // Voetakse selle teatud indexiga taht sealt sonast
            help += character; //Taht lisatakse valjundisse
            index--; // Kuna alustame tahtede lugemist tagant poolt, siis peame jargmise tahe saamiseks lahutama indexist 1.
        }

        return help; // Return the reversed string
    }

//see meetod kysib ja valjastab teksti
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type in your text: ");
        String text = reader.nextLine();
        System.out.println("In reverse order: " + reverse(text));
    }

}
