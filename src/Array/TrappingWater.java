package Array;

public class TrappingWater {
   public static void main(String args[]) {
	   int building [] = {2,0,2};
	   int left [] = new int [building.length];
	   int right[] = new int [building.length];
	   int max = Integer.MIN_VALUE;
	   int sum = 0;
	   for(int i=0;i<building.length;i++) {
		   if(max<building[i]) {
			   max = building[i];
		   }
		   left[i]=max;
	   }
	   max = Integer.MIN_VALUE;
	   for(int i=building.length-1;i>=0;i--) {
		   if(max<building[i]) {
			   max = building[i];
		   }
		   right[i]=max;
	   }
	   for(int i=0;i<building.length;i++) {
		   sum+=Math.min(left[i], right[i])-building[i];
	   }
	   System.out.println("Water trapping problem sum : "+sum);
   }
}
