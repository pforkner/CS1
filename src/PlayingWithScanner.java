import java.util.Scanner;

public class PlayingWithScanner {
    public static double gradePoint(int percentage) {
        System.out.println("HI");
        return 3.0/35*(percentage - 60) + 1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double gp = gradePoint(94);
        System.out.println(gp);

//        int n = 4;
//        String name = new String("Phillip");
//        System.out.println(name);
//        System.out.print("What is your age? ");
//        int age = scanner.nextInt();
//        scanner.nextLine(); // clear out the input stream
//        System.out.print("What is your name? ");
//        String name = scanner.nextLine();
//        System.out.println("Hello " + name + ", you are " + age + " years old.");


    }
}
