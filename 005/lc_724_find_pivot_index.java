

//? TC == O(N)
//? SC == O(1)
class Solution {
    public int pivotIndex(int[] arr) {
        int sumleft = 0;
      int sumright = 0;
      for(int i = 0;i<arr.length;i++){
          sumright += arr[i];
      }
      for(int i = 0;i<arr.length;i++){
          if(i==0){
              sumright -= arr[i];
          }else{
              sumleft+=arr[i-1];
              sumright -=arr[i];
          }
          if(sumleft == sumright){
              return i;
          }
      }
      return -1;
    }
}