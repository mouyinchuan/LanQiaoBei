package 简单;

import java.util.Arrays;
import java.util.concurrent.locks.ReadWriteLock;

public class 反转字符串 {
    public static void main(String[] args){
        char[] s = {'H','a','n','n','a','h'};
        reverseString(s);
    }
    public static void reverseString(char[] s) {
        for(int i = 0,j = s.length-1;i < s.length/2;i++,j--){
            char temp = s[i];//交换位置
            s[i] = s[j];
            s[j] = temp;
        }
        System.out.println(Arrays.toString(s));
    }
}
