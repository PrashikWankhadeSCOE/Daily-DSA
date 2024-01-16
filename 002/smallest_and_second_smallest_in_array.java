

//! TC == O(N)
//! SC == O(1)
class Compute 
{
    public long[] minAnd2ndMin(long a[], long n)  
    {
        long min = Integer.MAX_VALUE;
        long secMin = min;
        for(int i = 0;i<n;i++){
            if(a[i]<min){
                secMin = min;
                min = a[i];
            }
            if(a[i]!=min && a[i]>min && a[i]<secMin){
                secMin = a[i];
            }
        }
        long arr[] ={};
        if(secMin == Integer.MAX_VALUE ){
            arr = new long [1];
            arr[0] = -1;
        }
        else{
            arr =new long [2];
            arr[0] = min;
            arr[1] = secMin;
        }
        return arr;
    }
}

