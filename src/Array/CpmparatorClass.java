package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class CpmparatorClass {
   public static void main(String args[]) {
   int intervals[][] = {{1,3},{2,6},{15,18},{8,10}};
   int n = intervals.length;
   Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));  
   List<int[]> list = new ArrayList<>();
   int i=0;
   while(i<n)
   {
       int j= i;
       int a = intervals[i][0];
       int b = intervals[i][1];
       while(j+1<n && intervals[j+1][0] >= a && intervals[j+1][0] <= b)
       {
           b = Math.max(b,Math.max(intervals[j][1],intervals[j+1][1]));
           j++;
       }
       
       list.add(new int[]{a,b});
       i=j+1;
   }
   
   int m = list.size();

 //  return list.toArray(new int[m][]);

}
}
