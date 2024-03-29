//!  TLE 
//! TC == O(N^2)
//! SC == O(1)

class Solution {
    public int maxArea(int[] height) {
        
        int area = 0;
        for(int i = 0;i<height.length;i++){
            for(int j = 0;j<height.length;j++){
                
                int width = j-i;
                int h = Math.min(height[i],height[j]);
                if(area < width*h){
                    area = width*h;
                }
            }
        }
        return area;
    }
}

//! TC == O(N)
//! SC == O(1)

class Solution1 {
    public int maxArea(int[] height) {
        int s = 0;
        int e = height.length-1;
        int max = 0;
        while(s<e){
            
            int se = height[s];
            int ee = height[e];
            int area = Math.min(se,ee)*(e-s);
            
            if(max<area){
                max = area;
            }
            if(se<ee){
                s++;
            }
            else{
                e--;
            }
            
        }
        return max;
    }
}