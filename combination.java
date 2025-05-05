public class combination {
    
    // arr[] – input array
    // data[] – temporary array to store current combination
    // start – index in arr[]
    // index – current index in data[]
    static void combinationUtil(int arr[], int data[], int start, int index, int r) {
        // Base case: current combination is ready
        if (index == r) {
            for (int j = 0; j < r; j++)
                System.out.print(data[j] + " ");
            System.out.println();
            return;
        }

        // Replace index with all possible elements
        for (int i = start; i < arr.length; i++) {
            data[index] = arr[i];
            combinationUtil(arr, data, i + 1, index + 1, r);
        }
    }

    static void printCombinations(int arr[], int r) {
        int[] data = new int[r];
        combinationUtil(arr, data, 0, 0, r);
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        int r = 3;
        printCombinations(arr, r);
    }
}
