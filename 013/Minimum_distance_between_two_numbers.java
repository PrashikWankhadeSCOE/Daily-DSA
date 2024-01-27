

class Solution {
    int minDist(int arr[], int n, int x, int y) {
        int a = -1;
        int b = -1;
        int diff = Integer.MAX_VALUE;
        for(int i = 0;i<n;i++){
            if(arr[i]==x){
                a = i;
            }
            if(arr[i]==y){
                b = i;
            }
            if((a!=-1 && b!=-1) && (Math.abs(a-b) < diff)){
                diff = Math.abs(a-b);
            }
        }
        if(a == -1 || b == -1){
            return -1;
        }
        return diff;
    }
}