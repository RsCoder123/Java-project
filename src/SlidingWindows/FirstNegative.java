package SlidingWindows;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class FirstNegative {
	public static void main(String args[]) {
		int arr[] = {4,-7,4,6,7,-11,2,4 };
		int k = 3;
		int start = 0 ;
		Queue<Integer> queue =new LinkedList<>();
		ArrayList<Integer> aList = new ArrayList<>();
		int i =0;
		while(i<arr.length) {
			if(arr[i]<0) {
				queue.add(arr[i]);
			}
			//System.out.println(arr[i]);
			//System.out.println(queue);
			if(i-start+1 == k) {
				if(queue.isEmpty()) {
					System.out.println("Enter queue empty");
					aList.add(0);
				}else if(queue.peek() == arr[start]) {
					//System.out.println("Enter queue peek");
					aList.add(queue.poll());
				}
				else {
					//System.out.println("Enter queue else");
					aList.add(queue.peek());
				}
				start++;
			}
			i++;
		}
		System.out.print(aList);
	}
}
