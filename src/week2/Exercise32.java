package week2;
//programm, millega arvutatakse summa
import java.util.Scanner;
public class Exercise32 {
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        //number, mise peale arvutamist valjastatakse
        int output = 0;
        //mille abil arvutatakse
        int number = 0;
        //kysib kasutajalt arvu, millega summat arvutatakse
        System.out.println("Unit what? ");
        int input = Integer.parseInt(reader.nextLine());
        while(number <= input){
            output += number;
            number++;
        }
        System.out.println("Sum is " + output);
        }
    }

