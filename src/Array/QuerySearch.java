package Array;

public class QuerySearch {
   public static void main(String args[]) {
   int arr [] = {2,4,5,3,1,6};
   int len = arr.length;
   int num = len/2;
   System.out.println(num);
   for(int k=0;k<=num;k++){
       int min = k;
       for(int j=k+1;j<len;j++){
          if(arr[j]<arr[min]){
           min = j;
          }
       }
       if(min != k){
           int temp = arr[min];
           arr[min] = arr[k];
           arr[k] = temp;
       }
   }
	   System.out.println(arr[num]);
}
}
