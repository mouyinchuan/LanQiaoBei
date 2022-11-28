package 简单;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class 存在重复元素 {
    public static void main(String[] args){
        int[] nums = {3,1};
        System.out.println(containsDuplicate_1(nums));
    }
    public static boolean containsDuplicate(int[] nums) {
        if(nums.length==1){
            return false;
        }
        Arrays.sort(nums);
        for(int i = 0;i < nums.length;i++){
            if(i==0){//特别注意一下最开始的元素 ，防止越界
                if(nums[i]==nums[i+1]){
                    return true;
                }else{
                    continue;
                }
            }
            if(i==nums.length-1){//防止越界
                if(nums[i]==nums[i-1]){
                    return true;
                }else{
                    break;
                }
            }
            if(nums[i]==nums[i-1]||nums[i]==nums[i+1]){
                return true;
            }
        }
        return false;
    }
    public static boolean containsDuplicate_1(int[] nums) {//使用set集合自动将重复元素去除的特性 当添加时遇到重复元素 会添加不进去同时返回一个false
        Set<Integer> set = new HashSet<>();//创建一个set集合,添加元素成功时返回一个true
        for(int num:nums){
            if(!set.add(num)){
                return true;
            }
        }
        return false;

    }
}
