

//! TLE
//! TC == O(N^2)
//! SC == O(1)

class Solution {
    public int numPairsDivisibleBy60(int[] time) {
        int count = 0;
        for(int i = 0;i<time.length;i++){
            for(int j = i+1;j<time.length;j++){
                if((time[i]+time[j])%60 == 0){
                    count++;
                }
            }
        }
        return count;
    }
}

//! TC == O(N)
//! SC == O(1)

class Solution1 {
    public int numPairsDivisibleBy60(int[] time) {
        int []rem = new int[60];
        int count = 0;
        for(int i : time){
            i%=60;
            int y = (60-i)%60;
            count += rem[y];
            ++rem[i];
        }
        return count;
    }
}
