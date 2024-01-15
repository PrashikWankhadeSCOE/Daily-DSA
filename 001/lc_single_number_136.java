class Solution {
    public int singleNumber(int[] nums) {

        for(int i = 0;i<nums.length;i++){
            int start=0;
            int end=nums.length-1;
            while(start<=end){
                if((i!=start && nums[i]==nums[start]) || (i!=end && nums[i]==nums[end])){
                    break;
                }
                start++;
                end--;
            }
            if(start>end){
                return nums[i];
            }
        }
        return -1;
    }
}