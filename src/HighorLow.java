
import java.util.Random;
import java.util.Scanner;
public class HighorLow {
    static void main() {
        Random generator = new Random(); // I usually call it rnd or gen
        int val = generator.nextInt(10) + 1;
        boolean done = false;
        Scanner in = new Scanner(System.in);
        int numberGuess = 0;
        String trash = "";
        do {
            System.out.println("Guess the number between 1 and 10: ");
            if (in.hasNextInt()) {
                numberGuess = in.nextInt();
                if (numberGuess >= 1 && numberGuess <= 10) {
                    if (numberGuess == val) {
                        System.out.println("You guessed the number!");
                        System.out.println("The random number was " + val);
                        done = true;
                    } else if (numberGuess < val) {
                        System.out.println("Your guess is too low!");
                        System.out.println("The random number was " + val);
                        done = true;
                    } else {
                        System.out.println("Your guess is too High");
                        System.out.println("The random number was " + val);
                        done = true;
                    }
                }else {
                    System.out.println("Please enter a number between 1 and 10");
                }
            } else {
                trash = in.nextLine();
                System.out.println("You said your guess was " + trash);
                System.out.println("Please enter a valid Amount (1-10)");
            }
        }while (!done) ;
    }
}
