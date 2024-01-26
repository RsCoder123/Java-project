package Array;

//Find the maximum and minimum element in an array
public class FindMax {
    public static void main(String args[]) {
    	int arr[]= {23,2,5,75,10,100};
    	int max=Integer.MAX_VALUE;
    	int min=Integer.MIN_VALUE;
    	for(int number=0;number<arr.length;number++) {
    		if(max>arr[number]) {
    			max=arr[number];
    		}
    		else if(min<arr[number]) {
    			min=arr[number];
    		}
    	}
    	System.out.println(min+"  "+max);
	     
}
}
