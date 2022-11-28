package 简单;

public class 三的幂 {
    public static void main(String[] args){
        int n = 27;
        System.out.println(isPowerOfThree(n));
    }
    public static boolean isPowerOfThree(int n) {
        if(n < 1){//3的0次幂等于1
            return false;
        }
        while(n > 1){
            if(n%3==0){
                n/=3;
            }else{
                return false;
            }
        }
        return n==1;//如果是3的幂的话 最后欧一定会经过3/3这个阶段的,所以说直接在这里设卡
    }
}
