package 简单;

public class 验证回文字符串 {
    public static void main(String[] args){
        String s = "0P";
        System.out.println(isPalindrome_1(s));
    }
    public static boolean isPalindrome(String s) {//这个题的思路用的是Character
        s = s.toLowerCase();//将其转化为小写字符串；
        String str = "";
        for(int i = 0;i < s.length();i++){
            if(Character.isLetter(s.charAt(i))||Character.isDigit(s.charAt(i))){
                str = str+s.charAt(i);//去除不该有的字符；
            }
        }
        System.out.println(str);
        for(int j = 0,k = str.length()-1;j < str.length()/2;j++,k--){//个人认为这是验证回文字符串的最好的写法
            if(str.charAt(j)!=str.charAt(k)){
                return false;
            }
        }
        return true;
    }
    public static boolean isPalindrome_1(String s) {//这题用StringBuilder做 使用里面的reverse 和 toString equals
        s = s.toLowerCase();
        StringBuilder sb = new StringBuilder(s.length());
        for( char c: s.toCharArray()){
            if('0'<=c&&c<='9'||'a'<=c&&c<='z'){
                sb.append(c);//往里面添加一个元素
            }
        }
        return sb.toString().equals(sb.reverse().toString());//将其反转过后看看里面的内容想不想等
    }
}
