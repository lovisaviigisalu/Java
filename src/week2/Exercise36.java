package week2;
import java.util.Scanner;

public class Exercise36 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        //algne keskmine
        double average = 0;
        //arvude summa algne vaartus
        int sum = 0;
        //algne vaartus, et lugeda input'ide arvu
        int inputcount = 0;
        //paaritud ja paaris arvude algne vaartus
        int even = 0;
        int odd = 0;


        //kysib kasutaja sisendit
        System.out.println("Type numbers: ");
        while (true) {
            int input = Integer.parseInt(reader.nextLine());
            //kui sisend on -1, siis loppeb programmi too
                if (input == -1) {
                    System.out.println("Thank you and see you later!");
                    break;
                }
            //arvutatakse sisestatud arvude summa
            if (input % 2 == 0){
                even++;
            } else {
                odd++;
            }
            sum +=input;
                //iga kord, kui tuleb juurde uus arv, liidetakse loendajale 1
            inputcount++;
            //arvutatakse kokku keskmine
            average = (double)sum/inputcount;


        }
        //Tulemuste valjastamine
        System.out.println("The sum is " + sum);
        System.out.println("How many numbers: " + inputcount);
        System.out.println("Average: " + average);
        System.out.println("Even numbers: " + even);
        System.out.println("Odd numbers: " + odd);
    }

}