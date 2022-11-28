package 简单.ok;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class num7 {
    public static void main(String[] args){//这题直接利用set的去除重复值进行计算
        int  n = 6;
        String[] str = {"we","we","are","famliy","ha","ha"};
        List<String> list = new ArrayList<>();
        Set<String> set = new HashSet<>();
        for(int i = 0;i < str.length;i++){
            if(set.add(str[i])){
                list.add(str[i]);//集合添加成功，那么列表也就能添加成功，区别就是集合是无序的，列表是有序的
            }
        }
        System.out.println(list);


    }
}