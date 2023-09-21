package week2;
import java.util.Scanner;
public class Exercise30 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int number = 1;
        //Kysib kasutajalt sisendit
        System.out.println("Up to what number? ");
        int input = Integer.parseInt(reader.nextLine());
        //valjastatav number ei tohi olla suurem kui kasutaja sisend
        while(number<=input){
            //valjastab numbri ja siis liidab juurde yhe nii kaua, kuni valjastatav nr on sama, mis sisestatud
            System.out.println(number);
            number++;
        }
    }
}
