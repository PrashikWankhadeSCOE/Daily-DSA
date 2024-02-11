import java.util.*;

class Solution {
    public int findPairs(int[] nums, int k) {
        
        int count = 0;

        Map<Integer,Integer> vis = new HashMap<>();
        //addind values in the map
        for(int i = 0;i<nums.length;i++){
            if(!vis.containsKey(nums[i]))
                vis.put(nums[i],1);
            else{
                vis.replace(nums[i],vis.get(nums[i])+1);
            }
        }
        //Set of all unique value of the array
        Set<Integer> set = new HashSet<>(vis.keySet());

        //Condition for if k == 0
        if(k == 0){
            Iterator<Integer> itr = set.iterator();
            while(itr.hasNext()){
                int x = (int)itr.next();
                if(vis.get(x)>=2){
                    count++;
                }
            }
            return count;
        }
        
        //Contition if k != 0
        int arr[]= new int[set.size()];

        Iterator<Integer> itr = set.iterator();
        int a = 0;

        while(itr.hasNext()){
            arr[a++] = (int)itr.next();
        }

        for(int i = 0 ;i<arr.length;i++){
            for(int j = i+1;j<arr.length;j++){
                if(Math.abs(arr[i]-arr[j])==k){
                    count++;
                }
            }
        }
        return count;
    }
}

//!  Submission 1

class Solution1 {
    public int findPairs(int[] nums, int k) {
        Set<Integer> vis = new HashSet<>();
        Set<Integer> ans = new HashSet<>();
        for (int v : nums) {
            if (vis.contains(v - k)) {
                ans.add(v - k);
            }
            if (vis.contains(v + k)) {
                ans.add(v);
            }
            vis.add(v);
        }
        return ans.size();
    }
}

//! Solution3

class Solution2 {
    public int findPairs(int[] nums, int k) {
        
        int count = 0;

        Map<Integer,Integer> vis = new HashMap<>();
        //addind values in the map
        for(int i = 0;i<nums.length;i++){
            if(!vis.containsKey(nums[i]))
                vis.put(nums[i],1);
            else{
                vis.replace(nums[i],vis.get(nums[i])+1);
            }
        }

        //Condition for if k == 0
        if(k == 0){
            for(Map.Entry<Integer,Integer>  entry : vis.entrySet()){
                if(entry.getValue()>1){
                    count++;
                }
            }
            return count;
        }

        //Contition if k != 0
        
        for(Map.Entry<Integer,Integer>  entry : vis.entrySet()){
            if(vis.containsKey(entry.getKey()-k)){
                count++;
            }
        }
        return count;
    }
}