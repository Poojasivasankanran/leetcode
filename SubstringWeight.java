import java.util.Scanner;

public class SubstringWeight {

    // Function to calculate weight of a substring
    static int substringWeight(String s) {
        int weight = 0;
        for (int i = 0; i < s.length(); i++) {
            weight += s.charAt(i) - 'a' + 1;  // 'a' = 1, ..., 'z' = 26
        }
        return weight;
    }

    // Function to count substrings with weight at most k
    static int countSubstrings(String input, int k) {
        int counter = 0;
        for (int i = 0; i < input.length(); i++) {
            for (int j = i; j < input.length(); j++) {
                String substring = input.substring(i, j + 1);
                int weight = substringWeight(substring);
                if (weight <= k) {
                    counter++;
                }
            }
        }
        return counter;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Initialize input string
        System.out.print("Enter the input string: ");
        String input = scanner.nextLine();

        // Initialize maximum possible weight (k)
        System.out.print("Enter the maximum possible weight (k): ");
        int k = scanner.nextInt();

        // Count substrings with weight at most k
        int result = countSubstrings(input, k);

        // Print the result
        System.out.println("Number of substrings with weight at most " + k + ": " + result);

        scanner.close();
    }
}
