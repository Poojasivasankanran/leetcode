/*
 import java.util.*;

public class LeadersInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        System.out.print("Enter array elements: ");
        for(int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.print("Leaders in the array: ");
        int maxFromRight = arr[n - 1];
        System.out.print(maxFromRight + " ");  // last element is always a leader

        // Traverse from second last to start
        for(int i = n - 2; i >= 0; i--) {
            if(arr[i] >= maxFromRight) {
                maxFromRight = arr[i];
                System.out.print(maxFromRight + " ");
            }
        }

        scanner.close();
    }
}


USE BEL0W
 */
import java.util.*;

public class LeadersInArray {
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

        List<Integer> leaders = new ArrayList<>();
        int maxFromRight = arr[n - 1];
        leaders.add(maxFromRight); // last element is always a leader

        // Traverse from right to left
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] >= maxFromRight) {
                maxFromRight = arr[i];
                leaders.add(maxFromRight);
            }
        }

        // Reverse the list to get left-to-right order
        Collections.reverse(leaders);

        // Output the leaders
        System.out.print("Leaders in the array: ");
        for (int leader : leaders) {
            System.out.print(leader + " ");
        }

        scanner.close();
    }
}
