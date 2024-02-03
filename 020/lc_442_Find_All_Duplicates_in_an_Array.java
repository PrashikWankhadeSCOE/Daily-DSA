
import java.util.*;
class Solution {
    public List<Integer> findDuplicates(int[] arr) {
        List <Integer> al = new ArrayList<Integer>();
        Arrays.sort(arr);
        for(int i = 0;i<arr.length;i++){
            try{
                if(arr[i]==arr[i+1]){
                    al.add(arr[i]);
                }
            }catch(ArrayIndexOutOfBoundsException ie){
                
            }
        }
        return al;
    }
}