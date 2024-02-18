import java.util.*;


//! TC == O(N)
//! SC == O(N)


class Solution {
    public int subarraysDivByK(int[] arr, int k) {
        // no of subarrays divisible by k count 
        int count=0;
        // used a map which will collect the remainder and the frequency of the remainder
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        // first we have give remained as 0 and its frequency as 1 
        // because each zero remainder means divisible so if we get next time 0 as remainder we will miss it 

        map.put(0,1);
        
        int sum = 0;
        for(int i = 0;i<arr.length;i++){
            sum = sum+arr[i];
            int rem = sum%k;
            if(rem<0){
                rem = rem+k;
            }
            if(map.containsKey(rem)){
                count+=map.get(rem);
                map.replace(rem,map.get(rem)+1);
            }
            else{
                map.put(rem,1);
            }
        }
        return count;
    }
}

//! Brute Force approach 
//! TC == O(N^2)
//? SC ==  O(1)


class Solution2 {
    public int subarraysDivByK(int[] arr, int k) {
        int count=0;
        
        for(int i =0;i<arr.length;i++){
            int sum = 0;
            for(int j = i;j<arr.length;j++){
                sum = sum+arr[j];
                if(sum%k==0){
                    count++;
                }
            }
        }
        return count;
    }
}

//! Brute Force -- Prefix Sum Approach
//! 


class Solution1 {
    public int subarraysDivByK(int[] arr, int k) {
        int count=0;

        int pref[] = new int[arr.length];
        pref[0] = arr[0];
        for(int i=1;i<pref.length;i++){
            pref[i] = arr[i]+pref[i-1];
        }
        for(int i = 0;i<pref.length;i++){
            int sum = 0;
            for(int j = i;j<pref.length;j++){
                if(i == 0){
                    sum = pref[j];
                }
                else{
                    sum = pref[j] - pref[i-1];
                }
                if(sum%k == 0){
                    count++;
                }
            }
        }

        return count;
    }
}