package leetcode.medium;

public class MaximumProductSubarray {

  int maxProduct(int[] nums) {

    int n = nums.length;
    long leftProduct = 1;
    long rightProduct = 1;
    long ans = nums[0];

    for (int i = 0; i < n; i++) {

      //if any of leftProduct or rightProduct become 0 then update it to 1
      leftProduct = (leftProduct == 0 || leftProduct < Integer.MIN_VALUE) ? 1 : leftProduct;
      rightProduct = (rightProduct == 0 || rightProduct < Integer.MIN_VALUE) ? 1 : rightProduct;

      //prefix product
      leftProduct *= nums[i];

      //suffix product
      rightProduct *= nums[n - 1 - i];

      ans = Math.max(ans, Math.max(leftProduct, rightProduct));
    }

    return (int) ans;
  }

}
/*public class MaxProductSubarray {
    public static int maxProduct(int[] nums) {
        int maxProduct = nums[0];
        int currMax = nums[0];
        int currMin = nums[0];

        for (int i = 1; i < nums.length; i++) {
            int temp = currMax;

            currMax = Math.max(nums[i], Math.max(currMax * nums[i], currMin * nums[i]));
            currMin = Math.min(nums[i], Math.min(temp * nums[i], currMin * nums[i]));

            maxProduct = Math.max(maxProduct, currMax);
        }

        return maxProduct;
    }

    public static void main(String[] args) {
        int[] nums = {2, 3, -2, 4};
        System.out.println("Maximum product subarray is: " + maxProduct(nums));
    }
}
 */