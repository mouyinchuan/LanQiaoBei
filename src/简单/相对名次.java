package 简单;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;


public class 相对名次 {
    public static void main(String[] args){
        int[] score = {5,4,3,2,1};
        System.out.println(Arrays.toString(findRelativeRanks_1(score)));
    }
    public static String[] findRelativeRanks(int[] score) {//这个算法只针对与大于或等于三位参赛选手
        int[] score_1 = new int[score.length];
        String[] result = new String[score.length];//用来存储结果
        for(int i = 0;i < score.length;i++){
            score_1[i] =score[i];//生成另外一个数组方便进行排序
        }
        Arrays.sort(score_1);//排序是是进行从下到大排序的
        int num_1 = score_1[score_1.length-1];
        int num_2 = score_1[score_1.length-2];
        int num_3 = score_1[score_1.length-3];
        for(int i = 0;i < score.length;i++){
            if(score[i]==num_1){
                result[i] = "Gold Medal";
            }else if(score[i]==num_2){
                result[i] = "Silver Medal";
            }else if(score[i]==num_3){
                result[i] = "Bronze Medal";
            }else{
                for(int j = 0;j < score_1.length;j++){
                    if(score[i] == score_1[j]){
                        result[i] = (score_1.length-j)+"";
                    }
                }
            }
        }
        return result;
    }
    public static String[] findRelativeRanks_1(int[] score) {//用HashMap解决问题
        int[] nums = new int[score.length];
        for(int i = 0;i < score.length;i++){
            nums[i] = score[i];
        }
        Arrays.sort(nums);
        Map<Integer,Integer> map = new HashMap<>();
        for(int j = 0;j < score.length;j++){
            map.put(nums[j],nums.length-j);//其实这里是建立起一个联系；
        }
        String[] result = new String[nums.length];//用来存储答案
        for(int k = 0;k < score.length;k++){
            int temp = map.get(score[k]);//获得值
            if(temp==1){
                result[k] = "Gold Medal";
            }else if(temp==2){
                result[k] = "Silver Medal";
            }else if(temp==3){
                result[k] = "Bronze Medal";
            }else{
                result[k] = String.valueOf(temp);
            }
        }
        return result;
    }
}
