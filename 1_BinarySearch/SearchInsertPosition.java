
// Link - https://leetcode.com/problems/search-insert-position/
// Time Complexity: O(logn), Space Complexity: O(1)
class Solution {
    public int searchInsert(int[] nums, int target) {
        int right = nums.length-1,left=0;
        while(right>=left){
            int m = left+((right-left)/2);
            if(nums[m]== target){
                return m;
            }else if(nums[m]>target){
                right= m-1;
            }else{
                left= m+1;
            }
        }
        return left;
    }
}