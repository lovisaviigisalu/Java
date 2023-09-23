package week3;
import java.util.Scanner;
public class Exercise53 {
    public static void main(String[] args){
    Scanner reader = new Scanner(System.in);
    //Kysib kasutajalt sone
    System.out.println("Type a word: ");
    String word = reader.nextLine();
    //Kysib kasutajalt tahtesid
    System.out.println("Length of the first part: ");
    int length = Integer.parseInt(reader.nextLine());
        int n = 0;
        while (n < length) {
           char tulem = word.charAt(n);
            System.out.print(tulem);
            n++;
        }

        System.out.println();
    }


}
