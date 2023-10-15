package week6.Exercise105;
import java.util.Scanner;
public class GuessingGame {
    private Scanner reader;

    public GuessingGame() {
        this.reader = new Scanner(System.in);
    }

    public void play(int lowerLimit, int upperLimit) {
        instructions(lowerLimit, upperLimit);
        //kontrollib, kas madalaim nr on väiksem kui suurem number
        while (lowerLimit < upperLimit) {
            //kutsub meetodi, millega arvutab keskmise
            int average = average(lowerLimit, upperLimit);
            //programm küsib, kas kasutaja müeldud number on suurem keskmisest
            if (isGreaterThan(average)) {
                //kui kasutaja vastab jah, siis teeb programm uueks madalamaks piiriks keskmise, kuid ta lisab sinna veel 1
                lowerLimit = average + 1;
            } else {
                //kui kasutaja vastab, et tema number on väiksem, kui pakutud keskmine, siis teeb programm selle keskmise uueks ülemiseks piiriks
                upperLimit = average;
            }
        }
        //Kui madal ja kõrgeim piir on sama, siis sai programm kasutaja arvu
        System.out.println("The number you're thinking of is " + lowerLimit + ".");
    }
    public boolean isGreaterThan(int value) {
        //küsib kasutajalt, kas ta number on suurem, kui programmi pakutud number
        System.out.println("Is your number greater than " + value + "? (y/n)");
        String answer = this.reader.nextLine();
            //returnib true, kui kasutaja sisestab y ja false, kui kasutaja sisestab n
            return answer.equals("y");

    }
    //arvutab keskmise väärtuse
    public int average(int number1, int number2) {
        return (number1 + number2) / 2;
    }


    public void instructions(int lowerLimit, int upperLimit) {
        int maxQuestions = howManyTimesHalvable(upperLimit - lowerLimit);

        System.out.println("Think of a number between " + lowerLimit + "..." + upperLimit + ".");

        System.out.println("I promise you that I can guess the number you are thinking of with " + maxQuestions + " questions.");
        System.out.println("");
        System.out.println("Next I'll present you with a series of questions. Answer them honestly.");
        System.out.println("");
    }

    // a helper method:
    public static int howManyTimesHalvable(int number) {
        // we create a base two logarithm  of the given value
        // Below we swap the base number to base two logarithms!
        return (int) (Math.log(number) / Math.log(2)) + 1;
    }


}
