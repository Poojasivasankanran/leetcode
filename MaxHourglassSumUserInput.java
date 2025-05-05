import java.util.Scanner;

public class MaxHourglassSumUserInput {
    public static int maxHourglassSum(int[][] mat) {
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < mat.length - 2; i++) {
            for (int j = 0; j < mat[0].length - 2; j++) {
                int sum = mat[i][j]     + mat[i][j + 1]     + mat[i][j + 2]
                                        + mat[i + 1][j + 1] +
                          mat[i + 2][j] + mat[i + 2][j + 1] + mat[i + 2][j + 2];

                maxSum = Math.max(maxSum, sum);
            }
        }

        return maxSum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       
        int rows = sc.nextInt();

        
        int cols = sc.nextInt();

        if (rows < 3 || cols < 3) {
            System.out.println("Matrix too small for hourglass pattern.");
            return;
        }

        int[][] mat = new int[rows][cols];

        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                mat[i][j] = sc.nextInt();
            }
        }

        int result = maxHourglassSum(mat);
        System.out.println("Maximum hourglass sum is: " + result);

        sc.close();
    }
}
