package 简单;

public class 找不同 {
    public static void main(String[] args){
        String s = "abcd", t = "abcde";
        System.out.println(findTheDifference_2(s,t));
    }
    public static char findTheDifference(String s, String t) {//这个解法只适用于不重复的字符串
        for(int i = 0;i < t.length();i++){
            if(!s.contains(t.charAt(i)+"")){
                return t.charAt(i);
            }
        }
        return 'o';
    }
    public static char findTheDifference_1(String s, String t){//使用异或运算解体 因为两个字符串里面只有一个是单独的字母其他的全是成对出现的，所以用异或运算
        int ans = 0;//异或运算 是使用数字进行运算的所以用数字
        for(char c : s.toCharArray()){
            ans^=c;
        }
        for(char c : t.toCharArray()){
            ans^=c;
        }
        return (char)ans;//将数字转化为字符
    }
    public static char findTheDifference_2(String s, String t){//还是老方法采用字符统计的办法
        int[] count_1 = new int[26];
        int[] count_2 = new int[26];
        for(int i = 0;i < s.length();i++){
            count_1[s.charAt(i)-'a']++;
        }
        for(int j = 0;j < t.length();j++){
            count_2[t.charAt(j)-'a']++;
        }
        for(int k = 0;k < 26;k++){
            if(count_2[k]>count_1[k]){
                return (char)(k+'a');//数字加上字母 然后在使用（char)就可变为字母了
            }
        }
        return 'a';
    }
}
