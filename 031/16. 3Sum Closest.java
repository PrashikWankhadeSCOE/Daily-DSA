

class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int closest = Integer.MAX_VALUE;
        int sum = 0;
        for(int i = 0;i<nums.length;i++){
            for(int j = i+1;j<nums.length;j++){
                for(int k = j+1;k<nums.length;k++){
                    if(Math.abs(nums[i]+nums[j]+nums[k]-target)<closest){
                        closest = Math.abs(nums[i]+nums[j]+nums[k]-target);
                        sum = nums[i]+nums[j]+nums[k];
                    }
                }
            }
        }
        return sum;
    }
}