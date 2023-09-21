package week1;
//oige passwordi sisestades kuvatakse saladus
import java.util.Scanner;
public class Exercise22 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String password = "carrot";
        while (true) {
            //kysib kasutajalt sisendit
            System.out.println("Type the password: ");
            String input = reader.nextLine();

            if (input.equals(password)) {
                System.out.println("Right!");
                //Kui salasona ara arvatakse, siis rohkem seda ei kysita ja valjastatakse secret
                break;
            } else {
                System.out.println("Wrong!\n");
            }
        }
        System.out.println("The secret is: jryy qbar!");
    }
}
