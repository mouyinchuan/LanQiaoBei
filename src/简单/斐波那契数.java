package 简单;

public class 斐波那契数 {
    public static void main(String[] args){
        int n = 4;
        System.out.println(fib(n));
    }
    public static int fib(int n) {
        if(n==0||n==1){
            return n;
        }
        return fib(n-1)+fib(n-2);
    }
}
