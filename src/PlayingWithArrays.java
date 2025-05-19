import java.util.Arrays;

public class PlayingWithArrays {

    public static void printArray(int[] arr) {
        if (arr.length == 0) {
            System.out.println("[]");
        } else {
            System.out.print("[");
            for (int i = 0; i < arr.length - 1; i++) {
                System.out.print(arr[i] + ", ");
            }
            System.out.println(arr[arr.length - 1] + "]");
        }
    }

    public static void main(String[] args) {
        //             0123456
        String name = "phillip";
        System.out.println(name.charAt(5));
//        name.charAt(5) = 'I';  Strings are immutable

        //                    0          1         2       3
        String[] names = {"phillip", "forkner", "bomb", "maker"};
        names[3] = "mak uh";
        System.out.println(names[3]);

        int[] a = {1, 2, 3, 4, 5};
        System.out.println(a);
        printArray(a);
        System.out.println();
        int[] b = new int[5];
        System.out.println(b.length);
        System.out.println(Arrays.toString(b));

    }
}
