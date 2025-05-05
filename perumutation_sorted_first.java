import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        char[] arr = input.toCharArray();
        Arrays.sort(arr);  // Sort to start from the lexicographically smallest permutation
        
        List<String> permutations = new ArrayList<>();
        String first = new String(arr);
        permutations.add(first);
        
        while (true) {
            nextPermutation(arr);
            String current = new String(arr);
            if (current.equals(first)) break;  // When it loops back to the first permutation, stop
            permutations.add(current);
        }
        
        // Print results
        System.out.println("\nThe number of unique permutations is: " + permutations.size());
        System.out.println("Unique permutations in sorted order:");
        for (String perm : permutations) {
            System.out.println(perm);
        }

        sc.close();
    }

    // Generates the next lexicographical permutation of the character array
    private static void nextPermutation(char[] nums) {
        int n = nums.length;
        int pivot = -1;

        // Step 1: Find the pivot (first number from right that is smaller than its next)
        for (int i = n - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                pivot = i;
                break;
            }
        }

        // If no pivot, we've reached the last permutation, so reverse to first
        if (pivot == -1) {
            reverse(nums, 0, n - 1);
            return;
        }

        // Step 2: Find the rightmost successor to pivot
        for (int i = n - 1; i > pivot; i--) {
            if (nums[i] > nums[pivot]) {
                swap(nums, i, pivot);
                break;
            }
        }

        // Step 3: Reverse the suffix
        reverse(nums, pivot + 1, n - 1);
    }

    private static void swap(char[] nums, int i, int j) {
        char temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    private static void reverse(char[] nums, int start, int end) {
        while (start < end) {
            swap(nums, start++, end--);
        }
    }
}

