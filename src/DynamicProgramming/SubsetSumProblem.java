package DynamicProgramming;

public class SubsetSumProblem {
	static boolean dp[][] = new boolean[100][100];
  public static void main(String args[]) {
	  int arr [] = {3, 34, 4, 12, 5, 2};// sum = 9;
	  int sum = 30;
	  int n =6;
	  for(int i=0;i<100;i++) {
			for(int j=0;j<100;j++) {
				if(i==0) {
					dp[i][j] = false;
				}
				if(j==0) {
					dp[i][j] = true;
				}
			}
		}
	 boolean val= subsetsum(arr,sum,n);
	 System.out.print("print the dpp : "+val);
  }
  public static boolean subsetsum(int arr[],int sum,int n) {
	  if(n==0 || sum==0) {
		  return false;
	  }
	  for(int i=1;i<=n;i++) {
		  for(int j=1;j<=sum;j++) {
			  if(arr[i-1]>j) {
				  dp[i][j] = dp[i-1][j];
				//  System.out.println("if : "+dp[i][j]);
			  }
			  else {
				  dp[i][j] = dp[i-1][j-arr[i-1]] || dp[i-1][j];
				//  System.out.println("else : "+dp[i][j]);
			  }
		  }
	  }
	  return dp[n][sum];
  }
}
