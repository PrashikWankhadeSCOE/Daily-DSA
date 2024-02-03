class Solution {
    public int[] productExceptSelf(int[] nums) {
        int arr[] = new int[nums.length];
        int count = 0;
        int index = -1;
        int pro = 1;
        for(int i = 0;i<nums.length;i++){
            if(nums[i]==0){
                count++;
                index = i;
                if(count>1){
                    return arr;
                }
            }
            else{
                pro = pro*nums[i];
            }
        }
        if(count == 1){
            arr[index] = pro;
            return arr;
        }

        for(int i = 0;i<nums.length;i++){
            arr[i] = pro/nums[i];
        }
        return arr;
    }
}