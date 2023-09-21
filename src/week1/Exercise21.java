package week1;
import java.util.Scanner;
public class Exercise21 {
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        //Kysib kasutajalt aastat
        System.out.println("Type a year: ");
        int input = Integer.parseInt(reader.nextLine());
        if (input % 4 == 0){
            System.out.println("This year is a leap year.");
        }else {
            System.out.println("Thi year is not a leap year");
        }
    }
}
