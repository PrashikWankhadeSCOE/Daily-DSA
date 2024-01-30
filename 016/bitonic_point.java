


class Solution {
    int findMaximum(int[] arr, int n) {
        if(arr[n-1]>arr[n-2]){
            return arr[n-1];
        }
        
        int s = 0;
        int e = n-1;
        
        
        while(s<=e){
            int mid = s+(e-s)/2;
            
            if( mid != n-1 && arr[mid+1]>arr[mid]){
                s = mid+1;
            }
            else if(mid != 0 && arr[mid-1]>arr[mid]){
                e = mid-1;
            }
            else if(arr[mid]>arr[mid-1] && arr[mid]>arr[mid+1]){
                return arr[mid];
            }   
            
        }
        return arr[n-1];
    }
}