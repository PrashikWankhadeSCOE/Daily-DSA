import java.util.ArrayList;

//! TC == O(N)
//! SC == O(N)

class Solution{
    //Function to find the leaders in the array.
    static ArrayList<Integer> leaders(int arr[], int n){
        // Your code here
        ArrayList<Integer> al = new ArrayList<Integer>();
        
        int x = -1;
        for(int i = n-1;i>=0;i--){
            if(arr[i]>=x){
                al.add(arr[i]);
                x = arr[i];
            }
        }
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i = al.size()-1;i>=0;i--){
            list.add(al.get(i));
        }
        return list;
    }
}
