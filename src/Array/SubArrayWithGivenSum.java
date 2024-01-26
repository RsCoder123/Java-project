package Array;

import java.util.ArrayList;

public class SubArrayWithGivenSum {
	public static void main(String args[]) {
		int arr[] = {1,4,20,3,10,5};
		int s = 33;
		int n= arr.length;
		ArrayList<Integer> list = new ArrayList<>();
        int sum=arr[0];
        int count=0;
        for(int i=1;i<=n;i++){
            while(sum>s && count<i-1){
            	System.out.println("Enter the sum : "+sum);
                sum = sum-arr[count];
                count++;
            }
            if(sum==s){
            	count=count+1;
                list.add(count);
                list.add(i);
                break;
            }
            System.out.println("array : "+arr[i]);
            if(i<n)
            sum+=arr[i];
        }
        list.add(-1);
        System.out.println(list);
	}
}
