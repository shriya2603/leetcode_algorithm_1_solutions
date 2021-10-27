// Link - https://leetcode.com/problems/letter-case-permutation/
class Solution {
    List<String> res;

    public void permutations(int i , String s, StringBuilder sb){
        if(s.length()==sb.length()){
            res.add(sb.toString());
            return;
        }
        if(i<s.length()){
            char c = s.charAt(i);
            if((c>='a' && c<='z' )|| (c>='A' && c<='Z')){
                StringBuilder sb2 = new StringBuilder(sb.toString());
                sb2.append(Character.toUpperCase(c));
                sb.append(Character.toLowerCase(c));
                permutations(i+1, s, sb);
                permutations(i+1, s, sb2);
            }else{
                sb.append(c);
                permutations(i+1, s, sb);
            }
        }
    }

    public List<String> letterCasePermutation(String s) {
        res= new ArrayList<>();
        permutations(0, s, new StringBuilder());
        return res;
    }
}