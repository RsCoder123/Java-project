package Array;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

public class CollectionFW {
public static void main(String args[]) {
//	ArrayList<Integer> array = new ArrayList<>();
//    array.add(12);
//    array.add(34);
//    System.out.println("before remove : "+array );
//    array.remove(0);
//    array.add(1,50);
//    System.out.println("after remove : "+array );
//    array.remove(Integer.valueOf(50));
//    System.out.println(array);

 //   System.out.println(array.contains(12));
//    List<Integer> list = new ArrayList<>();
//    list.add(9);
//    list.add(8);
//    list.add(7);
     // Set function is used to update the existing element
//     list.set(0,5);
//     System.out.println(list.size());
//    // array.addAll(list);
//     System.out.println(list);
	
	//LinkList
	
	// Queue<Integer> queue = new LinkedList<>();

     // Adding elements to the queue
//     queue.offer(12);
//     queue.offer(2);
//     queue.offer(24);
//     queue.offer(21);
//     System.out.println(queue);

     // Removing element
//     queue.poll(); // After removing this also returns the element
//     System.out.println(queue);
//
//     // Peek the element jo hi poll hone wala hai
//     System.out.println(queue.peek());
	
	
	//Stack
	
//	  Stack<String> name = new Stack<>();
//
//      // For adding elements we use push
//      name.push("Lion");
//      name.push("Tiger");
//      name.push("Dog");
//      name.push("Cat");
//      name.push("Zebra");
//      System.out.println(name);
//
//      // Checking which element is at the top of stack
//      System.out.println(name.peek());
//
//      // Removing last element
//      name.pop();
//      System.out.println(name);\
	
	Queue<Integer> pq = new PriorityQueue<>();

    // This arranges the array in priority base -> Here by default priority is
    // set to the lowest element

    pq.offer(23);
    pq.offer(12);
    pq.offer(2);
    pq.offer(67);
    System.out.println(pq);

    // Remove the priority element
    pq.poll();
    System.out.println(pq);
}
}
