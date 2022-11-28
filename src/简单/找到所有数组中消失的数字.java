package 简单;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class 找到所有数组中消失的数字 {
    public static void main(String[] args){
        int[] nums = {5,4,6,7,9,3,10,9,5,6};
        System.out.println(findDisappearedNumbers_1(nums));
    }
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> list = new ArrayList<>();//这个是一种思路但是有一点小瑕疵
        String str = "";
        for(int i = 0;i < nums.length;i++){
            str = str+nums[i]+",";
        }
        System.out.println(str);
        for(int i = 0;i < nums.length;i++){
            if(!str.contains(((i+1)+""))){//注意要形成一个字符串
                list.add(i+1);
            }
        }
        return list;
    }
    public static List<Integer> findDisappearedNumbers_1(int[] nums) {//借用集合的去重特性,我很牛B
        List<Integer> list = new ArrayList<>();
        Set<Integer> set  = new HashSet<>();
        for(int n: nums){//去重
            set.add(n);
        }
        for(int i = 1;i <= nums.length;i++){
            if(set.add(i)){//添加成功 就说明里面不含有该数字,添加成功返回true
                list.add(i);
            }
        }
        return list;
    }
}
