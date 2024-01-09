import java.util.Arrays;

/**
 * 121. 买卖股票的最佳时机
 */
public class Code07 {
    public static void main(String[] args) {
        int[] ints = {2,4,1};
        System.out.println(maxProfit(ints));
//        System.out.println(Arrays.toString(ints));
    }
    public static int maxProfit(int[] prices) {
        int result = 0;
        int min = prices[0];
        int max = prices[0];
        for (int price : prices) {
            if (min > price) {
                min = price;
                max = price;
            }
            if (max < price) {
                max = price;
            }
            if ((max - min) > result){
                result = max - min;
            }
        }
        return result;
    }
}
