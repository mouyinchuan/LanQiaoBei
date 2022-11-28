package 简单;

public class 七进制数 {
    public static void main(String[] args){
        int num = 100;
        System.out.println(convertToBase7(num));//给一个数字直接返回给定进制的字符串
    }
    public static String convertToBase7(int num) {
        return Integer.toString(num,7);

    }
}
