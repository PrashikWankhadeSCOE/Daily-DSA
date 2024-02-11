import java.util.*;

class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        Set<Integer> set = new HashSet<>();
        int a = 0;
        int b = 0;
        for(int i = 0;i<grid.length;i++){
            for(int j = 0;j<grid[0].length;j++){
                if(set.contains(grid[i][j])){
                    a = grid[i][j];
                }
                else{
                    set.add(grid[i][j]);
                }
            }
        }
        int len = grid.length*grid[0].length;
        for(int i = 1;i<=len;i++){
            if(!set.contains(i)){
                b = i;
            }
        }
        return new int[]{a,b};
    }
}
