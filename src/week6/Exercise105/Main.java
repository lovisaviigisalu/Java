package week6.Exercise105;

public class Main {
    public static void main(String[] args) {
            GuessingGame game = new GuessingGame();

            System.out.println("First round: Guess a number between 1 and 10.");
            game.play(1, 10);

            System.out.println("Second round: Guess a number between 10 and 99.");
            game.play(10, 99);
        }

}
