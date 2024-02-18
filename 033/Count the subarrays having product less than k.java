

//!  TLE
//!  TC == O(N^2)
//!  SC == O(1)

class Solution {
    
    public long countSubArrayProductLessThanK(long a[], int n, long k)
    {
        long count = 0;
        for(int i = 0;i<n;i++){
            
            long pro = 1;
            for(int j = i;j<n;j++){
                pro = pro*a[j];
                if(pro<k){
                    count++;
                }
                else{
                    break;
                }
            }
        }
        return count;
    }
}