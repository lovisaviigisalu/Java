package week1;
//vaatab, kas arv on paaris/paaritu
import java.util.Scanner;
public class Exercise16 {
    public static void main (String[] args){
        Scanner reader = new Scanner(System.in);
        //kysib kasutajalt sisendit
        System.out.println("Sisesta number");
        int number = Integer.parseInt(reader.nextLine());
        if (number % 2 == 0){
            System.out.println("Number " + number + " is even.");
        }else {
            System.out.println("Number " + number + " is odd.");
        }
    }
}

