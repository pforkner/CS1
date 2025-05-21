import java.util.Arrays;
import java.util.Random;

public class PlayingWithArrays {

    // generates a random array of size n with numbers between
    // min (inclusize) and max (exclusive
    public static int[] generateRandomArray(int n, int min, int max) {
        Random rand = new Random();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
//            arr[i] = min + (int) (Math.random() * (max - min)); // or use Random
            arr[i] = rand.nextInt(max - min) + min;
        }
        return arr;
    }

    public static String toString(int[] arr) {
        if (arr.length == 0) {
            return "[]";
        } else {
            String result ="["; // should use a StringBuilder
            for (int i = 0; i < arr.length - 1; i++) {
                result += arr[i] + ", ";
            }
            result += arr[arr.length - 1] + "]";
            return result;
        }
    }

    // adds n to the end of the array a
    public static int[] add(int[] a, int n) {
        // create a new array one bigger
        int[] newArray = new int[a.length + 1];
        // copy the old array
        for (int i = 0; i < a.length; i++) { // loop through the old array
            newArray[i] = a[i];
        }
        // add the number to the end
        newArray[a.length] = n;
//        newArray[newArray.length - 1] = n
        return newArray;
//        System.out.println(toString(a));
    }

    public static int[] add(int[] a, int[] b) { // overloading
        int[] newArray = new int[a.length + b.length];
        for (int i = 0; i < a.length; i++) {
            newArray[i] = a[i];
        }
        for (int i = 0; i < b.length; i++) {
            newArray[a.length + i] = b[i];
        }
        return newArray;
    }

    public static void modifyArray(int[] arr, int n) {
        arr[0] = 56;
        n = 7;
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
        System.out.println(toString(a));
        System.out.println();
        int[] b = new int[5];
        System.out.println(b.length);
        System.out.println(Arrays.toString(b));

        int[] c = generateRandomArray(10, 0, 10);
        System.out.println(c);
        System.out.println(toString(c));
        c = add(c, 14);
        System.out.println(c);
        System.out.println(toString(c));
        int n = 5;
        modifyArray(c, n);
        System.out.println(toString(c));
        System.out.println(n);

        int[] d = add(a, c);
        System.out.println(toString(d));

        for (int j : a) {
            System.out.println(j);
        }

    }
}
