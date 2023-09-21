package week1;
import java.util.Scanner;
//arvutab kahe arvu jagatise
public class Exercise9 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        //Kysib 1. numbrit
        System.out.println("Type a number:");
        int firstnumber = Integer.parseInt(reader.nextLine());
        //Kysin 2. numbrit
        System.out.println("Type another number:");
        int secondnumber = Integer.parseInt(reader.nextLine());
        //arvutab kokku
        double kokku = (double)firstnumber / secondnumber;
        //valjastab
        System.out.println(kokku);
    }
}
