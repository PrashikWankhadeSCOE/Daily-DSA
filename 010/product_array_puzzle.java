

//! TC == O(N^2)
//! SC == O(N)



class Solution 
{ 
	public static long[] productExceptSelf(int nums[], int n) 
	{ 
	    long [] arr = new long[n];
	    for(int i = 0;i<n;i++){
	        long pro = 1;
	        for(int j = 0;j<n;j++){
	            if(i!=j){
	                pro = pro*nums[j];
	            }
	        }
	        arr[i] = pro;
	    }
	    return arr;
	} 
} 


//! TC == O(N)
//! SC == O(N)

class Solution1
{ 
	public static long[] productExceptSelf(int nums[], int n) 
	{ 
        // code here
        long [] arr = new long[n];
        
        long product = 1;
        int count0 = 0;
        int index = -1;
        
        for(int i = 0;i<n;i++){
            if(nums[i]==0){
                count0++;
                index = i;
                if(count0>1){
                    return arr;
                }
            }
            if(nums[i] != 0){
                product *= nums[i];
            }
        }
        if(count0==1){
            arr[index] = product;
            return arr;
        }
        for(int i = 0;i<arr.length;i++){
            arr[i] = product/nums[i];
        }
        return arr;
	} 
} 
