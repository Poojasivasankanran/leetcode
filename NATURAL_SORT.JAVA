import java.util.*;

public class SimpleNaturalSort {
    public static void main(String[] args) {
        // Scanner to take user input
        Scanner scanner = new Scanner(System.in);

        // Asking user for the number of strings they want to input
        System.out.print("Enter number of strings: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // consume the newline character

        // List to store the user input strings
        List<String> list = new ArrayList<>();
        
        // Taking strings as input
        System.out.println("Enter " + n + " strings:");
        for (int i = 0; i < n; i++) {
            list.add(scanner.nextLine());
        }

        // Sorting the list of strings in natural order (lexicographically)
        Collections.sort(list);

        // Printing sorted list
        System.out.println("Sorted List:");
        for (String s : list) {
            System.out.println(s);
        }

        // Close scanner
        scanner.close();
    }
}

/* public class BeadSort {
    public static void beadSort(int[] a) {
        // Step 1: Find the maximum element in the array to determine the number of rows in the beads matrix
        int max = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }

        // Step 2: Create a 2D array to represent the beads, where each column is a "rod" and each row represents a "bead"
        int[][] beads = new int[a.length][max];

        // Step 3: Mark the beads for each element of the array
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i]; j++) {
                beads[i][j] = 1;  // Marking a bead at position (i, j) where i is the row and j is the column
            }
        }

        // Step 4: Simulate beads falling down
        for (int j = 0; j < max; j++) {
            int sum = 0;
            // For each column (which represents the beads at a certain level), calculate how many beads fall down
            for (int i = 0; i < a.length; i++) {
                sum += beads[i][j];  // Count how many beads fall into this column
                beads[i][j] = 0;      // Reset the bead after it has fallen
            }

            // Step 5: Place the beads that fell into the sorted array
            for (int i = a.length - 1; i >= a.length - sum; i--) {
                a[i] = j + 1;  // Fill the original array with the sorted values
            }
        }
    }

    public static void main(String[] args) {
        int[] a = { 4, 2, 6, 1, 8 };  // Input array
        beadSort(a);  // Call the beadSort method to sort the array
        // Print the sorted array
        for (int i : a) {
            System.out.print(i + " ");
        }
    }
}
*/
/*import java.util.*;

public class NaturalSortWithInput {
    public static void main(String[] args) {
        // Sample input with alphanumeric strings
        List<String> list = Arrays.asList("N01", "N02", "N10", "N01", "N05");

        // Sorting the list using a natural order comparator
        Collections.sort(list, (s1, s2) -> {
            int i = 0, j = 0;
            
            // Loop through both strings until we compare all parts
            while (i < s1.length() && j < s2.length()) {
                char char1 = s1.charAt(i);
                char char2 = s2.charAt(j);

                // If both characters are digits, we compare the full number
                if (Character.isDigit(char1) && Character.isDigit(char2)) {
                    StringBuilder num1 = new StringBuilder();
                    StringBuilder num2 = new StringBuilder();
                    
                    // Extracting the full number from both strings
                    while (i < s1.length() && Character.isDigit(s1.charAt(i))) {
                        num1.append(s1.charAt(i));
                        i++;
                    }
                    while (j < s2.length() && Character.isDigit(s2.charAt(j))) {
                        num2.append(s2.charAt(j));
                        j++;
                    }

                    // Compare the numeric parts
                    int comparison = Integer.compare(Integer.parseInt(num1.toString()), Integer.parseInt(num2.toString()));
                    if (comparison != 0) {
                        return comparison; // Return the result of number comparison if different
                    }
                } else {
                    // If both characters are not digits, compare alphabetically
                    if (char1 != char2) {
                        return char1 - char2; // Return difference if characters are not equal
                    }
                    i++; // Move to next character in string 1
                    j++; // Move to next character in string 2
                }
            }
            return s1.length() - s2.length(); // If strings are the same up to one point, compare their length
        });

        // Printing the sorted list
        for (String s : list) {
            System.out.println(s);
        }
    }
}
 */