
class Solution {
    int binarysearch(int arr[], int n, int k) {
        // code here
        int s = 0;
        int e = n-1;
        
        while(s<=e){
            int mid = s+(e-s)/2;
            if(k==arr[mid]){
                return mid;
            }
            else if(arr[mid]<k){
                s = mid+1;
            }
            else{
                e = mid-1;
            }
        }
        return -1;
    }
}
