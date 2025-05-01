import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class RPS {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        // get the player's choice
        System.out.print("Enter your choice Rock(1), Scissor(2), or Paper(3): ");
        int player = scanner.nextInt();
//        int player = 1;
        // computer randomly chooses
        int computer = rand.nextInt(1, 4); // 4 not included
        String computerString = "";
        switch (computer) {
            case 1:
                computerString = "Rock";
                break;
            case 2:
                computerString = "Scissor";
                break;
            case 3:
                computerString = "Paper";
                break;
        }
        System.out.println("Computer chose " + computerString);
        // determine who wins
        if (player == computer) {
            System.out.println("Tie!");
        } else if (player == 1 && computer == 2 ||
                player == 2 && computer == 3 ||
                player == 3 && computer == 1) {
            System.out.println("Player wins!");
        } else {
            System.out.println("Computer wins :(");
        }
    }
}
