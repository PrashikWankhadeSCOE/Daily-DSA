
// User function Template for Java

import java.util.LinkedHashMap;

class Solution {
    // Function to return the position of the first repeating element.
    public static int firstRepeated(int[] arr, int n) {
        // Your code here
        LinkedHashMap<Integer,Integer> map = new LinkedHashMap<>();
        for(int i = 0;i<n;i++){
            if(!map.containsKey(arr[i])){
                map.put(arr[i],1);
            }
            else{
                int val = map.get(arr[i]);
                map.replace(arr[i],++val);
            }
        }
        Set<Integer> keys = map.keySet();
        int i = 1;
        for(int val : keys){
            if(map.get(val)>=2){
                return i;
            }
            i++;
        }
        return -1;
    }
}
