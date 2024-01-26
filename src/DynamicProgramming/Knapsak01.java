package DynamicProgramming;

public class Knapsak01 {
  static int dp [][] = new int[100][100];
  public static void main(String args[]) {
	  int wt[] = {4, 5, 1};
	  int val[] = {1, 2, 3};
	  int w= 4;
	  int n = 3;
	 // N = 3, W = 4, profit[] = {1, 2, 3}, weight[] = {4, 5, 1}
	  int max = knapsakcall(wt,val,w,n);
	  System.out.println("print the max Profit : "+max);
  }
  public static int knapsakcall(int wt[],int val[],int w,int n) {
	  if(n==0 || w == 0) {
		  return 0;
	  }
	  if(dp[w][n]>0) {
		  return dp[w][n];
	  }
	  if(wt[n-1]<=w) {
		  return dp[w][n]=Math.max(val[n-1]+knapsakcall(wt, val, w-wt[n-1], n-1),knapsakcall(wt, val, w, n-1));
	  }
	  else {
		  return dp[w][n]=knapsakcall(wt, val, w, n-1);
	  }
  }
}
