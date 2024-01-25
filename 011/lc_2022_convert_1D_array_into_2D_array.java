class Solution {
    public int[][] construct2DArray(int[] original, int m, int n) {
        int arr [][] = new int[m][n];
        if(m*n != original.length){
            return new int[0][0];
        }
        int x = 0;
        for(int i = 0;i<m;i++){
            for(int j = 0;j<n;j++){
                arr[i][j] = original[x++];
            }
        }
        return arr;
    }
}