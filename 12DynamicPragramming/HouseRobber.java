// Link - https://leetcode.com/problems/house-robber/
class Solution {
    public int rob(int[] nums) {
        if(nums.length==1){
            return nums[0];
        }
        int n = nums.length;
        int res[] = new int [n];
        res[0]=nums[0]; res[1]=nums[1];
        int max=(int)Math.max(res[1],res[0]);
        for(int i=2;i<n;i++){
            if((i - 3) >=0){
               res[i] = nums[i]+(int)Math.max(res[i-2], res[i-3]);
            }else{
               res[i] = nums[i]+ res[i-2];
            }
            max= Math.max(res[i],max);
        }
        return max;
        
    }
}