
//! TC == O(N^2)
//! SC == O(N)

class Solution {
    public static int[] runningSum(int[] nums) {
        int [] temp = nums;
        int [] ret = new int [temp.length];
        for(int i = 0;i<temp.length;i++){
            
            for(int j = 0;j<=i;j++){
                ret[i]=ret[i]+temp[j];
                
            }
        }
        return ret;
    }
}


//! TC == O(N)
//! SC == O(1)

class Solution1 {
    public int[] runningSum(int[] nums) {
        int sum = 0;
        for(int i = 0;i<nums.length;i++){
            sum += nums[i];
            nums[i] = sum;
        }
        return nums;
    }
}