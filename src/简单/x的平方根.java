package 简单;

public class x的平方根 {
    public static void main(String[] args){
        int x = 8;
        System.out.println(mySqrt(x));
    }
    public static int mySqrt(int x) {//二分法进行查找，典型的二分查找。
        if(x==1){
            return 1;
        }
        int right = x;
        int left = 0;
        int mid = 0;
        while(right-left>1){
            mid = (right+left)/2;
            if(x/mid==mid){
                return mid;
            }
            if(x/mid<mid){//就是说数找大了
                right = mid;
            }else{
                left = mid;
            }
        }
        return left;//就是说left永远是比较小的，而题目上面找的就是比较小的
    }
}
