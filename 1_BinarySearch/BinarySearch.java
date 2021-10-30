// Link - https://leetcode.com/problems/binary-search/
// Time Complexity: O(logn), Space Complexity: O(1)
class Solution {
  public int search(int[] nums, int target) {
      int s= 0, e = nums.length-1, answer=0, mid=0;
      while(e>=s){
        int m = s+ ((e-s)/2);
        if(nums[m]==target){
          return m;
        }else if(nums[m]<target){
          s=m+1;
        }else{
          e=m-1;
        }
      }  
      return -1;
    }
}