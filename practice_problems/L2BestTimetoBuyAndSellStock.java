package practice_problems;

public class L2BestTimetoBuyAndSellStock {
    public static int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for(int price : prices) {
            if(price < minPrice) {
                minPrice = price;

            } else if (price - minPrice > maxProfit) {
                maxProfit = price - minPrice;
            }


        }
        return maxProfit;
    }

    static void main(String[] args) {
        int[] prices1 = {7, 6, 9 , 10 ,12 ,13};
        System.out.println(maxProfit(prices1));

        int[] prices2 = {13, 13, 9, 10, 7};
        System.out.println(maxProfit(prices2));

    }


}
