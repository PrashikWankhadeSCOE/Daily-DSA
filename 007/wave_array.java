

//! Old Attempt
//! TC == O(N)
//! SC == O(1)

class Solution {
    public static void convertToWave(int n, int[] a) {
        int temp;
        for(int i =0;i<a.length-1;i++){
            if(a[i]<a[i+1] && i%2==0){
                temp = a[i+1];
                a[i+1]=a[i];
                a[i]=temp;
            }
        }
    }
}

//! New Attempt
//! TC == O(N)
//! SC == O(1)

class Solution1 {
    public static void convertToWave(int n, int[] a) {
        
        for(int i = 0;i<n-1;i++){
            if(n-1-i>0){
                int temp = a[i];
                a[i]=a[i+1];
                a[i+1]=temp;
                i++;
            }
        }
    }
}