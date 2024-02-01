import java.util.PriorityQueue;

/* Here in this problem i have used a PriorityQueue 
 and a method which is called as heapify or heap 
 here in priorityQueue pq i have been inserting the data one by one 
 as in pq the data is stored in a sorted manner like smallest i stored at lowest and 
 heigest is stored at the top 
 and we want the top kth element
 so if the element is less is greater then it will be set at top and if the length is greater than k then 
 topmost element will be removed 
 if the element is less then it will be inserted in between and top element will be removed 
 which will obiviosly e greater than the remaining k element which are there in pq
 */ 


//! O(Nlogn)
class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq =new PriorityQueue<>();
        for(int i : nums){
            pq.add(i);
            if(pq.size()>k){
                pq.remove();
            }
        }
        return pq.remove();
    }
}