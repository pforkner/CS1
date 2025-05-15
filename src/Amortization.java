// https://en.wikipedia.org/wiki/Mortgage_calculator#Monthly_payment_formula

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;

public class Amortization {

    public static void main(String[] args) throws FileNotFoundException {
        PrintStream out = new PrintStream(new File("amortization.csv"));

        double P = 30000;       // principal
        double apr = 5.84;      // annual percentage rate
        double r = apr/12/100;  // month rate
        int y = 4;              // term in years
        int N = 12*y;           // term in months
        double c = r*P/(1 - Math.pow((1 + r), -N));

        System.out.println("Monthly payment: " + c);

        out.println("Month, " + "Principal, " + "Interest," + "Balance");
        double balance = P;
        for (int mm = 1; mm <= N; mm++) {
            double interest = balance*r;
            double principal_pymt = c - interest;
            balance = balance - principal_pymt;
            out.println(mm + ", " + principal_pymt + ", " + interest + ", " + balance);
        }


    }
}
