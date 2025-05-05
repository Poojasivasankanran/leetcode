/* 
import java.util.Scanner;

public class EulerPhi {

    static int phi(int n) {
        int result = n;

        for (int p = 2; p * p <= n; p++) {
            if (n % p == 0) {
                while (n % p == 0)
                    n /= p;
                result -= result / p;
            }
        }

        if (n > 1)  // n is a prime number greater than sqrt(original n)
            result -= result / n;

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        System.out.println("Euler's Totient Function φ(" + n + ") = " + phi(n));
    }
}
*/






import java.util.Scanner;

public class EulerPhi {

    // Function to compute Euler's Totient Function for large numbers
    static long phi(long n) {
        long result = n;

        for (long p = 2; p * p <= n; p++) {
            // If p is a prime factor of n
            if (n % p == 0) {
                // Subtract multiples of p
                while (n % p == 0)
                    n /= p;
                result -= result / p;
            }
        }

        // If n has a prime factor > sqrt(n)
        if (n > 1)
            result -= result / n;

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        long n = sc.nextLong();

        long result = phi(n);
        System.out.println("Euler's Totient (phi) of " + n + " is: " + result);
    }
}
