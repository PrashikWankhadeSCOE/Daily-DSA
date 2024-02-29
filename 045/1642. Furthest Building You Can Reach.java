import java.util.*;

class Solution {
    public int furthestBuilding(int[] heights, int bricks, int ladders) {
        int i = 0;
        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
        for( i = 0;i<heights.length-1;i++){
            if(heights[i]>=heights[i+1])
                continue;
            int heightGap = heights[i+1]-heights[i];
            if(heightGap<=bricks){
                bricks -= heightGap;
                queue.add(heightGap);
            }
            else if(ladders>0){
                if(!queue.isEmpty()){
                    int max = queue.peek();
                    if(max>heightGap){
                        bricks += max;
                        queue.poll();
                        queue.add(heightGap);
                        bricks -= heightGap;
                    }

                }
                ladders--;
            }
            else{
                break;
            }
        }
        return i;
    }
}