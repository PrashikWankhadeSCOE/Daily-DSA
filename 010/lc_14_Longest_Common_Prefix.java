
//? TC == O(N^2)
//? SC == O(N)

class Solution {
    public String longestCommonPrefix(String[] strs) {
        String str = strs[0];
        for(int i = 1;i<strs.length;i++){
            String ret = "";
            
            int a = 0;
            int b = 0;
            int len1 = str.length();
            int len2 = strs[i].length();

            while(a<len1 && b <len2){
                if(str.charAt(a)==strs[i].charAt(b)){
                    ret += str.charAt(a);
                    a++;
                    b++;
                }
                else{
                    break;
                }
            }
            str = ret;
        }
        return str;
    }
}