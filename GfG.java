import java.util.Scanner;

public class GfG {

    // Brute-force method to find x such that:
    // x % num[i] = rem[i] for all i
    static int findMinX(int[] num, int[] rem, int k) {
        int x = 1; // Start from 1

        while (true) {
            int j;
            for (j = 0; j < k; j++) {
                if (x % num[j] != rem[j])
                    break;
            }

            if (j == k)
                return x; // Found answer

            x++;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of equations (k): ");
        int k = sc.nextInt();

        int[] num = new int[k];
        int[] rem = new int[k];

        System.out.println("Enter " + k + " moduli (pairwise coprime):");
        for (int i = 0; i < k; i++) {
            System.out.print("num[" + i + "]: ");
            num[i] = sc.nextInt();
        }

        System.out.println("Enter " + k + " remainders:");
        for (int i = 0; i < k; i++) {
            System.out.print("rem[" + i + "]: ");
            rem[i] = sc.nextInt();
        }

        int result = findMinX(num, rem, k);
        System.out.println("x is " + result);
    }
}
