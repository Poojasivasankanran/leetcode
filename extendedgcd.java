import java.util.Scanner;

class Main
{
    public static int gcd(int a, int b)
    {
        if (a == 0)
            return b;
        
        return gcd(b % a, a);
    }

    public static long[] egcd(long a, long b)
    {
        if (b == 0)
            return new long[] {a, 1, 0}; // It means the GCD of a and b is a, with coefficients x = 1 and y = 0
        else {
            long[] x = egcd(b, a % b);
            long y = x[1] - x[2] * (a / b);
            x[1] = x[2];
            x[2] = y;
            return x;
        }
    }
    

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter two integers -");
        int a = scan.nextInt();
        int b = scan.nextInt();
        int g = gcd(a, b); 

        long[] result = egcd(a, b);

        System.out.println("GCD is " + g);
        System.out.println("x: " + result[1]);
        System.out.println("y: " + result[2]);
    }
}
