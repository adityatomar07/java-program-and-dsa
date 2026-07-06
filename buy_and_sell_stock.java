package Arrays;

public class buy_and_sell_stock {
    public static int buyAndshellprices(int prices[]) {
        int buyprices = Integer.MAX_VALUE;
        int maxprofit = 0;
        for (int i = 0; i < prices.length; i++) {
            if (buyprices < prices[i]) {
                // profit
                int profit = prices[i] - buyprices;
                // today's profit
                maxprofit = Math.max(maxprofit, profit);

            } else {
                buyprices = prices[i];
            }
        }
        return maxprofit;

    }

    public static void main(String[] args) {
        int prices[] = { 7, 1, 5, 3, 6, 4 };
        System.out.println("Result : " + buyAndshellprices(prices));
    }
}
