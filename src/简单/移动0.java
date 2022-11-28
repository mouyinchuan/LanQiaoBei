package 简单;

import java.util.Arrays;

public class 移动0 {
    public static void main(String[] args){
        int[]  nums = {0,1,0,3,12};
        moveZeroes(nums);
    }
    public static void moveZeroes(int[] nums) {//双指针解决这道题,与之前有一道题相似
        int i = 0;
        int j = 0;
        while(i < nums.length&&j < nums.length){
            if(nums[j]!=0){//思想就是将两个数进行交换。后面的数 只要不是0 就直接交换
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
                j++;
            }else{
                j++;
            }
        }
        System.out.println(Arrays.toString(nums));
    }
}
