


class pair  {  
    long first, second;  
    public pair(long first, long second)  
    {  
        this.first = first;  
        this.second = second;  
    }  
}

//! TC == O(N)
//! SC == O(1)

class Solution {
    
    public pair indexes(long arr[], long x)
    {
        int a = -1;
        int b = -1;
        int start = 0;
        int end = arr.length;
        
        while(start<end){
            int mid = start+(end-start)/2;
            if(arr[mid] == x){
                a = mid;
                b = mid;
                while(a>=0 && arr[a]==x){
                    a--;
                }
                a = a+1;
                
                while(b<arr.length && arr[b]==x){
                    b++;
                }
                b = b-1;
                break;
            }
            else if(arr[mid]>x){
                end = mid;
            }
            else if(arr[mid]<x){
                start = mid+1;
            }
        }
        return new pair(a,b);
    }
}