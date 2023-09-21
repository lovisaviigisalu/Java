package week1;
//vanuse voimalikkus
import java.util.Scanner;
public class Exercise19 {
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        //kysib kasutajalt vanust
        System.out.println("How old are you? ");
        int age = Integer.parseInt(reader.nextLine());
        //arvutab, kas on voimalik nii vana olla, kui kasutaja sisestas
        if (age>0 && age<120){
            System.out.println("OK");
        }else{
            System.out.println("Impossible!");
        }

    }
}
