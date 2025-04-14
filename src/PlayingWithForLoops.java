public class PlayingWithForLoops {
    public static void main(String[] args) {
        // fencepost problem
//        int i = 0;
//        System.out.print("[");
//        for (i = 0; i < 9; i++) { // i = i + 2
//            System.out.print(i%7 + ", ");
//        }
//        System.out.println(i%7 + "]");

        int N = 1*5;
        for (int slice = 0; slice < N; slice++) {
            System.out.println("slice: " + slice);
            for (int row = 0; row < N; row++) {
                for (int col = 0; col < N; col++) {
                    System.out.print("(" + row + "," + col + ") ");
                }
                System.out.println();
            }
        }

    }
}
