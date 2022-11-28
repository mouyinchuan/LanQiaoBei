package 简单;

public class 四的幂 {
    public static void main(String[] args){
        int n = 16;
        System.out.println(isPowerOfFour(n));
    }
    public static boolean isPowerOfFour(int n) {
        if(n < 1){//4的0次方等与1
            return false;
        }
        while(n > 1){
            if(n%4==0){
                n/=4;
            }else{
                return false;
            }
        }
        return n==1;
    }
}
