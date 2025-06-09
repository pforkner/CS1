import java.util.Arrays;

public class CSBS7 {

    public static void banish(int[] a1, int[] a2) {
        for (int i = 0; i < a2.length; i++ ) { // loop through a2
            for (int j = 0; j < a1.length; j++) { // loop through a1
                if (a2[i] == a1[j]) { // if a2 is in a1
                    // remove that element from a1 and shift to the left
                    for (int k = j; k < a1.length - 1; k++) {
                        a1[k] = a1[k + 1];
                    }
                    // replace the last element of a1 with a zero
                    a1[a1.length - 1] = 0;
                    j--; // stay at current element of a1 since things got shifted left
                }
            }
        }
    }
    // 42, 3, 9, 42, 42, 0, 42, 9, 42, 42, 17, 8, 2222, 4, 9, 0, 1
    public static void main(String[] args) {
        int[] a1 = {42, 3, 9, 42, 42, 0, 42, 9, 42, 42, 17, 8, 2222, 4, 9, 0, 1};
        int[] a2 = {42, 2222, 9};
        System.out.println(Arrays.toString(a1));
        banish(a1, a2);
        System.out.println(Arrays.toString(a1));

    }

}
