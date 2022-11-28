package 简单;

import java.util.Arrays;

public class 有效的字母异位词 {
    public static void main(String[] args){
        String s = "anagram";
        String t = "nagaram";
        System.out.println(isAnagram_1(s,t));
    }
    public static boolean isAnagram(String s, String t) {
        char[] str_1 = s.toCharArray();
        char[] str_2 = t.toCharArray();
        Arrays.sort(str_1);
        Arrays.sort(str_2);
        return Arrays.equals(str_1,str_2);//不可以写成str_1.equals(str_2);这个结果出来是错误的
    }
    public static boolean isAnagram_1(String s, String t){
        if(s.length()!=t.length()){
            return false;
        }
        int[] count_1 = new int[26];
        int[] count_2 = new int[26];
        for(int i = 0;i < s.length();i++){
            count_1[s.charAt(i)-'a']++;
            count_2[t.charAt(i)-'a']++;
        }
        Arrays.sort(count_1);
        Arrays.sort(count_2);
        return Arrays.equals(count_1,count_2);
    }
}
