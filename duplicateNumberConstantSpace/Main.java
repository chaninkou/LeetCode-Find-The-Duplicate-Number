package duplicateNumberConstantSpace;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		// Make sure there is only one duplicate
		int[] nums = {1,3,4,2,2};
		
		System.out.println("Input: " + Arrays.toString(nums));
		
		FindDuplicateNumberInConstantSpaceFunction solution = new FindDuplicateNumberInConstantSpaceFunction();
		
		System.out.println("Solution: " + solution.findDuplicate(nums));
	}
}
