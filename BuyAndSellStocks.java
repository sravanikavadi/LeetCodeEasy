
public class BuyAndSellStocks {
    public static void main(String args[]) {
        int[] prices = new int[]{7,5,16,4,1};
        System.out.println("MaxProfit = " + BuyAndSellStocks.getMaxProfit(prices));
    }
    public static int getMaxProfit(int[] prices){
        int minPrice = Integer.MAX_VALUE;
        int maxProfit =0;
        for(int i=0; i<prices.length; i++){
            if(prices[i] < minPrice){
                minPrice = prices[i];
            }
            if(prices[i] - minPrice > maxProfit){
                maxProfit = prices[i]-minPrice;
            }
        }
        return maxProfit;
    }
}