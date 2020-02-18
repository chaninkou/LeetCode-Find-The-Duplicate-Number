package duplicateNumberConstantSpace;

public class FindDuplicateNumberInConstantSpaceFunction {
	// Since we want to do it in O(1) space, we won't be using hashset to store all the elements
	// This should be o(n + n) which is O(n)
    public int findDuplicate(int[] nums) {
        // turtle and rabbit will both start from 0
    	// Since the input could only be from 1 - n
        int slowPointer = nums[0];
        int fastPointer = nums[0];
        
        // turtle will go to next pointer
        slowPointer = nums[slowPointer];
        
        // rabbit will go to next next pointer
        fastPointer = nums[nums[fastPointer]];
        
        // If slow and rabbit is the same, there is a cycle at that point
        while(slowPointer != fastPointer){
            slowPointer = nums[slowPointer];
            fastPointer = nums[nums[fastPointer]];
        }
        
        // Set the slowPointer back to the first element
        slowPointer = nums[0];
        
        // If they equal, that means we have found the duplicate
        // fastpointer will only goes ahead once now since we know there is a duplicate
        while(slowPointer != fastPointer){
            slowPointer = nums[slowPointer];
            fastPointer = nums[fastPointer];
        }
        
        return slowPointer;
    }
}
