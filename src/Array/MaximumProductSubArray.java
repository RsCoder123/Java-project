package Array;

public class MaximumProductSubArray {
public static void main(String args[]) {
	       int nums[] = {2,3,-2,-4};
	       int num = findmaxmulFromArray(nums);
	       System.out.println(num);
	    }
public static int findmaxmulFromArray(int [] nums) {
	 int n = nums.length;
    if (n == 0) {
        return 0;
    }

    int maxProduct = nums[0];
    int maxSoFar = nums[0];
    int minSoFar = nums[0];

    for (int i = 1; i < n; i++) {
        if (nums[i] < 0) {
            int temp = maxSoFar;
            maxSoFar = minSoFar;
            minSoFar = temp;
        }

        maxSoFar = Math.max(nums[i], maxSoFar * nums[i]);
        minSoFar = Math.min(nums[i], minSoFar * nums[i]);

        maxProduct = Math.max(maxProduct, maxSoFar);
    }

    return maxProduct;
}

	}
