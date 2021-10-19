// Link - https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/
// Time Complexity: O(n)  , Space Complexity: O(1)
class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int ans[] = new int[2];
        int n= numbers.length, l =0, r=n-1;
        while(r>l){
            int currentSum = numbers[l]+numbers[r];
            if(currentSum==target){
                ans[0]=l+1; ans[1]= r+1;
                return ans;
            }else if(currentSum > target ){
                r--;
            }else{
                l++;
            }
        }
        return ans;
    }
}
