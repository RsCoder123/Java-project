package Array;

import java.util.PriorityQueue;
import java.util.Queue;

public class KthLargestElement {
	public static void main(String args[]) {
		int arr [] = {12,44,4,11,18,6,10,56,9};
		int k=3;
		Queue<Integer> queue =new PriorityQueue<Integer>();
		for(int i=0;i<k;i++) {
			queue.add(arr[i]);
		}
		for(int i=k;i<arr.length;i++) {
			if(queue.peek()<arr[i]) {
				queue.poll();
				queue.add(arr[i]);
			}
		}
		System.out.print(queue.peek());
		
	}
}
