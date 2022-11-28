package 简单;

public class 汉明距离 {
    public static void main(String[] args){
        int x = 1;
        int y = 4;
        System.out.println(hammingDistance(x,y));
    }
    public static int hammingDistance(int x, int y) {//介绍一下异或运算，异或运算是将数字转化成为二进制进行计算，相同的记为0不同的记为1，得到的二进制数就是相应的数字
        return Integer.bitCount(x^y);//直接就是统计二进制中1的个数
    }

}
