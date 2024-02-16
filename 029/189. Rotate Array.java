//! Brute force 
//! TC == O(N^2)
//! SC == O(1)

class Solution {
    public void rotate(int[] nums, int k) {
        for(int i = 0;i<k;i++){
            int x = nums[nums.length-1];
            for(int j = nums.length-1;j>0;j--){
                int temp = nums[j];
                nums[j] = nums[j-1];
                nums[j-1] = temp;
            }
            nums[0] = x;
        }
        
    }
}

//! Using Extra space which is not allowed
//! TC == O(N);
//! SC == O(K);

class Solution1 {
    public void rotate(int[] nums, int k) {
        
        if(nums.length<k){
            k = k%nums.length;
        }
        int arr[] = new int[k];
        int x = 0;
        for(int i = nums.length-k;i<nums.length;i++){
            arr[x++] = nums[i];
        }
        for(int i = nums.length - k-1;i>=0;i--){
            nums[i+k] = nums[i];
        }
        for(int i = 0;i<arr.length;i++){
            nums[i] = arr[i];
        }
    }
}