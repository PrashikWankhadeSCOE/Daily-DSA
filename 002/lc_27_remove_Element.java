

//! O(N^2)
//! O(1)
class Solution {
    public int removeElement(int[] nums, int val) {
        int a = 0;
        for(int i = 0;i<nums.length;i++){
            if(nums[i] == val){
                a++;
                for(int j = i;j<nums.length-1;j++){
                    nums[j] = nums[j+1];
                }
                nums[nums.length-1] =-1;
                i--;
            }
        }
        return nums.length-a;
    }
}