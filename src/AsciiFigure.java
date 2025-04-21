/*
April 16, 2025
Phillip Forkner
 */

public class AsciiFigure {
    public static final int SIZE = 5;

    public static void writeChars(char c, int n) {
        for (int i = 0; i < n; i++) System.out.print(c);
    }

    public static void main(String[] args) {
        for (int row = 0; row < SIZE; row++) {
            writeChars('/', (SIZE - row  - 1)*4);
            writeChars('*', row*8);
            writeChars('\\', (SIZE - row  - 1)*4);
            System.out.println();
        }
    }
}
