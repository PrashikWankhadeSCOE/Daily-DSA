import java.util.Stack;

//! TC == O(N)
//! SC == O(N)

class Solution {
    public int [] nextSmaller(int[]heights){
        int [] arr = new int[heights.length];
        Stack<Integer> stack = new Stack<>();
        stack.push(-1);
        for(int i = heights.length-1;i>=0;i--){
            int num = heights[i];
            while(stack.peek() != -1 && heights[stack.peek()]>=num){
                stack.pop();
            }
            arr[i] = stack.peek();
            stack.push(i);
        }
        
        return arr;
    }
    public int [] prevSmaller(int[]heights){
        int [] arr = new int[heights.length];
        Stack<Integer> stack = new Stack<>();
        stack.push(-1);
        for(int i = 0;i<heights.length;i++){
            int num = heights[i];
            while(stack.peek() != -1 && heights[stack.peek()]>=num){
                stack.pop();
            }
            arr[i] = stack.peek();
            stack.push(i);
        }
        
        return arr;
    }
    public int largestRectangleArea(int[] heights) {
        int next[] = nextSmaller(heights); 
        int prev[] = prevSmaller(heights);

        int area = Integer.MIN_VALUE;
        for(int i = 0;i<heights.length;i++){
            int l = heights[i];
            if(next[i] == -1){
                next[i] = heights.length;
            }
            
            int b = next[i] - prev[i] -1;
            int newArea = l*b;
            area = Math.max(area,newArea);
        }
        return area;
    }
}

//! TLE
//! TC == O(N^2)
//! SC == O(1)

class Solution1 {
    public int largestRectangleArea(int[] heights) {
        int max = 0;

        for(int i = 0;i<heights.length;i++){
            int min = heights[i];
            for(int j = i;j<heights.length;j++){
                min = Math.min(min,heights[j]);    
                max = Math.max(max,((j-i+1)*min));  
            }   
        }
        return max;
    }
}