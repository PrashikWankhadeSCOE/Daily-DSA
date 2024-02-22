//! TC == O(N)

import java.util.*;

class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new TreeSet<>();
        for(int i = 0;i<nums.length;i++){
            set.add(nums[i]);
        }
        int num = Integer.MIN_VALUE;
        int count = 1;
        int max = 0;
        for(int i : set){
            if(num==i){
                count++;
                if(count>max){
                    max = count;
                }
                num++;
            }else{
                num = i;
                count = 1;
                if(count>max){
                    max = count;
                }
                num++;
            }
        }
        return max;
    }
}