package week2;
import java.util.Scanner;
public class Exercise26 {
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        //algselt defineerime, et summa on 0
        int sum = 0;
        while(true) {
            //kasutaja siestab numbri
            int input = Integer.parseInt(reader.nextLine());
            if (input == 0){
                //kui kasutaja sisestab 0, siis lopetab programm numbrite liitmise ja kuvatakse loppsumma
                break;
            }else{
                //Programm arvutab, et vana summa +  sisestatud nr = uus summa
                sum = sum +input;
                System.out.println(sum);
            }
            //Valjastatakse loppsumma
        }System.out.println("Sum in the end is: " + sum);
    }
}
