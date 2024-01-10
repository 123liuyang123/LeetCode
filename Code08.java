/**
 * 122. 买卖股票的最佳时机 II
 */
public class Code08 {
    public static void main(String[] args) {
        int[] ints = {1,2,3,4,5};
        System.out.println(maxProfit(ints));
    }
    public static int maxProfit(int[] prices) {
        int result = 0;
        if (prices.length < 2){
            return result;
        }
        int first = 0;
        int second = 0;
        for (int i = 1; i < prices.length; i++) {
            first = prices[i-1];
            second = prices[i];
            if (first < second){
                result += second-first;
            }
        }

        return result;
    }
}
