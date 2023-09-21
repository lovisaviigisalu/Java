package week1;
//arvutab toodele hindeid punktide jargi
import java.util.Scanner;
public class Exercise18 {
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        System.out.println("Sisesta punktid [0-60]: ");
        int punktid = Integer.parseInt(reader.nextLine());
        if (punktid <= 29){
            System.out.println("failed");
        } else if (punktid <= 34) {
            System.out.println("Hinne on: 1");
        } else if (punktid <= 39) {
            System.out.println("Hinne on: 2");
        }
        else if (punktid <= 44) {
            System.out.println("Hinne on: 3");
        }
        else if (punktid <= 49) {
            System.out.println("Hinne on: 4");
        }
        else if (punktid <= 60) {
            System.out.println("Hinne on: 5");
        }
    }
}
