import java.util.Scanner;

public class PlayingWithWhile {

    public static int promptForInt(Scanner s, String prompt, int min, int max) {
        boolean isValidInput = false;
        int answer = -1;
        while (!isValidInput) {
            System.out.print(prompt);
            if (s.hasNextInt()) {
                answer = s.nextInt();
                s.nextLine(); // clear out the input stream
                // check that it's in range
                if (answer >= min && answer <= max) {
                    isValidInput = true;
                } else {
                    System.out.println("Number must be between " + min + " and " + max + ".");
                }
            } else {
                System.out.println("Please enter an integer.");
                s.nextLine(); // clear the input stream
            }
        }
        return answer;
    }

    // return the sum of the digits of n
    public static int sumOfDigits(int n) {
        int sum = 0;
        while (n != 0) {
            sum += n % 10;   // ones place digit
            n = n / 10;      // chops off the one's digit
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        int answer = promptForInt(scanner, "Enter a number between 1 and 4: ", 1, 4);
//        System.out.println("You entered: " + answer);

        System.out.println(sumOfDigits(314));
    }
}
