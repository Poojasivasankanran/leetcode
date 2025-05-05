import java.util.Scanner;

public class CRTSimple {
    
    // Helper function to find modular inverse
    static int modInverse(int a, int m) {
        for (int x = 1; x < m; x++) {
            if ((a * x) % m == 1)
                return x;
        }
        return 1; // Won't reach here if m is prime and a is coprime
    }

    static int findX(int[] div, int[] rem, int k) {
        int prod = 1;
        for (int i = 0; i < k; i++)
            prod *= div[i];

        int result = 0;

        for (int i = 0; i < k; i++) {
            int pp = prod / div[i];
            int inv = modInverse(pp, div[i]);
            result += rem[i] * pp * inv;
        }

        return result % prod;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter number of equations: ");
        int k = sc.nextInt();
        
        int[] div = new int[k];
        int[] rem = new int[k];

        System.out.println("Enter divisors:");
        for (int i = 0; i < k; i++) {
            div[i] = sc.nextInt();
        }

        System.out.println("Enter remainders:");
        for (int i = 0; i < k; i++) {
            rem[i] = sc.nextInt();
        }

        int x = findX(div, rem, k);
        System.out.println("Smallest x = " + x);

        sc.close();
    }
}
