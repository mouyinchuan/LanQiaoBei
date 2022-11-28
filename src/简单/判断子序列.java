package 简单;

public class 判断子序列 {
    public static void main(String[] args){
        String s = "abc", t = "ahbgdc";
        System.out.println(isSubsequence_1(s,t));
    }
    public static boolean isSubsequence(String s, String t) {//还是用双指针解决问题
        int i = 0;
        int j = 0;
        while(i < s.length()&&j < t.length()){
            if(s.charAt(i)==t.charAt(j)){
                i++;
                j++;
            }else{
                j++;
            }
        }
        return i==s.length();
    }
    public static boolean isSubsequence_1(String s, String t) {//使用 indexOf从指定的位置开始进行查找
        int index = -1;
        for(char c: s.toCharArray()){
            index = t.indexOf(c,index+1);//设定初值为-1 与index+1 有巧妙的联系,没有找到的话返回-1，从指定的索引位置处开始查找
            if(index==-1){
                return false;
            }
        }
        return true;
    }
}
