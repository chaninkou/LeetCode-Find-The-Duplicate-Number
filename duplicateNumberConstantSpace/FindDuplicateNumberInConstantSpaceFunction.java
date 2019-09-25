package duplicateNumberConstantSpace;

public class FindDuplicateNumberInConstantSpaceFunction {
    public int findDuplicate(int[] nums) {
        // turtle and rabbit will both start from 0 
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
        while(slowPointer != fastPointer){
            slowPointer = nums[slowPointer];
            fastPointer = nums[fastPointer];
        }
        
        return slowPointer;
    }
}
