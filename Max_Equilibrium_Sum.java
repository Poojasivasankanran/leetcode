import java.util.Scanner;

public class Main {

    static int maxEquilibriumSum(int[] arr) {
        int totalSum = 0;
        for (int val : arr) {
            totalSum += val;
        }

        int leftSum = 0;
        int maxEquilibriumSum = -1;

        for (int i = 0; i < arr.length; i++) {
            totalSum -= arr[i]; // Now totalSum is rightSum for index i

            if (leftSum == totalSum) {
                maxEquilibriumSum = Math.max(maxEquilibriumSum, leftSum);
            }

            leftSum += arr[i];
        }

        return maxEquilibriumSum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.print("Enter array elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int result = maxEquilibriumSum(arr);
        if (result != -1)
            System.out.println("Maximum equilibrium sum = " + result);
        else
            System.out.println("No equilibrium index found");

        sc.close();
    }
}
