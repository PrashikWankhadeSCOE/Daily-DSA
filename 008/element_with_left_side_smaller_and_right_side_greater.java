
class Compute {
    public int findElement(int arr[], int n){
        for(int i = 1;i<n-1;i++){
            boolean broke = false;
            for(int j = 0;j<i;j++){
                if(arr[j]>arr[i]){
                    broke = true;
                    // System.out.println(arr[j]+" "+arr[i] );
                    break;
                }
            }
            
            for(int j = i+1;j<n;j++){
                if(broke){
                    break;
                }
                if(arr[j]<arr[i]){
                    broke = true;
                    // System.out.println(arr[j]+" "+arr[i] );
                    break;
                }
            }
            if(!broke){
                return arr[i];
            }
        }
        return -1;
    }
}
