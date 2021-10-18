// Link - https://leetcode.com/problems/rotate-array/
// Time Complexity: O(n) , Space Complexity: O(1)
class Solution {
    public void reverse(int nums[], int l, int r){
        while(r>=l){
            int temp= nums[l];
            nums[l]= nums[r];
            nums[r]=temp;
            l++;r--;
        }
    }
    public void rotate(int[] nums, int k) {
        int n = nums.length, l= 0;
        k= k%n;
        reverse(nums, 0, n-k-1);
        reverse(nums, n-k, n-1);
        reverse(nums, 0, n-1);
    }
}
