package Array;

public class NextPermutation {
	    public static void main(String args[]) {
	    	int[] nums = {3,2,1};
	    	int n = nums.length;
	        int num =-1;
	        for(int i=n-2;i>=0;i--){
	            if( nums[i] < nums[i+1]){
	              num = i;
	              break;
	            }
	            System.out.println("print "+nums[i]);
	        }
	        if(num == -1){
	            reverseArray(n,0,nums);
	        }
	        else{
	            for(int i=n-1;i>num;i--){
	              if(nums[i] > nums[num]){
	                  int temp = nums[i];
	                  nums[i] =nums[num];
	                  nums[num] = temp;
	                  reverseArray(n,num+1,nums);
	                  break; 
	              }
	            }
	        }
	        for(int i=0;i<n;i++) {
	        	System.out.print(nums[i]+" , ");
	        }
	        
	    }
	    public static void reverseArray(int n,int index,int [] nums){
	        int left =index;
	        int right = n-1;
	        while(left <= right){
	            int temp = nums[left];
	             nums[left] = nums[right];
	             nums[right] = temp;
	             left ++;
	             right--;
	        }
	    }
}
