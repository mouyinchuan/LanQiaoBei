package 简单;

import java.util.Arrays;

public class 下一个更大元素I {
    public static void main(String[] args){
        int[] nums1 = {4,1,2};
        int[] nums2 = {1,3,4,2};
        System.out.println(Arrays.toString(nextGreaterElement(nums1,nums2)));
    }
    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] ans = new int[nums1.length];
        for(int i = 0;i < nums1.length;i++){
            for(int j = 0;j < nums2.length;j++){
                if(nums1[i]==nums2[j]) {
                    if(j==nums2.length-1){
                        ans[i] = -1;
                        break;//break只能跳出当前循环，若需要跳出多层循环的话则需要打上标签
                    }
                    while(j < nums2.length){
                        j++;
                        if(nums2[j]>nums1[i]){
                            ans[i] = nums2[j];
                            break;
                        }
                        if(j==nums2.length-1){
                            ans[i] = -1;
                            break;
                        }
                    }
                }
            }
        }
        return ans;
    }
}
