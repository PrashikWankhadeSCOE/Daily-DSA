


class Solution {

    public static int longest(int arr[],int n)
    {
        int count =1;
        int x = arr[0];
        for(int i =0;i<arr.length-1;i++){
            if(x<=arr[i+1]){
                count++;
                x=arr[i+1];
            }
        }
        return count;
    }
}
