import java.util.Scanner;
/*
 *
public class Main{
    static void reverse(int[] a, int start, int end){
        while(start<end){
            int temp = a[start];
            a[start] = a[end];
            a[end] = temp;
            start++;
            end--;
        }
    }
     static void rotate(int[] a, int k){
         k = k%a.length;
         if(k<0){
             k=k+a.length;
         }
         reverse(a, 0, k-1);
         reverse(a, k, a.length-1);
         reverse(a, 0, a.length-1);
         
     }
 */
public class block_swap {
    static void reverse(int[] a, int start, int end) {
        while (start < end) {
            int temp = a[start];
            a[start] = a[end];
            a[end] = temp;
            start++;
            end--;
        }
    }

    // Rotate array to the right by k positions
    static void rightRotate(int[] a, int k) {
        int n = a.length;
        k = k % n;
        if (k < 0) {
            k += n; // Handle negative rotations
        }

        reverse(a, 0, n - 1);       // Reverse entire array
        reverse(a, 0, k - 1);       // Reverse first k elements
        reverse(a, k, n - 1);       // Reverse remaining elements
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        int n = sc.nextInt();

        int[] a = new int[n];
        
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        
        int k = sc.nextInt();

        
        

        rightRotate(a, k);

        System.out.println("\nAfter right rotation:");
        for (int val : a) {
            System.out.print(val + " ");
        }

        sc.close();
    }
}
