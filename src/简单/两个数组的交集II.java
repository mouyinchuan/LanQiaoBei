package 简单;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 两个数组的交集II {
    public static void main(String[] args){
        int[] nums1 = {4,9,5};
        int[] nums2 = {9,4,9,8,4};
        System.out.println(Arrays.toString(intersect(nums1,nums2)));
    }
    public static int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        List<Integer> list = new ArrayList<>();
        int i = 0;
        int j = 0;
        while(i < nums1.length&&j < nums2.length){
            if(nums1[i]==nums2[j]){
                list.add(nums1[i]);
                i++;
                j++;
            }else if(nums1[i] < nums2[j]){
                i++;
            }else  if(nums1[i] > nums2[j]){
                j++;
            }
        }
        Integer[] ans = list.toArray(new Integer[list.size()]);
        int[] res = new int[ans.length];//这个地方可以改为 ans[i] = list.get(i)//直接获得里面的数字 大意了
        for(int k = 0; k < ans.length;k++){
            res[k] = ans[k];
        }
        return res;
    }
}
