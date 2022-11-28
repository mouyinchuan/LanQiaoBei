package 简单;

import java.util.HashSet;
import java.util.Set;

public class 存在重复元素II {
    public static void main(String[] args){
        int[] nums = {1,2,3,1,1,2,3};
        int k = 0;
        System.out.println(containsNearbyDuplicate(nums,k));
    }
    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        Set<Integer> set = new HashSet<>();
        for(int i = 0;i < nums.length;i++){//这个是不成立的 有一些小bug，推荐下面吊炸天的算法
            if(!set.add(nums[i])){
                for(int j = 0;j < nums.length;j++){
                    if(nums[j]==nums[i]&&i-j<=k&&i!=j){
                        return true;
                    }
                }
            }
        }
        return false;
    }
    public static boolean containsNearbyDuplicate_1(int[] nums, int k){
        for(int i =0;i < nums.length;i++){
            for(int j = i+1;j <= i+k&&j < nums.length;j++){//里面的判断条件就写得很精彩
                if(nums[i]==nums[j]){
                    return true;
                }
            }
        }
        return false;
    }
}
