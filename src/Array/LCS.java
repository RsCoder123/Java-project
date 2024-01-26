package Array;

public class LCS {
	public static String longestPalindrome1(String s) {
		int maxPalinLength = 0;
		String longestPalindrome = null;
		int length = s.length();
		for (int i = 0; i < length; i++) {
		for (int j = i + 1; j < length; j++) {
		int len = j - i;
		String curr = s.substring(i, j + 1);
		if (isPalindrome(curr)) {
		if (len > maxPalinLength) {
		longestPalindrome = curr;
		maxPalinLength = len;
	    } 
	}
}
}
		return longestPalindrome;
		}
		public static boolean isPalindrome(String s) {
		for (int i = 0; i < s.length() - 1; i++) {
		if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
		return false; 
	}
}
		return true; 
	}
      public static void main(String args[]) {
    	  String s="ababcdabc";
    	String lCString=  longestPalindrome1(s);
    	System.out.println(lCString);
}
}
