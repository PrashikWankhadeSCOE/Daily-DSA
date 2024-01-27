
class Solution {
    public int[] plusOne(int[] digits) {
        String str = "";
        int len = digits.length;
        int rem = 1;
        while(len>0){
            int sum = digits[len-1]+rem;
            if(sum>9){
                rem = 1;
            }else{
                rem = 0;
            }
            str = String.valueOf(sum%10)+str;
            len--;
        }
        if(rem == 1){
            str = String.valueOf(rem)+str;
        }
        int arr[] = new int[str.length()];
        for(int i = 0;i<arr.length;i++){
            arr[i] = (int)(str.charAt(i)-'0');
        }
        return arr;
    }
}