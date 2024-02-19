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