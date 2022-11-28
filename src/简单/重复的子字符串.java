package 简单;

public class 重复的子字符串 {
    public static void main(String[] args){
        String s = s = "abcabcabcabc";
        System.out.println(repeatedSubstringPattern(s));
    }


    /**
     * 思路：将两个最开始的字符串组合在一起，假设最开始一个字符串可以由子字符串组成，那么子字符串必有两个以上，两个最开始的字符串组合后，进行掐头去尾，则剩下的字符串必然包括最开始的字符串
     */
    public static boolean repeatedSubstringPattern(String s) {//
        String str = s+s;
        if(s.length()==1){
            return false;
        }
        if(s.length()==2&&s.charAt(0)==s.charAt(1)){
            return true;
        }
        str = str.substring(1,str.length() - 2);
        if(str.indexOf(s)==-1){
            return false;
        }
        return true;
    }
}
