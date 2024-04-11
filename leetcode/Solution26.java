package leetcode;

public class Solution26 {

    //Solution for Leetcode problem 26: Remove Duplicates from Sorted Array
    //Two pointer solution, in-place O(n)
    public int removeDuplicates1(int[] nums) {

        int k = 1;

        int pA = 0;

        int pB = 0;

        while (pB < nums.length) {
            //check if the current value is something we have not seen before
            if (nums[pB] != nums[pA]) {
                pA++;
                nums[pA] = nums[pB];
                k++;
            }
            pB++;
        }

        return k;
    }

    public int removeDuplicates2(int[] nums) {
        //starting from 1 as 0 will always be there as first element
        int availableSlot = 1;

        //second pointer traversing till it finds a number we have not seen before
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i-1]) {
                nums[availableSlot] = nums[i];
                availableSlot++;
            }
        }

        return availableSlot;
    }
}
