import java.util.HashMap;
import java.util.Map;

class Solution {
    public int findDuplicate(int[] nums) {
        Map <Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i = 0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                return nums[i];
            }
            else{
                map.put(nums[i],1);
            }
        }
        return -1;
    }
}