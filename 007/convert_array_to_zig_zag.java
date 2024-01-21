

//! TC == O(N)
//! SC == O(1)

class Solution{
    public void zigZag(int a[], int n){ 
        int temp = 0;
        for(int i = 0;i<a.length-1;i++){
            if(a[i]>a[i+1] && i%2==0){
                temp = a[i];
                a[i] = a[i+1];
                a[i+1] = temp;
            }
            else if (i%2==1 && a[i]<a[i+1]){
                temp = a[i];
                a[i] = a[i+1];
                a[i+1] = temp;
            }
        }
        
    }
}