class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int c = 0;
        int count = c;
        for(int i = 0;i<nums.length;i++){
            if(nums[i]==1){
                c++;
            }
            else {
               c = 0;
            }
            if(count<c){
                count = c;
            }
        }
        if(count<c){
            count= c;
        }
        return count;
    }
}