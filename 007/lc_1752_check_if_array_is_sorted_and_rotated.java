

//! TC == O(N)
//! SC == O(1)
class Solution {
    public boolean check(int[] nums) {
        int min = Integer.MAX_VALUE;
        int minIndex = 0;
        
        for(int i = nums.length-1;i>=0;i--){
            if(nums[i]<=min){
                min=nums[i];
                minIndex = i;
            }
            else{
                break;
            }
        }
        for(int i = minIndex;i<nums.length-1;i++){
            if(nums[i]>nums[i+1])
                return false;
        }
        if(minIndex != 0 && nums[nums.length-1]>nums[0]){
            return false;
        }
        for(int i = 0;i<minIndex-1;i++){
            if(nums[i]>nums[i+1])
                return false;
        }
        return true;
    }
}