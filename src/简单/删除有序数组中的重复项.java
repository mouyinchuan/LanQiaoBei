package 简单;

import java.util.Arrays;

public class 删除有序数组中的重复项 {
    public static void main(String[] args){
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeDuplicates(nums));
    }
    public static int removeDuplicates(int[] nums) {//这题思路首先是双指针解决问题
        if(nums.length==1){
            return 1;
        }
        int count = 0;
        int temp = 0;
        for(int i = 1;i < nums.length;i++){
            if(nums[i]==nums[i-1]){
                temp++;
            }else{
                count++;
                nums[count] = nums[i];
                temp = 0;
            }
        }
        System.out.println(Arrays.toString(nums));
        return count+1;
    }
    public static int removeDuplicates_1(int[] nums) {//使用双指针的时候通常使用 while循环
        if(nums.length==1){
            return 1;
        }
        int i = 0;
        int j = 1;
        while(j < nums.length){
            if(nums[i]==nums[j]){
                j++;
            }else{
                i++;
                nums[i] = nums[j];
            }
        }
        return i+1;
    }
}
