package Test;

import javax.swing.plaf.synth.SynthToggleButtonUI;

public class sequentialSum {
    public static int missingInteger(int[] nums) {
    	int sum = 0;
    	for(int i = 0; i < nums.length; i++) {
    		if(i + 1 < nums.length) {
    			int num1 = nums[i] + 1;
    			int num2 = nums[i + 1];
    			System.out.println(num1);
    			System.out.println(num2);
	    		if(num1 == num2) {
	    			sum += nums[i];
	    			System.out.println("Añadimos el numero " + nums[i] + " entonces el nuevo valor es " + sum);
	    		}
    		}
    	}
		return sum;
    }

	public static void main(String[] args) {
		
		int suffix = missingInteger(new int[] {2, 3, 4, 7, 5});
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