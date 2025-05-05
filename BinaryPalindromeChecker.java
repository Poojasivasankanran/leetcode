import java.util.Scanner;

public class BinaryPalindromeChecker {

    // Function to check if binary representation is a palindrome
    public static boolean isBinaryPalindrome(int num) {
        String binary = Integer.toBinaryString(num);
        int left = 0;
        int right = binary.length() - 1;

        while (left < right) {
            if (binary.charAt(left) != binary.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
       
        int num = scanner.nextInt();
        
        
        if (isBinaryPalindrome(num)) {
            System.out.println(num + " is a binary palindrome.");
        } else {
            System.out.println(num + " is NOT a binary palindrome.");
        }

        scanner.close();
    }
}
