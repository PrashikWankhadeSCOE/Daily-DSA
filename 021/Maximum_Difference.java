

class Solution
{
    int findMaxDiff(int a[], int n)
    {
	// Your code here	
	    int []ls = new int[n];
	    int []rs = new int[n];
	    for(int i = n-1;i>=0;i--){
	        for(int j = i-1;j>=0;j--){
	            if(a[i]>a[j]){
	                ls[i] = a[j];
	                break;
	            }
	        }
	    }
	    for(int i = 0;i<n;i++){
	        for(int j = i+1;j<n;j++){
	            if(a[i]>a[j]){
	                rs[i] = a[j];
	                break;
	            }
	        }
	    }
	    int max = -1;
	    for(int i=0;i<n;i++){
	        if(max<Math.abs(ls[i]-rs[i])){
	            max = Math.abs(ls[i]-rs[i]);
	        }
	    }
	    return max;
    }
}