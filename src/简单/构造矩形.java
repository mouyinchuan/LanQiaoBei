package 简单;

import java.util.Arrays;

public class 构造矩形 {
    public static void main(String[] args){
        int area = 37;
        System.out.println(Arrays.toString(constructRectangle_1(area)));
    }
    public static int[] constructRectangle(int area) {//思路不错但是超出时间限制了
        int temp = 100000000;
        int[] ans = {temp,0};
        for(int length = 1;length <= area;length++){
            for(int wide = 1;wide <= area;wide++){
                if(length>=wide&&length*wide==area){
                    if(length-wide<temp){
                        temp = length-wide;
                        ans[0] = length;
                        ans[1] = wide;
                    }
               }
            }
        }
        return ans;
    }
    public static int[] constructRectangle_1(int area) {
        int wide = (int)Math.sqrt(area);
        while(area%wide!=0){//因为上面计算wide时候进行四舍五入了，可能导致结果不准，所以，判断一下计算出来的是否为整数
            wide--;
        }
        return new int[]{area/wide,wide};//这个返回方法在第一道题中有体现
    }
    public static int[] constructRectangle_2(int area) {//这个方法相比于第一个方法复杂度小一些
        int min = 99999999;
        int temp = 0;
        int wide = 0;
        int[] ans = new int[2];
        for(int length = 1;length<=area;length++){
            if(area%length==0){
                wide = area/length;
                if(wide<=length&&length-temp<min){
                    ans[0] = length;
                    ans[1] = wide;
                    min = temp;
                }
            }
        }
        return ans;
    }
}
