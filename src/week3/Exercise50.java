package week3;
import java.util.Scanner;
public class Exercise50 {
    public static void main(String [] args) {
        Scanner reader = new Scanner(System.in);
        //kysib kasutajalt nime
        System.out.println("Sisesta nimi: ");
        String name = reader.nextLine();
        //kui nimi on lyhem kui 3 tahte, siis see jaetakse valja
        if (name.length()<3){
        System.out.println();
        }else{
            int n = 0;
           while (n<3){
            char character = name.charAt(n);
            System.out.println(character);
            n++;
        }}

    }
}
