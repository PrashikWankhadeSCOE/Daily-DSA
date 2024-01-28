

//! TC == O(N^2)
//! SC == O(1)

class Solution {

    public static int smallestSubWithSum(int a[], int n, int x) {
        int len = Integer.MAX_VALUE;
        for(int i = 0;i<n;i++){
            int sum = 0;
            for(int j = i;j<n;j++){
                sum = sum+a[j];
                if(sum>x && len>j-i){
                  len = j-i+1;
                  break;
                }
            }
        }
        if(len == Integer.MAX_VALUE){
            return 0;
        }
        return len;
        
    }
}