// Link - https://leetcode.com/problems/number-of-1-bits/
public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int count=0;
        String s=Integer.toBinaryString(n);
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1'){
                count+=1;
            }
        }
        return count;
    }
}