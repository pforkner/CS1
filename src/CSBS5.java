public class CSBS5 {

    public static void armstrongNumbers(int n) {
        if (n == 1) {
            for (int i = 0; i < 10; i++) {
                System.out.print(i + " ");
            }
        } else {
            int min = (int)Math.pow(10, n - 1);
            int max = (int)Math.pow(10, n) - 1;
            // loop through all the n digit numbers
            for (int i = min; i <= max; i++) {
                // sum each digit to the power n
                int sum = 0;
                int temp = i;
                while (temp != 0) {
                    sum += (int)Math.pow(temp % 10, n); // ones place digit
                    temp /= 10;                         // chop off the ones place digit
                }
                // check if that number is an Armstrong number
                if (sum == i) System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args) {
        for (int n = 0; n < 10; n++) {
            System.out.print(n + " digits: ");
            armstrongNumbers(n);
            System.out.println();
        }
    }
}
