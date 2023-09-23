package week3;
import java.util.ArrayList;
import java.util.Scanner;
public class Exercise57 {
    public static void main(String[] main){
        //loome listi
        ArrayList<String> words = new ArrayList<String>();
        Scanner reader = new Scanner(System.in);
    //kasutajalt kysitakse vaartusi
    System.out.println("Type a word: ");
    while (true){
        String word = reader.nextLine();
        //kui kasutaja mitte midagi ei sisestanud, siis kuvatakse kogu sisestatud list
        if (word.isEmpty()) {
            break; //
        }
        //kui sonade kordust ei ole, siis lisatakse sona listi
        words.add(word);
    }
    //iga sona valjastatakse nii eraldi real
    for (String word : words){
        System.out.println(word);
    }
}
}
