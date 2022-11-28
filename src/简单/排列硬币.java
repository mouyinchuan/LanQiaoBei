package 简单;

public class 排列硬币 {
    public static void main(String[] args){
        int n = 1;
        System.out.println(arrangeCoins(n));
    }
    public static int arrangeCoins(int n) {//使用二分法解决问题,就是使用二分法查找，满足等式就可以，超出时间限制了，换一种方式
        int left = 0;
        int right = n;
        int ans = 0;
        while(left<=right){
            int mid = (left+right)/2;
            if(mid*(mid+1)/2<=n){
                ans = mid;
                left = mid+1;
            }else{
                right = mid-1;
            }
        }
        return ans;
    }
    public static int arrangeCoins_1(int n) {
        int i = 0;
        int sum = 0;//这个地方建议使用long  因为狗B测试用例 会很大。
        if(n==1){
            return 1;
        }
        for(i = 1;i < n;i++){
            sum+=i;
            if(sum > n){
                break;
            }
        }
        return i-1;
    }
}
