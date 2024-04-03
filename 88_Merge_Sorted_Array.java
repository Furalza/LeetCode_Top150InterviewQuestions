/*
 * You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, and two integers m and n, 
 * representing the number of elements in nums1 and nums2 respectively.

Merge nums1 and nums2 into a single array sorted in non-decreasing order.

The final sorted array should not be returned by the function, but instead be stored inside the array nums1. 
To accommodate this, nums1 has a length of m + n, where the first m elements denote the elements that should be merged, 
and the last n elements are set to 0 and should be ignored. nums2 has a length of n.
 */

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
    int index1 = m - 1; // Index of last element in nums1
        int index2 = n - 1; // Index of last element in nums2
        int mergedIndex = m + n - 1; // Index where merged elements should be placed
    
        // Merge nums1 and nums2 by comparing elements from the end
        while (index1 >= 0 && index2 >= 0) {
            if (nums1[index1] > nums2[index2]) {
                nums1[mergedIndex] = nums1[index1];
                index1--;
            } else {
                nums1[mergedIndex] = nums2[index2];
                index2--;
            }
            mergedIndex--;
        }
        
        // If there are remaining elements in nums2, copy them to nums1
        while (index2 >= 0) {
            nums1[mergedIndex] = nums2[index2];
            index2--;
            mergedIndex--;
        }
    }
}