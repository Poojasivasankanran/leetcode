 /* public class SwapNibble 
{

  public static void main(String[] args) 
  {
    int num = 150; // 10010110
     String s = Integer.toBinaryString(num);
       
     int swapnum;
    
    swapnum = ((num & 0x0F) << 4 | (num & 0xF0) >> 4);
     String swap = Integer.toBinaryString(swapnum);

    System.out.println("Before swapping the nibble "+ num);
    System.out.println(s);
    System.out.println("After swapping the nibble "+ swapnum);
    System.out.println(swap);
  }

}

*/


    import java.util.Scanner;

public class SwapNibble {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the number (should be between 0 and 255)
        System.out.print("Enter an 8-bit number (0 to 255): ");
        int num = scanner.nextInt();

        // Validate input range
        if (num < 0 || num > 255) {
            System.out.println("Invalid input! Please enter a number between 0 and 255.");
            scanner.close();
            return;
        }

        // Swap the nibbles
        int swapnum = ((num & 0x0F) << 4) | ((num & 0xF0) >> 4);

        // Convert the numbers to binary strings and pad to 8 bits
        String originalBinary = String.format("%8s", Integer.toBinaryString(num)).replace(' ', '0');
        String swappedBinary = String.format("%8s", Integer.toBinaryString(swapnum)).replace(' ', '0');

        // Output the results
        System.out.println("Before swapping the nibble: " + num);
        System.out.println("Binary: " + originalBinary);
        System.out.println("After swapping the nibble: " + swapnum);
        System.out.println("Binary: " + swappedBinary);

        scanner.close();
    }
}

    
}
