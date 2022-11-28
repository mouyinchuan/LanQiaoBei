package 简单;

import java.util.concurrent.locks.ReadWriteLock;

public class 反转字符串中的元音字母 {
    public static void main(String[] args){
        String s = "leetcode";
        System.out.println(reverseVowels(s));

    }
    public static String reverseVowels(String s) {
        char[] str = s.toCharArray();//转化为数组
        String str_1 = "AEIOUaeiou";
        int left = 0;
        int right = str.length-1;
        while(left < right){
            while(left < right){
                if(str_1.contains(str[left]+"")){//判断一个字符是否为另一个字符串的子串，str.indexOf(arr[i])!=-1;//这个就是简单的判断是否存在子串
                    break;
                }else{
                    left++;
                }
            }
            while(left < right){
                if(str_1.contains(str[right]+"")){//这个地方需要注意contians()要求的是字符串序列 简单来说就是字符串 而不是字符所以判断的时候 加上一个空字符就可解决问题
                    char temp = str[left];
                    str[left] = str[right];
                    str[right] = temp;
                    break;
                }else{
                    right--;
                }
            }
            left++;
            right--;
        }
        return String.copyValueOf(str);//数组直接转为字符串
    }
}
