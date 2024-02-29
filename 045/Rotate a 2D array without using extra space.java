
class Solution {
    void rotateMatrix(int arr[][], int n) {
        // code here
        for(int i = 0;i<n;i++){
            int s = 0;
            int e = n-1;
            while(s<e){
                int temp = arr[i][s];
                arr[i][s] = arr[i][e];
                arr[i][e] = temp;
                s++;
                e--;
            }
        }
        
        for(int i = 0;i<n;i++){
            for(int j = i+1;j<n;j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
    }
}