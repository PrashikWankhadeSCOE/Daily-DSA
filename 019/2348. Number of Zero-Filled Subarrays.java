class Solution {
    public long zeroFilledSubarray(int[] nums) {
        long sub = 0;
        long count = 0;
        for(int i = 0;i<nums.length;i++){
            
            if(i>0 && nums[i]==0 && nums[i-1]==0){
                if(count == 0){
                    count+=2;
                }
                else{
                    count++;
                }
            }
            else if(nums[i]==0){
                count++;
            }
            else{
                sub+=count*(count+1)/2;
                count = 0;
            }
        }
        if(count!=0){
            sub+=count*(count+1)/2;
        }
        return sub;
    }
}