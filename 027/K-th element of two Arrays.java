
class Solution {
    public long kthElement( int arr1[], int arr2[], int n, int m, int k) {
        int i = 0;
        int j = 0;
        
        while(i<n && j<m){
            // System.out.println(arr1[i]+" "+arr2[j]);
            if(arr1[i]<arr2[j]){
                if(k==1){
                    return arr1[i];
                }
                i++;
            }
            else{
                if(k==1){
                    return arr2[j];
                }
                j++;
            }
            k--;
        }
        while(i<n){
            if(k==1){
                return arr1[i];
            }
            i++;
            k--;
        }
        while(j<m){
            if(k==1){
                return arr2[j];
            }
            j++;
            k--;
        }
        return -1;
    }
}