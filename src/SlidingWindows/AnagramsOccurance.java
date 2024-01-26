package SlidingWindows;

import java.util.HashMap;

public class AnagramsOccurance {
	public static void main(String args[]) {
		String string = "forxxorfxdofr";
		String ptr = "for";
		int k = ptr.length();
		HashMap<Character, Integer> map =new HashMap<>();
		for(int i=0;i<ptr.length();i++) {
			char val=ptr.charAt(i);
			if(!map.containsKey(val)) {
				map.put(val, 1);
			} else {
				map.put(val, map.get(val)+1);
			}
		}
		int count=map.size();
		int start = 0;
		int end =0;
		int sum = 0;
		//aaba
		//aabacabaa
		System.out.println(" upper print the count : "+k);
	  //  System.out.println("map : "+map);
		while(start < string.length()) {
		//	System.out.println(" upper print the count : "+count);
			char key = string.charAt(start);
			if(map.containsKey(key)) {
				map.put(key,map.get(key)-1 );
				if(map.get(key)==0) {
					count--;
				}
			}
			
			if((start - end + 1) == k )
			{  
				//System.out.println("Enter equls : "+(start - end + 1));
				if(count == 0)
				{
					sum+=1;
				}
				if(map.containsKey(string.charAt(end))) {
					if(map.get(string.charAt(end))==0) {
						count++;
					}
					map.put(string.charAt(end),map.get(string.charAt(end))+1 );
					//count++;
				//	System.out.println("======>>> "+map);
				}
				end++;
			}
			start++;
		}
		System.out.print(sum);
	}
}
