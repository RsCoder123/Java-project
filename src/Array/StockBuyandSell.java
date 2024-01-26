package Array;

public class StockBuyandSell {
  public static void main(String args[]) {
	  int nums[] = {4,5,6,7,0,1,2};
	int result=  findMin(nums);
	
  }
  public static int findMin(int[] nums) {
      int result=0;
      int n=nums.length;
      int low =0;
      int high = nums.length-1;
      if(nums[0]<nums[high]){
          return nums[0];
      }
      while(low<= high){
          int mid = (low+high)/2;
          int prev = (mid+n-1)%n;
          int next =(mid+1)%n;
          System.out.println("mid "+nums[mid]+", prev "+nums[prev]+",next "+nums[next]);
          if(nums[mid] < prev && nums[mid] < next){
              result= nums[mid];
              break;
          }
          else if(nums[low]<=nums[mid]){
              low = mid+1;
          }
          else if(nums[mid]<=nums[high]){
              high = mid-1;
          }
          System.out.println("low ="+low+", high = "+high);
      }
      return result;
  }
}
