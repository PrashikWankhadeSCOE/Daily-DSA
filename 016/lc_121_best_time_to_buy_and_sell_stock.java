
class Solution {
    public int maxProfit(int[] prices) {
        int maxPro = 0;
        int cheaper = Integer.MAX_VALUE;
        for(int i = 0;i<prices.length;i++){
            if(cheaper>prices[i]){
                cheaper = prices[i];
            }
            else if(prices[i]-cheaper>maxPro){
                maxPro = prices[i]-cheaper;
            }
        }
        return maxPro;
    }
}