//! TC == O(N^2)
//! SC = O(1)

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Set;

class Solution {
    public int majorityElement(int[] arr) {
        int maj = -1;
        for(int i = 0;i<arr.length;i++){
            int n = arr[i];
            int c = 0;
            for(int j = 0;j<arr.length;j++){
                if(n == arr[j]){
                    c++;
                }
            }
            if(c>arr.length/2){
                maj = n;
                break;
            }
        }
        return maj;
    }
}

//! TC == o(n)
//! SC == o(n)

class Solution1 {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> map = new LinkedHashMap<Integer,Integer>();

        for(int i = 0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                int val = map.get(nums[i]);
                val++;
                map.replace(nums[i],val);
            }
            else{
                map.put(nums[i],1);
            }
        }
        Set<Integer> set = map.keySet();
        for(int i : set){
            if(map.get(i)>nums.length/2){
                return i;
            }
        }
        return -1;
    }
}