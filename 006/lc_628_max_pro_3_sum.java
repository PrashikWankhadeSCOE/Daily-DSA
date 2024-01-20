class Solution {
    public int maximumProduct(int[] nums) {
        int max;
        int max2;
        int max3;
        max = max2 = max3 = Integer.MIN_VALUE;

        int min;
        int min2;
        min = min2 = Integer.MAX_VALUE;

        for(int num:nums){
            if(num<min){
                min2 = min;
                min = num;
            }
            else if(num<min2){
                min2 = num;
            }
            if(num>max){
                max3 = max2;
                max2 = max;
                max = num;
            }
            else if(num>max2){
                max3 = max2;
                max2 = num;
            }
            else if(num>max3){
                max3 = num;
            }
        }
        if(max*max2*max3>max*min*min2){
            return max*max2*max3;
        }
        return max*min*min2;
    }
}