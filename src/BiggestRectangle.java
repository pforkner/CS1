import java.io.*;
import java.util.*;

public class BiggestRectangle {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner fileScanner = new Scanner(new File("Rectangles.dat"));
        while (fileScanner.hasNext()) {
            System.out.println(fileScanner.next());
        }
    }
}
