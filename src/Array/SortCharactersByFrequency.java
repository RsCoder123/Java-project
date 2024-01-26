package Array;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SortCharactersByFrequency {
	public static void main(String args[]) {
		String s = "tree";
		   Map<Character, Integer> map = new HashMap<>();
	        
	        // Count frequencies
	        for (char c : s.toCharArray()) {
	            map.put(c, map.getOrDefault(c, 0) + 1);
	        }
	        
	        // Sort by frequency
	        List<Map.Entry<Character, Integer>> sortedList = new ArrayList<>(map.entrySet());
	        sortedList.sort(Map.Entry.comparingByValue(Comparator.reverseOrder()));
	        
	        // Build the result string
	        StringBuilder res = new StringBuilder();
	        for (Map.Entry<Character, Integer> entry : sortedList) {
	            char character = entry.getKey();
	            int count = entry.getValue();
	            
	            res.append(String.valueOf(character).repeat(count));
	        }
	        
	        System.out.println(res);
	    }
	
	}
