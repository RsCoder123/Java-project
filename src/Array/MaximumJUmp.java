package Array;

public class MaximumJUmp {
   public static void main(String args[]) {
	   int arr[] = {1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9} ;
	   int jump = arr[0] ;
       int count = 0;
       while(jump < arr.length){
           jump+=arr[jump];
           count ++;
       }
       System.out.println(count);
   }
}
