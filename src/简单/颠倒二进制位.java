package 简单;

public class 颠倒二进制位 {
    public static void main(String[] args){
        int n = 11111111;
        System.out.println(reverseBits(n));
    }
    public static int reverseBits(int n) {//这道题直接调用api就可以，Integer 里面有一个reverse() 就是将原来的二进制补码前后调换顺序，然后返回对应的十进制数据
        return Integer.reverse(n);//传入的是一个以二进制表示的整数 即  0101010101010 这一种形式

    }
}
