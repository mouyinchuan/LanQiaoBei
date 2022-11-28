package 简单;

import java.util.ArrayList;
import java.util.List;

public class 汇总区间 {
    public static void main(String[] args){
        int[] nums = {0,2,3,4,6,8,9};
        System.out.println(summaryRanges(nums));
    }
    public static List<String> summaryRanges(int[] nums) {
        List<String> list = new ArrayList<>();
        for(int i = 0; i < nums.length;i++){
            int temp = i;//i作为一个基准
            StringBuffer sb = new StringBuffer();
            while(i < nums.length-1&&nums[i]+1==nums[i+1]){
                i++;
            }
            if(i==temp){//判断i移动了没有
                sb.append(nums[i]);//没有移动的化直接添加
            }else{
                sb.append(nums[temp]);
                sb.append("->");
                sb.append(nums[i]);
            }
            list.add(sb.toString());//添加到列表里面
        }
        return list;
    }
}
