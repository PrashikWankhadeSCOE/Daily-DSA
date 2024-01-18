//! TC == O(N)
//! SC == O(N)
class Solution {
    static void reArrange(int[] arr, int N) {
        // code here
        int [] even = new int[N/2];
        int [] odd = new int[N/2];
        
        int e = 0;
        int o = 0;
        for(int i = 0;i<arr.length;i++){
            if(arr[i]%2==0)
                even[e++]=arr[i];
            else
                odd[o++] = arr[i];
        }
        e = 0;
        for(int i = 0;i<arr.length;i=i+2){
            arr[i]=even[e++];
        }
        o=0;
        for(int i = 1;i<arr.length;i=i+2){
            arr[i]=odd[o++];
        }
    }
}

//! TC == O(N)
//? SC == O(1)


