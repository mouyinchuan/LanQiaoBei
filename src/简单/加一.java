package 简单;

import java.util.Arrays;

public class 加一 {
    public static void main(String[] args){
        int[] digits = {8,9,9,9};
        System.out.println(Arrays.toString(plusOne(digits)));
    }
    public static int[] plusOne(int[] digits) {
        if(digits[digits.length - 1]!=9){
            digits[digits.length-1]++;
            return digits;
        }
        for(int i = digits.length-1;i >= 0;i--){//胆子放大一点，遇到九就变为0，最后判断第一位数为0不为0，为0就直接开辟一个数组，第一位置为0；
            if(digits[i]==9){
                digits[i] = 0;
            }else{
                digits[i]++;
                return digits;
            }
        }
        if(digits[0]==0){
            int[] num = new int[digits.length+1];
            num[0] = 1;
            return num;
        }

        return digits;
    }
}
