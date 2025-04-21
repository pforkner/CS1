package CSBS;

public class CSBS2 {
    public static void numberSquare(int min, int max) {
        int base = max - min + 1;
        for (int row = 0; row < base; row++) {
            for (int col = 0; col < base; col++) {
                System.out.print((row + col)%base + min);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        numberSquare(1, 5);
//        for (int i = 0; i < 10; i++) {
//            System.out.print(i%3 + ", ");
//        }
    }
}
