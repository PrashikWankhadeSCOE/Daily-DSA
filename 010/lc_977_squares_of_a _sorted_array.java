
//! TC == O(N^2)
//! SC == O(1)

class Solution {
    public int[] sortedSquares(int[] nums) {
        for(int i = 0;i<nums.length;i++){
            nums[i] = nums[i]*nums[i];
        }
        for(int i = 0;i<nums.length;i++){
            boolean swapped = true;
            for(int j = 0;j<nums.length-1;j++){
                // System.out.println(nums[j] +" "+ nums[j+1]);
                if(nums[j]>nums[j+1]){
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                    swapped = false;
                }
            }
            if(swapped){
                return nums;
            }
        }
        return nums;
    }
}