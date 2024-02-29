// ! 

import java.util.*;

class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        int n = nums.length;
        int pow = (int)Math.pow(2,n);
        for(int i = 0;i<pow;i++){
            List<Integer> arrl = new ArrayList<>();
            for(int j = 0;j<n;j++){
                if((i & (1<<j)) == 0){
                    arrl.add(nums[j]);
                }
            }
            list.add(arrl);
        }
        return list;
    }
}

//! Solution 2 Using Recursion
//! TC == O(2^n)
//! SC == O(N)

class Solution2 {
    List<List<Integer>> list = new ArrayList<>();
    public void helper(int [] nums,List<Integer> ll,int index){
        if(nums.length == index){
            list.add(ll);
            return;
        }
        int i = 0;
        List<Integer> newlist = new ArrayList<>();
        while(i<ll.size()){
            newlist.add(ll.get(i));
            i++;
        }
        newlist.add(nums[index]);
        helper(nums,newlist,index+1);
        helper(nums,ll,index+1);
        return;
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<Integer> ll = new ArrayList<>();
        helper(nums,ll,0);
        return list;
    }
}