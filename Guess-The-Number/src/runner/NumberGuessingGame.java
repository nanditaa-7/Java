package runner;

import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Random random = new Random();
        int target = random.nextInt(100) + 1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Guess The Number" +
                "between 1 to 100");
        int userEnteredNumber = 0;
        int attempt = 0;

        while (userEnteredNumber != target) {
            System.out.println("Enter The Number:");
            userEnteredNumber = scanner.nextInt();
            attempt++;
            if (userEnteredNumber<target) {
                System.out.println("Too Low!Try Again");
            } else if (userEnteredNumber>target) {
                System.out.println("Too High Try Again");
            } else {
                System.out.println("Correct..! Guess");
            }
        }
    }
}






