package 简单;

public class 位1的个数 {
    public static void main(String[] args){
        int n = 1011;
        System.out.println(hammingWeight_1(n));
    }
    public static int hammingWeight(int n) {
        return Integer.bitCount(n);//函数功能统计二进制表示的 1 的个数；
    }
    public static int hammingWeight_1(int n){//采用直接的形式 统计个数
        String s = String.valueOf(n);//将其转化为字符串
        int count = 0;
        for(int i = 0;i < s.length();i++){
            if(s.charAt(i)=='1'){
                count++;
            }
        }
        return count;
    }
}
