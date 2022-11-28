package 简单;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 第三大的数 {
    public static void main(String[] args){
        int[] nums = {3,3,4,3,4,3,0,3,3};
        System.out.println(thirdMax(nums));
    }
    public static int thirdMax(int[] nums) {//有一个特别叼的思路就是找三次 每次都找最大的 完美
        Arrays.sort(nums);
        //先去重
        List<Integer> list = new ArrayList<>();
        list.add(nums[nums.length-1]);
        for(int i = nums.length-2;i >= 0;i--){
            if(nums[i]!=nums[i+1]){
                list.add(nums[i]);
            }
        }
        if(list.size()<3){
            return nums[nums.length-1];
        }else{
            return list.get(2);//list 是从前往后堆的 就像排队一样
        }
    }
}
