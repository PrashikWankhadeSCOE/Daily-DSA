//! TC == O(N)
//! SC == O(N)

import java.util.Arrays;

class Solve {
    int[] printUnsorted(int[] arr, int n) {
        // code here
        int num[] = new int[n];
        for(int i = 0;i<n;i++){
            num[i] = arr[i];
        }
        Arrays.sort(arr);
        int ret [] = new int[2];
        
        for(int i = 0;i<n;i++){
            if(arr[i]!=num[i]){
                ret[0] = i;
                break;
            }   
        }
        for(int i=n-1;i>=0;i--){
            if(arr[i]!=num[i]){
                ret[1] = i;
                break;
            }
        }
        return ret;
    }
}