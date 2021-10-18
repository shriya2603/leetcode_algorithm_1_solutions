// Link - https://leetcode.com/problems/first-bad-version/
// Time Complexity: O(logn), Space Complexity: O(1)
public class Solution extends VersionControl {
    public int binarySearch(int l, int r, int a){
        if(r>=l){
            int m = l+((r-l)/2);
            boolean f= isBadVersion(m);
            if(f){
                a= m;
                return binarySearch(l, m-1,a);
            }else{
                return binarySearch(m+1,r,a);
            }
        }        
        return a;
    }
    
    public int firstBadVersion(int n) {
        return binarySearch(1,n,n);
    }
}