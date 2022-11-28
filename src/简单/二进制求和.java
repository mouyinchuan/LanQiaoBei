package 简单;

import java.math.BigInteger;//注意要进行导包
public class 二进制求和 {
    public static void main(String[] args){
        String a = "1010";
        String b = "1011";
        System.out.println(addBinary(a,b));
    }
    public static String addBinary(String a, String b) {//这个方法适用于数字比较小的

        int num1 = Integer.parseInt(a,2);//后面的参数是根据给定的字符串确定的，想要由二进制转化为十进制 参数就为2
        System.out.println(num1);
        int num2 = Integer.parseInt(b,2);
        System.out.println(num2);
        int num3 = num1+num2;
        return Integer.toBinaryString(num3);
    }
    public static String addBinary_1(String a, String b){
        BigInteger num1 = new BigInteger(a,2);//将二进制的字符串转化为十进制的数字
        BigInteger num2 = new BigInteger(b,2);
        return num1.add(num2).toString(2);//大数的加减都与平常的不一样，加用的是add,后面的toString()表示的是转化为2进制字符串输出
    }
}
