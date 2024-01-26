package Array;

import java.util.HashSet;

public class LongestContiguesSS {
	public static void main(String args[]) {
		int nums[] = {0,3,7,2,5,8,4,6,0,1};
		 int res = longestConsecutive(nums);
		 System.out.println("print the lcs :"+res);
		
	}
	 public static int longestConsecutive(int[] nums) {
	        HashSet<Integer> set = new HashSet();
	        for(int i=0;i<nums.length;i++){
	            set.add(nums[i]);
	        }
	        int max = 0;
	        for(int i=0;i<nums.length;i++){
	            int count = 1;
	            int ele = nums[i];
	            if(!set.contains(ele-1)){
	                while(set.contains(++ele)){
	                    count++;
	                     
	                }
	            }
	            if(max < count)
	            {
	                max = count;
	            }
	        }
	        return max;
	    }
}
