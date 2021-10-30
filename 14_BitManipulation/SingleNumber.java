// Link - https://leetcode.com/problems/single-number/
class Solution {
    public int singleNumber(int[] nums) {
        int r=0;
        for(int n:nums){
            r=r^n;
        }
        return r;
    }
}
