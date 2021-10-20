// Link - https://leetcode.com/problems/reverse-words-in-a-string-iii/
// Time Complexity: O(n),Space Complexity: O(n)
class Solution {
    public String reverseString(char[] w) {
        int left=0, right =w.length-1;
        while(left <= right){
            char temp=w[left];
            w[left]=w[right];
            w[right]=temp;
            right--;
            left++;
        }
        return new String(w);
    }
    public String reverseWords(String s) {
        String stringArray[] =s.split(" ");
        final StringBuilder answer= new StringBuilder();
        for (int i=0; i<stringArray.length; i++){
            answer.append(reverseString(stringArray[i].toCharArray())).append(" ");
        }
        return answer.toString().trim();
    }
}
