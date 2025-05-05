/* 
import java.util.Scanner;

public class SimpleSieve {
    
    static void sieveOfEratosthenes(long n) {
        boolean[] isPrime = new boolean[(int)n + 1];
        for (int i = 0; i <= n; i++) {
            isPrime[i] = true; 
        isPrime[0] = isPrime[1] = false; 

        
        for (int i = 2; i * i <= n; i++) {
            if (isPrime[p]) {
                
                for (int j = i * i; j <= n; j += i) {
                    isPrime[i] = false;
                }
            }
        }

        
        System.out.println("Prime numbers up to " + n + " are:");
        for (int i = 2; i <= n; i++) {
            if (isPrime[i]) {
                System.out.println(i); // Print each prime number on a new line
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        long n = sc.nextLong();
        sieveOfEratosthenes(n);
    }
}
*/

import java.util.BitSet;
import java.util.Scanner;

public class SimpleSieve {
    // Function to print all primes less than or equal to n
    static void sieveOfEratosthenes(long n) {
        // Create a BitSet to store primes
        BitSet isPrime = new BitSet((int)n + 1);
        isPrime.set(2, (int)n + 1);  // Mark all numbers as prime (start with 2)

        // Mark non-primes
        for (int p = 2; p * p <= n; p++) {
            if (isPrime.get(p)) {
                // Mark all multiples of p as false
                for (int i = p * p; i <= n; i += p) {
                    isPrime.clear(i);
                }
            }
        }

        // Print all prime numbers
        System.out.println("Prime numbers up to " + n + " are:");
        for (int i = 2; i <= n; i++) {
            if (isPrime.get(i)) {
                System.out.println(i); // Print each prime number on a new line
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        long n = sc.nextLong();
        sieveOfEratosthenes(n);
    }
}
