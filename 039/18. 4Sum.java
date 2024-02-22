import java.util.*;

//! TC == O(N^3)
//! SC == 0(N)

class Solution {
    Set<List<Integer>> set = new HashSet<>();
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        
        for(int i = 0;i<nums.length;i++){
            for(int j = i+1;j<nums.length;j++){
                int left = j+1;
                int right = nums.length-1;
                while(left<right){
                    long x = (long)nums[left]+nums[right]+nums[i]+nums[j];
                    if(x==target){
                        List<Integer> al = new ArrayList<>();
                        al.add(nums[i]);
                        al.add(nums[j]);
                        al.add(nums[left]);
                        al.add(nums[right]);

                        set.add(al);
                    }
                    if(x>target){
                        right--;
                    }
                    else{
                        left++;
                    }
                }
            }
        }
        return new ArrayList<List<Integer>>(set);
    }
}