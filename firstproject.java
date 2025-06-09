import java.util.Random;
import java.util.Scanner;

public class firstproject {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
Random rand = new Random();
int score = 0;

 while (true) {
  int number = rand.nextInt(100) + 1;
  int attempts = 5;
  boolean won = false;
  System.out.println("\nGuess the number (1 to 100)! You have 5 attempts.");

  for (int i = 1; i <= attempts; i++) {
                System.out.print("Attempt " + i + ": ");
                int guess = input.nextInt();

   if (guess == number) {
        System.out.println("🎉 Correct! You win this round.");
        score++;
        won = true;
        break;
         } else if (guess < number) {
         System.out.println("Too low.");
         } else {
         System.out.println("Too high.");
             }
            }
        if (!won) {
                System.out.println("Out of attempts. The correct number was " + number + ".");
            }
            System.out.print("Play again? (yes/no): ");
            input.nextLine();
            String again = input.nextLine();
            if (!again.equalsIgnoreCase("yes")) break;
        }
        System.out.println("Game over! You won " + score + " round(s).");
        input.close();
    }
}
