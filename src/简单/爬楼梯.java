package 简单;

public class 爬楼梯 {
    public static void main(String[] args){
        int n = 3;
        System.out.println(climbStairs_2(n));
    }
    public static int climbStairs(int n) {//如果根据结果进行分析的话，可以发现结果是符合斐波那契数列的，所以说面对这种题的时候，要分析数学规律
        if(n==1){//这个解法效率不太高
            return 1;
        }
        if(n==2){
            return 2;
        }
        return climbStairs(n-1)+climbStairs(n-2);
    }
    public static int climbStairs_1(int n) {//斐波那契数列解法
        if(n==1||n==2){
            return n;
        }
         int a = 1;
         int b = 2;
         int c = 0;
         for(int i = 3;i <= n;i++){
             c = a+b;
             a = b;
             b = c;
         }
         return c;
    }
    public static int climbStairs_2(int n) {//数组解法
        if(n <= 2){
            return n;
        }
        int[] count = new int[n+1];//第一个空位不存储数据
        count[1] = 1;
        count[2] = 2;
        for(int i = 3;i <= n;i++){
            count[i] = count[i-1]+count[i-2];
        }
        return count[n];
    }
}
