package 简单;

public class 丑数 {
    public static void main(String[] args){
        int n = 6;
        System.out.println(isUgly(n));
    }
    public static boolean isUgly(int n) {
        if(n < 0){//1本身就是丑数
            return false;
        }
        //对于丑数 就是只含有质因数 2 3 5 的数字，其他不能含有
        //方法 直接进行除操作  先除去5 除去3 除去2 之后 判断剩下的数是否为1；为1 就是丑数 否则不是
        while(n%5==0){
            n/=5;
        }
        while(n%3==0){
            n/=3;
        }
        while(n%2==0){
            n/=2;
        }
        return n==1;
    }
}
