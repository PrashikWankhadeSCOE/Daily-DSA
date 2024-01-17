
import java.util.*;

//! TLE
//? TC == O(N^2)
//? SC == O(1)
class Solution {
    int getPairsCount(int[] arr, int n, int k) {
        // code here
        int count = 0;
        for(int i = 0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==k){
                    count++;
                }
            }
        }
        return count;
    }
}

//! TC == O(N)
//! SC == O(N)
class Solution1 {
    int getPairsCount(int[] arr, int n, int k) {
        // code here
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        int count = 0;
        for(int i = 0;i<n;i++){
            int x = k-arr[i];
            if(map.containsKey(x)){
                count += map.get(x);
            }
            if(map.containsKey(arr[i])){
                map.replace(arr[i],map.get(arr[i])+1);
            }
            else{
                map.put(arr[i],1);
            }
        }
        return count;
    }
}