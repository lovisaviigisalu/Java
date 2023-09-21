package week1;
//see programm vaatab, kas arv on positiivne/negatiivne
import java.util.Scanner;
public class Exercise14 {
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        //Kysib kasutajalt nr
        System.out.println("Sisesta number: ");
        int number = Integer.parseInt(reader.nextLine());
        //arvutab, kas on pos voi neg
        if (number == 0){System.out.println("Neutraalne"); }
        else if (number > 0)
        {System.out.println("See number on positiivne!");}
        else {
            System.out.println("See number on negatiivne!");}
    }
}