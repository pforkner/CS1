import java.util.*;

public class Piglet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Welcome to Piglet!");
        int points = 0;
        boolean rollAgain = true;
        int roll = -1;
        while (roll != 1 && rollAgain) {
            roll = random.nextInt(1, 7); // random int 1 through 6
            System.out.println("You rolled a " + roll + "!");
            points = points + roll;
            if (roll == 1) points = 0;
            else {
                System.out.print("Roll again? ");
                String input = scanner.nextLine();
                if (input.toLowerCase().charAt(0) != 'y') {
                    rollAgain = false;
                }
            }
        }
        System.out.println("You got " + points + " points.");
    }
}
