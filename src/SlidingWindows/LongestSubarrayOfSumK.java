package SlidingWindows;

public class LongestSubarrayOfSumK {
	public static void main (String args[]) {
		int arr[] = { 10, 5, 1,1, 4,3, 1, 9 }; 
				int k = 15;
				//Output: 4
	    int start =0;
	    int end = 0;
	    int sum =0;
	    int max = 0;
	    while(start < arr.length) {
	    	sum = sum + arr[start];
	    	if(sum < k) {
	    		start++;
	    	}
	    	else if(sum == k) {
	    		max = Math.max(max, start-end+1);
	    		start++;
	    	}
	    	else if(sum > k) {
	    		while(sum > k) {
	    			sum = sum -arr[end];
	    			end ++;
	    		}
	    		start++;
	    	}
	    }
	    System.out.println("max subarray : "+max);
	}
}
