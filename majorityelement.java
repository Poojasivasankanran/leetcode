import java.util.*;

public class majorityelement {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input size
        System.out.print("Enter number of elements: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        // Input elements
        System.out.print("Enter array elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Find majority element using Moore's Voting Algorithm
        int candidate = majorityElement(arr);

        // Verify majority
        if (isMajority(arr, candidate)) {
            System.out.println("Majority element: " + candidate);
        } else {
            System.out.println("No majority element");
        }

        scanner.close();
    }

    // Your logic for Moore's Voting Algorithm
    static int majorityElement(int[] num) {
        int majority = num[0], votes = 1;

        for (int i = 1; i < num.length; i++) {
            if (votes == 0) {
                votes++;
                majority = num[i];
            } else if (majority == num[i]) {
                votes++;
            } else {
                votes--;
            }
        }
        return majority;
    }

    // Verification step
    static boolean isMajority(int[] arr, int candidate) {
        int count = 0;
        for (int num : arr) {
            if (num == candidate) {
                count++;
            }
        }
        return count > arr.length / 2;
    }
}
