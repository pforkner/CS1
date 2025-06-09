// a prime number is only divisible by itself and 1
// otherwise it's a composite
// 0 and 1 are not prime

public class PlayingWithPrimes {
    public static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i < n/2; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    // return an array of size n. If that element is True, then it's prime, otherwise composite
    public static boolean[] sieve(int n) {
        boolean[] primes = new boolean[n];
        for (int i = 0; i < n; i++) {
            primes[i] = true;
        }
        primes[0] = false;
        primes[1] = false;
        for (int i = 2; i < (int)Math.sqrt(n); i++) {
            if (primes[i]) {
                for (int j = i * i; j < n; j += i) {
                    primes[j] = false;
                }
            }
        }
        return primes;
    }

    public static void main(String[] args) {
        int N = 100;
        for (int i = 2; i < N; i++) {
            if (isPrime(i)) System.out.print(i + ", ");
        }
//        System.out.println("-----");
        boolean[] primes = sieve(N);
        for (int i = 0; i < primes.length; i++) {
            if (primes[i]) System.out.print(i + ", ");
        }
    }
}
