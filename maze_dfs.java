import java.util.Scanner;

public class Main {
    static int[][] maze;
    static boolean[][] visited;
    static int n, m;
    static boolean pathFound = false;

    // Move directions: up, down, left, right
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};

    static void dfs(int x, int y) {
        // 1. Out of bounds
        if (x < 0 || y < 0 || x >= n || y >= m) return;

        // 2. Wall or already visited
        if (maze[x][y] == 0 || visited[x][y]) return;

        // 3. Goal reached
        if (x == n - 1 && y == m - 1) {
            pathFound = true;
            return;
        }

        // 4. Mark as visited
        visited[x][y] = true;

        // 5. Explore all directions
        for (int i = 0; i < 4; i++) {
            dfs(x + dx[i], y + dy[i]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows and columns: ");
        n = sc.nextInt();
        m = sc.nextInt();

        maze = new int[n][m];
        visited = new boolean[n][m];

        System.out.println("Enter the maze (0 = wall, 1 = path):");
        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++)
                maze[i][j] = sc.nextInt();

        dfs(0, 0); // Start from top-left

        if (pathFound)
            System.out.println("✅ Path exists!");
        else
            System.out.println("❌ No path found.");

        sc.close();
    }
}
