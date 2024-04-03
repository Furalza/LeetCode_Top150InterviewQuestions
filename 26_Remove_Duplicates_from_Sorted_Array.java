/*
 * Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such that each unique 
 * element appears only once. The relative order of the elements should be kept the same. Then return the number of 
 * unique elements in nums.

Consider the number of unique elements of nums to be k, to get accepted, you need to do the following things:

Change the array nums such that the first k elements of nums contain the unique elements in the order they were present 
in nums initially. The remaining elements of nums are not important as well as the size of nums.
Return k.
Custom Judge:

The judge will test your solution with the following code:

int[] nums = [...]; // Input array
int[] expectedNums = [...]; // The expected answer with correct length

int k = removeDuplicates(nums); // Calls your implementation

assert k == expectedNums.length;
for (int i = 0; i < k; i++) {
    assert nums[i] == expectedNums[i];
}
 */

class Solution {
    public int removeDuplicates(int[] nums) {
    if (nums.length == 0) // Handle edge case of empty array
            return 0;
        
        int k = 1; // Pointer for unique elements
        
        // Iterate through the array starting from the second element
        for (int i = 1; i < nums.length; i++) {
            // If the current element is different from the previous one
            if (nums[i] != nums[i - 1]) {
                // Move the unique element to position k
                nums[k] = nums[i];
                k++;
            }
        }
        
        return k; // Return the number of unique elements
    }
}