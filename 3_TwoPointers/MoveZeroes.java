// Link - https://leetcode.com/problems/move-zeroes/
// Time Complexity: O(n) , Space Complexity: O(n)
// class Solution {
//     public void moveZeroes(int[] nums) {
//         int countZeroes= 0;
//         Queue<Integer> q = new LinkedList<Integer>();
//         for(int i=0;i<nums.length;i++){
//           if(nums[i]==0){
//               q.add(i);
//           }else if(!q.isEmpty() && nums[i]!=0){
//               int zindex= q.poll();
//               nums[zindex]= nums[i];
//               nums[i]=0;
//               q.add(i);
//           }
//         }
//     }
// }

// Time Complexity: O(n) , Space Complexity: O(1)
class Solution {
    public void moveZeroes(int[] nums) {
        int size=nums.length;
        int next=0;
        for(int x:nums){
            if(x!=0) {
                nums[next]=x;
                next++;
            }
        }
        for(int i=next;i<size;i++){
            nums[i]=0;
        }

    }
}