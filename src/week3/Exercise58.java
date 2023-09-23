package week3;
import java.util.ArrayList;
import java.util.Scanner;

public class Exercise58 {
    public static void main(String[] main) {
        //luuakse list
        ArrayList<String> words = new ArrayList<String>();
        Scanner reader = new Scanner(System.in);
        //kasutajalt kysitakse vaartusi
        System.out.println("Type a word: ");
        while (true){
            String word = reader.nextLine();
            //kontollib, kas words list sisaldab juba word vaartusega sone
            if (words.contains(word)){
                //kui see sone toesti seal listis on, siis valjastatakse see kasutajale
                System.out.println("You gave the word " + word + " twice");
                break;
            }
            //kui sonade kordust ei ole, siis lisatakse sona listi
            words.add(word);
        }

    }

}
