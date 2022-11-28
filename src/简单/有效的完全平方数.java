package 简单;

public class 有效的完全平方数 {
    public static void main(String[] args){
        int num = 16;
        System.out.println(isPerfectSquare(num));
    }
    public static boolean isPerfectSquare(int num) {//使用二分查找破解谜题,思路挺好的。
        long right = num;
        long left = 1;
        while(right>=left){
            long mid = (left + right) / 2;
            if(mid*mid > num){
                right = mid -1;
            }else if(mid*mid < num){
                left = mid + 1;
            }else{
                return true;
            }
        }
        return false;
    }
}
