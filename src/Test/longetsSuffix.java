package Test;

public class longetsSuffix {
	public static String longestCommonPrefix(String[] strs) {
	    if (strs == null || strs.length == 0) return "";
	    
	    String suffix = ""; 
	    
	    for (int o = 0; o < strs[0].length(); o++) {
	        char actual = strs[0].charAt(o);
	        
	        for (int i = 1; i < strs.length; i++) {
	            if (o >= strs[i].length() || strs[i].charAt(o) != actual) {
	                return suffix;
	            }
	        }
	        
	        suffix += actual;
	    }
	    
	    return suffix;
	}

	public static void main(String[] args) {
		
		String suffix = longestCommonPrefix(new String[] {"flower", "flow", "flight"});
		System.out.println(suffix);
	}
}

/*
 * Write a function to find the longest common prefix string amongst an array of
 * strings.
 * 
 * If there is no common prefix, return an empty string "".
 * 
 * 
 * 
 * Example 1:
 * 
 * Input: strs = ["flower","flow","flight"] Output: "fl" Example 2:
 * 
 * Input: strs = ["dog","racecar","car"] Output: "" Explanation: There is no
 * common prefix among the input strings.
 * 
 * 
 * Constraints:
 * 
 * 1 <= strs.length <= 200 0 <= strs[i].length <= 200 strs[i] consists of only
 * lowercase English letters if it is non-empty.
 */