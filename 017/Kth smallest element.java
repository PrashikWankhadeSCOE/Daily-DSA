

import java.util.Collections;
import java.util.PriorityQueue;

class Solution{
    public static int kthSmallest(int[] arr, int l, int r, int k) 
    { 
        //Your code here
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        
        for(int i : arr){
            pq.add(i);
            if(pq.size()>k){
                pq.remove();
            }
        }
        return pq.remove();
    } 
}