
class Solution {
    public int maxSubArray(int[] nums) {
        //TC : O(N^2)

        /*int arr[] = nums;
        for(int i = 1;i<arr.length;i++){
            arr[i] = arr[i-1]+nums[i];
        }
        int maxSum = Integer.MIN_VALUE;
        int sum = arr[0];
        for(int i = 0;i<arr.length;i++){
            for(int j = i;j<arr.length;j++){    
                if(i==0)
                    sum = arr[j];
                else
                    sum = arr[j]-arr[i-1];
                if(sum>maxSum)
                    maxSum = sum;
            }
        }*/

        //Kadane's Algorithm
        //TC : O(N)

        int sum = 0;
        int maxSum = Integer.MIN_VALUE;
        for(int i = 0;i<nums.length;i++){
            
            sum = sum+nums[i];
            
            if(sum>maxSum)
                maxSum=sum;
            if(sum<0)
                sum = 0;
        }

        return maxSum;
    }
}