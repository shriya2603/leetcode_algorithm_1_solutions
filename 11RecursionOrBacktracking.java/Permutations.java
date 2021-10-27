// Link - https://leetcode.com/problems/permutations/
class Solution {
    List<List<Integer>> res;
    public void permutations(int[] nums,ArrayList<Integer> ans,int n){
        if(n== ans.size()){
            res.add(new ArrayList<>(ans));
            return;
        }
        for(int i =0;i<n;i++){
            if(ans.contains(nums[i])){
                continue;
            }
            ans.add(nums[i]);
            permutations(nums, ans, n);
            ans.remove(ans.size()-1);
        }
    }

    public List<List<Integer>> permute(int[] nums) {
        res = new ArrayList<>();
        int n = nums.length;
        if(n <= 0){
            return res;
        }
        permutations(nums, new ArrayList<Integer>(), n);
        return res;
    }
}