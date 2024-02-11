class Solution {
    public int maxProduct(int[] arr) {
        int maxPro = Integer.MIN_VALUE;
        for(int i = 0;i<arr.length;i++){
            int pro = arr[i];
            if(pro>maxPro)
            maxPro = pro;
            for(int j = i+1 ;j<arr.length;j++){
                pro=pro*arr[j];
                if(pro>maxPro)
                maxPro = pro;
            }
        }
        return maxPro;
    }
}