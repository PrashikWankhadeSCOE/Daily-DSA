class Solution {
    public int missingNumber(int[] arr) {
        int x = 0;
        for(int i = 0;i<arr.length;i++){
            if(arr[i]==x || arr[0]==x){
                x++;
                i=0;
            }
        }
        return x;
    }
}