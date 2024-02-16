
import java.util.*;


//Correct Output


//! TC = (nlogn) + (n^2) == O(n^2)
//! SC = space for set = O(N);

class Solution {
    // Set for not getting duplicate values in the List
    Set<List<Integer>> res = new HashSet<>();

    public List<List<Integer>> threeSum(int[] nums) {
        // Sorting the array to use a two sum sorted approach ahead
        Arrays.sort(nums);
        // a + b + c = 0;
        // b + c = -a
        // here a will be nums[i] and we have to find b and c 
        for(int i = 0;i<nums.length;i++){
            // here we are calling two sum sorted function where -nums[i]  will be out target
            // and will check from i+1 to end of the array;
            twoSumSorted(i+1,nums.length-1,nums,-nums[i]);
        }
        return new ArrayList<List<Integer>>(res);
    }

    public void twoSumSorted(int left,int right,int [] nums,int target){
        while(left<right){
            if(nums[left]+nums[right] == target){
                // here we have used a small arrayList of size 3 where if we get b + c = -a
                // we will add that a, b,c to the arraylist 
                // and to continue if there are also other element we will move left to one position ahead
                // and right to 1 position back
                // if we dont do that then it will get into a infinite loop and continuosly keep adding the data to set

                List<Integer> al = new ArrayList<>();
                al.add(-target);
                al.add(nums[left]);
                al.add(nums[right]);

                res.add(al);
                left++;
                right--;

            }
            // this is basic logic of finding two sums 
            else if(nums[left]+nums[right]>target){
                right--;
            }
            else{
                left++;
            }
        }
    }
}

//Wrong for 1 test case 

class Solution2 {
    public List<List<Integer>> threeSum(int[] nums) {
        
        List<List<Integer>> ll = new ArrayList<>();

        Arrays.sort(nums);
        for(int i = 0;i<nums.length;i++){
            
                List<Integer> al = twoSumSorted(i+1,nums.length-1,nums,-nums[i]);
                if(!al.isEmpty()){
                    ll.add(al);
                }
        }
        return ll;
    }
    public List<Integer> twoSumSorted(int left,int right,int []nums,int target){
        
        List<Integer> al = new ArrayList<Integer>();
        
        while(left<right){
            int mid = left + (right - left)/2;
            
            if(nums[left]+nums[right] == target){
                
                al.add(-target);
                al.add(nums[left]);
                al.add(nums[right]);
                return al;
            }
            else if(nums[left]+nums[right]>target){
                if(nums[left]+nums[mid]>target){
                    right = mid;
                }
                right--;
                
            }
            else{
                if(nums[left]+nums[mid]<target){
                    left = mid;
                }
                left++;
            }
        }
        return al;
    }
}

//

class Solution1 {
    public List<List<Integer>> threeSum(int[] nums) {
        
        Set<List<Integer>> set = new HashSet<>();
        
        Arrays.sort(nums);
        
        for(int i = 0;i<nums.length;i++){
            int target = -nums[i];
            int left = i+1;
            int right = nums.length-1;
            
            while(left<right){
                int mid = left + (right - left)/2;
                
                if(nums[left]+nums[right] == target){
                    
                    List<Integer> al = new ArrayList<Integer>();
                    al.add(nums[i]);
                    al.add(nums[left]);
                    al.add(nums[right]);
                    
                    set.add(al);
                    break;
                }
                else if(nums[left]+nums[right]>target){
                    if(nums[left]+nums[mid]>target){
                        right = mid;
                    }
                    right--;
                    
                }
                else{
                    if(nums[left]+nums[mid]<target){
                        left = mid;
                    }
                    left++;
                }
            }
        }
        return new ArrayList<List<Integer>>(set);
    }
}