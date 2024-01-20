import java.util.ArrayList;
import java.util.Collections;

class Solution
{
    public long findMinDiff (ArrayList<Integer> a, int n, int m)
    {
        // your code here
        
        long x = Integer.MAX_VALUE;
        Collections.sort(a); 
        if(n == m) 
        {
         return a.get(n-1) - a.get(0);   
        }
        for(int i =0;i<=n-m;i++)
        {
            x = Math.min(x, a.get(m+i-1)-a.get(i));
        }
        return x;
    }
}