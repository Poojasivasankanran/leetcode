import java.util.Scanner;

public class Main {
    // Josephus recursive function
    public static int josephus(int n, int k) {
        if (n == 1)
            return 1; // base case: only one person left
        else
            return (josephus(n - 1, k) + k - 1) % n + 1; // recursive formula
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of people (n): ");
        int n = sc.nextInt();
        System.out.print("Enter step count (k): ");
        int k = sc.nextInt();

        int survivor = josephus(n, k);
        System.out.println("The safe position is: " + survivor);
        sc.close();
    }
}
