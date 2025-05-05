import java.util.Scanner;

public class MoveSpaceToBeginning {

    public static String moveSpaceToBeginning(String s) {
        // Count spaces in the string
        int spaceCount = 0;
        
        // Count the spaces
        for (char c : s.toCharArray()) {
            if (c == ' ') {
                spaceCount++;
            }
        }
        
        // Remove spaces from the original string
        s = s.replace(" ", "");
        
        // Prepend spaces to the beginning of the string
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < spaceCount; i++) {
            result.append(" ");
        }
        result.append(s);
        
        return result.toString();
    }

    public static void main(String[] args) {
        // Scanner to take user input
        Scanner scanner = new Scanner(System.in);

        // Taking input string
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Moving spaces to the beginning
        String result = moveSpaceToBeginning(input);

        // Printing the result
        System.out.println("String with spaces at the beginning: " + result);

        // Close scanner
        scanner.close();
    }
}
/*import java.util.Scanner;

public class MoveAllSpacesToEnd {

    public static String moveAllSpacesToEnd(String s) {
        // Count spaces in the string
        int spaceCount = 0;
        
        // Count the spaces
        for (char c : s.toCharArray()) {
            if (c == ' ') {
                spaceCount++;
            }
        }
        
        // Remove spaces from the string
        s = s.replace(" ", "");
        
        // Append spaces to the end
        StringBuilder result = new StringBuilder(s);
        for (int i = 0; i < spaceCount; i++) {
            result.append(" ");
        }
        
        return result.toString();
    }

    public static void main(String[] args) {
        // Scanner to take user input
        Scanner scanner = new Scanner(System.in);

        // Taking input string
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Moving all spaces to the end
        String result = moveAllSpacesToEnd(input);

        // Printing the result
        System.out.println("String with all spaces moved to the end: " + result);

        // Close scanner
        scanner.close();
    }
}
 */
/*
 * import java.util.Scanner;

public class MoveHyphenToBeginning {

    public static String moveHyphenToBeginning(String s) {
        // Check if string contains a hyphen
        if (s.contains("-")) {
            // Remove hyphen from the string
            s = s.replace("-", "");
            // Prepend the hyphen to the beginning of the string
            s = "-" + s;
        }
        return s;
    }

    public static void main(String[] args) {
        // Scanner to take user input
        Scanner scanner = new Scanner(System.in);

        // Taking input string
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Moving hyphen to the beginning
        String result = moveHyphenToBeginning(input);

        // Printing the result
        System.out.println("String with hyphen at the beginning: " + result);

        // Close scanner
        scanner.close();
    }
}

 */