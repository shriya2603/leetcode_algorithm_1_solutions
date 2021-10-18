// Link - https://leetcode.com/problems/squares-of-a-sorted-array/
// Time Complexity: O(n) , Space Complexity: O(n)
class Solution {
    public int[] sortedSquares(int[] nums) {
        int n= nums.length;
        int a[] = new int[n];
        int l= 0, r=nums.length-1;
        for(int i=n-1;i>=0;i--){
            if(Math.abs(nums[l])> Math.abs(nums[r])){
                a[i]=nums[l]*nums[l];l++;
            }else{
                a[i]=nums[r]*nums[r];r--;
            }
        }
        return a;
    }
}