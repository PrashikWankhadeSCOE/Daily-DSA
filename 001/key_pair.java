import java.util.HashSet;

class Solution {
    boolean hasArrayTwoCandidates(int arr[], int n, int x) {
        // code here
        HashSet<Integer> set = new HashSet<Integer>();
        
        for(int i = 0;i<n;i++){
            int sum = x - arr[i];
            
            if(set.contains(sum)){
                return true;
            }
            else{
                set.add(arr[i]);
            }
        }
        return false;
    }
}