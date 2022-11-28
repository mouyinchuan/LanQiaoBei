package 简单;

import java.util.HashSet;
import java.util.Set;

public class 两个数组的交集 {
    public static void main(String[] args){
        int[] nums1 = {4,9,5};
        int[] nums2 = {9,4,9,8,4};
    }
    public static int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();//
        for(int i = 0;i < nums1.length;i++){
            for(int j = 0;j < nums2.length;j++){
                if(nums1[i]==nums2[j]){
                    set.add(nums1[i]);//set集合有自动去重的功能，不用担心
                }
            }
        }
        //将set集合转化为数组 看我的骚操作
        Integer[] num = set.toArray(new Integer[set.size()]);//这个地方必须要处理为引用类型的数组,这个地方不能直接转化为 int 类型的
        int[] ans = new int[set.size()];
        for(int k = 0;k < num.length;k++){
            ans[k] = num[k];//进行自动拆包
        }
        return ans;
    }
}
