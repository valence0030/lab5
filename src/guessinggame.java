import java.util.Scanner;
import java.util.Random;
public class guessinggame {
    static int playGuessingGame() {
        Random rand = new Random();
        Scanner scan = new Scanner(System.in);

        int secret = rand.nextInt(10) + 1;

        int guess = 0;
        int attempts = 0;

        while (guess != secret) {
            System.out.println("Guess a number between 1 and 10: ");
            guess = scan.nextInt();
            attempts++;
            if (guess < secret) {
                System.out.println("too low");
            } else if (guess > secret)
                System.out.println("too high");
            else
                System.out.println("Correct! ");
            return attempts;

        }

        return secret;
    }
public static void main (String[]args){
            int tries = playGuessingGame();

            System.out.println("You have " + tries + " guesses left.");


        }


    }