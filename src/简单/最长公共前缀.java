package 简单;

import java.util.Arrays;

/**
 * 思路 先寻找出最短的那个字符串 然后一一比较，如果不包含的话该字符串长度减去一
 */
public class 最长公共前缀 {
    public static void main(String[] args){
        String[] strs = {"flower","flow","flight"};
        System.out.println(longestCommonPrefix(strs));
    }
    public static String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);//先进行排序  长度比较短的排在前面, 当然 也可以随便的选取一个  这样可以节省时间
        String min_str = strs[0];//找出该字符串
        for(int i = 0;i < strs.length;i++){
            if(!strs[i].startsWith(min_str)){
                min_str = min_str.substring(0,min_str.length()-1);//该串的长度减去1;
                i = 0;
            }
        }
        return min_str;
    }
}
