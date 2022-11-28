package 简单;

/**
 * 解题思路； 最大收益 要么就是前一天为最大收益  要么今天运气好，今天恰是最好收益那一天 就用今天的价格减去之前最低的价格就是了
 */
public class 买卖股票的最佳时机 {
    public static void main(String[] args){
        int[] prices = {7,1,5,3,6,4};
        System.out.println(maxProfit(prices));
    }
    public static int maxProfit(int[] prices) {//获取最大利益
        int min = prices[0];//因为要寻找最小的数值 所以将第一号元素设为最小的；
        int max = 0;
        for(int i = 1;i < prices.length;i++){
            max = Math.max(max,prices[i]-min);//获得最大就是 要么前一天获利最大，要么就是今天恰好，使我获利最大
            min = Math.min(min,prices[i]);//寻找到最小的数值 要么是之前最小 ，要么是今天恰好最小
        }
        return max;
    }
}
