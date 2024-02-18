import java.util.*;

class Solution {
    public int[][] merge(int[][] intervals) {
        
        // List to collect all the arrays pair
        // we used list because we have to keep data updating and we dont know 
        // how many elements will be in the list
        
        List<int[]> ans = new ArrayList<>();
        
        // Sortint the array according the 1st element of each column
        
        Arrays.sort(intervals,new Comparator<int[]>(){
            public int compare(int [] o1,int []o2){
                return Integer.compare(o1[0],o2[0]);
            }
        });
        
        // pair array newinterval 
        // first wwe put our first pair in the list ans
        
        int [] newinterval = intervals[0];
        ans.add(newinterval);
        
        // iterated the array intervals and checked if the 1st element of 
        // next array is less than the 2nd ele of array in the list 
        // if yes then it means that the array is overlapping 

        for(int[] interval: intervals){
            if(interval[0]<=newinterval[1]){
                // when we get the overlaping element we take maximum of 
                // the end element 
                newinterval[1] = Math.max(interval[1],newinterval[1]);
            }
            else{
                newinterval = interval;
                ans.add(newinterval);
            }
        }
        // converting the list into array 
        return ans.toArray(new int[ans.size()][]);
    }
}