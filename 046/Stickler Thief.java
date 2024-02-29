

//! TC == O(N)
//! SC == O(1)

class Solution
{
    //Function to find the maximum money the thief can get.
    public int FindMaxSum(int arr[], int n)
    {
        // Your code here
        int prev2 = 0;
        int prev1 = arr[0];
        
        for(int i = 1;i<n;i++){
            int incl = prev2 + arr[i];
            int excl = prev1;
            
            int ans = Math.max(incl,excl);
            
            prev2 = prev1;
            prev1 = ans;
        }
        return prev1;
    }
}

//! TLE




class Solution3
{
    //Function to find the maximum money the thief can get.
    int maxSum = 0;
    public void helper(int arr[],int sum,int index){
        if(index>=arr.length){
            if(maxSum<sum){
                maxSum = sum;
            }
            return;
        }
        helper(arr,sum+arr[index],index+2);
        helper(arr,sum,index+1);
        return;
    }
    public int FindMaxSum(int arr[], int n)
    {
        // Your code here
        helper(arr,0,0);
        return maxSum;
    }
}

//! TLE

class Solution2
{
    //Function to find the maximum money the thief can get.

    public int helper(int arr[],int index){
        if(index>=arr.length){
            return 0;
        }
        if(index == arr.length-1){
            return arr[arr.length-1];
        }
        
        int inc = helper(arr,index+2) + arr[index];
        int exc = helper(arr,index+1);
        
        return Math.max(inc,exc);
    }
    public int FindMaxSum(int arr[], int n)
    {
        // Your code here
       return  helper(arr,0);
    }
}