package SlidingWindows;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithUniqeCharcater {
	public static void main(String args[]) {
		String str = "aabbcc";
		int k = 3;
		int start =0;
		int end = 0;
		int max =0;
		Map<Character, Integer> map =new HashMap<>();
		while(start < str.length()) {
			if(!map.containsKey(str.charAt(start))) {
				map.put(str.charAt(start), 1);
			}
			else {
				map.put(str.charAt(start), map.get(str.charAt(start))+1);
			}
			if(map.size()<k) {
				start++;
			}
			else if(map.size()==k) {
				max = Math.max(max, start-end+1);
				start++;
			}
			else if(map.size()>k) {
				while(map.size() > k) {
					map.put(str.charAt(end), map.get(str.charAt(end))-1);
					if(map.get(str.charAt(end))==0) {
						map.remove(str.charAt(end));
					}
					end++;
				}
				start++;
			}
		}
		System.out.println("max : "+max);
	}
}
