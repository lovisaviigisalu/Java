package week1;
//arvutab ringi ymbermoodu
import java.util.Scanner;
public class Exercise10 {
    public static void main(String[] args){
        Scanner reader = new Scanner (System.in);
        //Kysib kasutajalt raadiust
        System.out.println("Sisesta raadius:");
        int raadius = Integer.parseInt(reader.nextLine());
        //arvutab ymbermoodu
        double ymbermoot = raadius * 2 * Math.PI;
        //valjastab
        System.out.println(ymbermoot);
    }
}
