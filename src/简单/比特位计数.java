package 简单;

import java.util.Arrays;

public class 比特位计数 {
    public static void main(String[] args){
        int n = 5;
        System.out.println(Arrays.toString(countBits(n)));
    }
    public static int[] countBits(int n) {
        int[] count = new int[n+1];
        for(int i = 0;i <= n;i++){
            count[i] = Integer.bitCount(i);
        }
        return count;
    }
}
