package Array;

import java.io.Console;
import java.util.HashMap;

public class DuplicateFromArray {
	   public static void main(String args[]) {
		   int nums[] = {3,1,3,4,2};
	       HashMap<Integer,Integer> map = new HashMap<>();
	       for(int i : nums){
	    	   System.out.println("nums value print :"+i);
	           if(map.containsKey(i)){
	            map.put(i,map.get(i)+1);
	           }
	           else
	           map.put(i,1);
	          
	       } 
	       int result =0;
	       System.out.println("print the map : "+map);
	       for ( int key : map.keySet() ) {
	        if(map.get(key)>1){
	            result = key;
	            break;
	        }
	      }
	     System.out.println("print the result : "+result);
	    }
}
