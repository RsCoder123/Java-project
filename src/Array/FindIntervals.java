package Array;

import java.util.Arrays;
import java.util.Stack;


public class FindIntervals {
	public static void main(String args[]) {
		 int[][] intervals = new int[][]{{3, 1}, {1, 5}, {2, 4}};
		 Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
		  Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

	        Stack<int[]> stack = new Stack<>();
	        stack.push(intervals[0]);

	        for (int i = 1; i < intervals.length; i++) {
	            int[] ele = stack.pop();
	            int firstEle = ele[0];
	            int secEle = ele[1];

	            if (secEle >= intervals[i][0]) {
	                int max = Math.max(secEle, intervals[i][1]);
	                int[] arr = new int[2];
	                arr[0] = firstEle;
	                arr[1] = max;
	                stack.push(arr);
	            } else {
	                stack.push(ele);
	                stack.push(intervals[i]);
	            }
	        }
	         int[][] result = new int[stack.size()][2];
	        for (int i = 0; i <result.length ; i++) {
	            int[] re = stack.pop();
	            result[i][0] = re[0];
	            result[i][1] = re[1];
	        }
	        System.out.print( result);
	}
}
