// Link - https://leetcode.com/problems/combinations/
class Solution {
    List<List<Integer>> res ;

    public void combinations(int s, int n , int k , ArrayList<Integer> list){
        if(list.size()==k){
            res.add(new ArrayList<>(list));
            return;
        }
        for(int i = s;i<=n;i++){
            list.add(i);
            combinations(i+1, n, k, list);
            list.remove(list.size()-1);
        }
    }

    public List<List<Integer>> combine(int n, int k) {
        res = new ArrayList<>();
        if(n==0){
            return res;
        }
        combinations(1,n,k,new ArrayList<Integer>());
        return res;
    }
}