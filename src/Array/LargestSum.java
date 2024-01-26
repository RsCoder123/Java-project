package Array;


public class LargestSum {
   public static void main(String args[]) {
	   int array[] = {-2, -3, 4, -1, -2, 1, 5, -3};
	   int curr_max = 0;
	   int largest_max = 0;
	   for(int i=0;i<array.length;i++) {
		   curr_max+=array[i];
		   if(largest_max<curr_max) {
			   largest_max = curr_max;
		   }
		   if(curr_max<0)
		   {
			   curr_max = 0;
		   }
	   }
	   System.out.println("Largest Sum "+ largest_max);
   }
}
