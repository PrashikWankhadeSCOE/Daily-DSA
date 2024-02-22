

//! TLE
//! TC == O(N^2)
//! SC == O(1)

class Solution
{
    // arr[]: Input Array
    // N : Size of the Array arr[]
    //Function to count inversions in the array.
    static long inversionCount(long arr[], long N)
    {
        // Your Code Here
        long count = 0;
        boolean swapped = false;
        for(int i = 0;i<arr.length;i++){
            for(int j = 0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    long temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    count++;
                    swapped = true;
                }
            }
            if(!swapped){
                break;
            }
        }
        
        return count;
    }
}
