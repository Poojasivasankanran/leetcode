import java.util.*;

public class Simple {

    static void segmentedSieve(long low, long high) {
        int limit = (int) Math.sqrt(high) + 1;

        // Step 1: Generate base primes up to sqrt(high)
        boolean[] isPrimeBase = new boolean[limit + 1];
        Arrays.fill(isPrimeBase, true);
        isPrimeBase[0] = isPrimeBase[1] = false;

        for (int i = 2; i * i <= limit; i++) {
            if (isPrimeBase[i]) {
                for (int j = i * i; j <= limit; j += i) {
                    isPrimeBase[j] = false;
                }
            }
        }

        // Step 2: Create array for range [low, high]
        boolean[] isPrime = new boolean[(int)(high - low + 1)];
        Arrays.fill(isPrime, true);

        for (int i = 2; i <= limit; i++) {
            if (isPrimeBase[i]) {
                long start = Math.max((long)i * i, ((low + i - 1) / i) * i);
                for (long j = start; j <= high; j += i) {
                    isPrime[(int)(j - low)] = false;
                }
            }
        }

        if (low == 1) isPrime[0] = false;

        // Step 3: Print primes
        for (int i = 0; i < isPrime.length; i++) {
            if (isPrime[i]) {
                System.out.println(low + i);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter low and high: ");
        long n = sc.nextLong();
        long m = sc.nextLong();

        if (n > m || n < 1 || m > Integer.MAX_VALUE) {
            System.out.println("Invalid input range.");
            return;
        }

        segmentedSieve(n, m);
    }
}
