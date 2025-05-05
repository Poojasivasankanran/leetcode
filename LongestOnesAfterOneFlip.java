import java.util.Scanner;

public class LongestOnesAfterOneFlip {

    public static int longestOnesAfterOneFlip(int[] nums) {
        int left = 0, right = 0;
        int zeroCount = 0;
        int maxLength = 0;

        while (right < nums.length) {
            if (nums[right] == 0) {
                zeroCount++;
            }

            while (zeroCount > 1) {
                if (nums[left] == 0) {
                    zeroCount--;
                }
                left++;
            }

            maxLength = Math.max(maxLength, right - left + 1);
            right++;
        }

        return maxLength;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements in array: ");
        int n = sc.nextInt();

        int[] nums = new int[n];
        System.out.print("Enter array elements (only 0s and 1s): ");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int result = longestOnesAfterOneFlip(nums);
        System.out.println("Longest 1s after flipping one 0: " + result);

        sc.close();
    }
}
