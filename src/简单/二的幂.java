package 简单;

public class 二的幂 {
    public static void main(String[] args){
        int n = 16;
    }
    public static boolean isPowerOfTwo(int n) {//使用反复除的方法解决
       while( n > 2){
           if(n%2==0){
               n/=2;
           }else{
               return false;
           }
       }
       return n==1;//如果余数为1的话 那就是2 因为2/2 = 1; 不等于1的话就不是二的幂
    }
    public static boolean isPowerOfTwo_1(int n) {//使用递归的方法解决,其实思路是一样的
        if(n == 1){
            return true;
        }if(n == 0){
            return false;
        }
        if(n%2!=0){
            return false;
        }
        return isPowerOfTwo(n/2);
    }
}
