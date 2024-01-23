

class Solution {
    void rearrange(int arr[], int n) {
        // code here
        Queue<Integer> neg = new LinkedList<>();
        Queue<Integer> pos = new LinkedList<>();
        // int a = 0;
        // int b = 0;
        for(int i = 0;i<n;i++){
            if(arr[i]<0){
                neg.offer(arr[i]);
            }
            else{
                pos.offer(arr[i]);
            }
        }
        // a = 0;
        // b = 0;
        int i = 0;
        while(!pos.isEmpty() && !neg.isEmpty()){
            if(i%2==0){
                arr[i++] = pos.poll();
            }
            else{
                arr[i++] = neg.poll();
            }
        }
        while(!pos.isEmpty()){
            arr[i++] = pos.poll();
        }
        while(!neg.isEmpty()){
            arr[i++] = neg.poll();
        }
    }
}