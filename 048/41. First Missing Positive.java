import java.util.*;




//! TC == O(N)
//! SC == O(N)
//! Extra space used which is not allowed in question

class Solution {
    public int firstMissingPositive(int[] nums) {
        Set<Integer> set = new TreeSet<>();
        for(int i = 0;i<nums.length;i++){
            if(nums[i]>0){
                set.add(nums[i]);
            }
        }
        int i = 1;
        for(int val:set){
            if(i != val){
                return i;
            }else{
                i++;
            }
        }
        return i;
    }
}
