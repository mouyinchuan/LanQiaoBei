package 简单;

import java.util.Arrays;

public class 搜索插入位置 {
    public static void main(String[] args){
        int[] nums = {1,3,5,6};
        int target = 2;
        System.out.println(searchInsert(nums,target));
    }
    public static int searchInsert(int[] nums, int target) {
        Arrays.sort(nums);//先进行排序；
        for(int i = 0;i < nums.length;i++){
            if(nums[i]==target){
                return i;
            }
            if(nums[i]>target){
                return i;
            }
        }
        return nums.length;
    }
}
