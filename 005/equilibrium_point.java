
//? TC == O(N)
//? SC == O(1)
class Solution {

    
  // a: input array
  // n: size of array
  // Function to find equilibrium point in the array.
  public static int equilibriumPoint(long arr[], int n) {

      // Your code here
      int sumleft = 0;
      int sumright = 0;
      for(int i = 0;i<n;i++){
          sumright += arr[i];
      }
      for(int i = 0;i<n;i++){
          if(i==0){
              sumright -= arr[i];
          }else{
              sumleft+=arr[i-1];
              sumright -=arr[i];
          }
          if(sumleft == sumright){
              return i+1;
          }
      }
      return -1;
  }
}