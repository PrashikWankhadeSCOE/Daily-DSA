 

//! TC == O(N^2)
//! SC == O(N^2)

import java.util.*;

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {

        Set<Integer> set = new HashSet<Integer>();

        for(int i = 0;i<nums1.length;i++){
            for(int j = 0;j<nums2.length;j++){
                if(nums1[i]==nums2[j]){
                    set.add(nums2[j]);
                    break;
                }
            }
        }
        int arr[] = new int[set.size()];
        int x = 0;
        for(int i : set){
            arr[x++] = i;
        }
        return arr;
    }
}

//! TC == O(N)
//! SC == O(N)
class Solution1 {
    public int[] intersection(int[] nums1, int[] nums2) {
        int count = 0;
        int arr [] = new int[1001];

        for(int i = 0;i<nums1.length;i++){
            arr[nums1[i]] = 1;
        }
        for(int i = 0;i<nums2.length;i++){
            if(arr[nums2[i]]==1){
                arr[nums2[i]] = 2;
                count++;
            }
        }
        int ret[] = new int[count];
        for(int i = 0,j = 0 ;i<arr.length && j<ret.length;i++){
            if(arr[i]==2){
                ret[j]=i;
                j++;
            }
        }
        return ret;
    }
}