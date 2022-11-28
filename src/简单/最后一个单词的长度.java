package 简单;

public class 最后一个单词的长度 {
    public static void main(String[] args){
        String s = "   fly me   to   the moon  ";
        System.out.println(lengthOfLastWord_1(s));
    }
    public static int lengthOfLastWord(String s) {
        int length = 0;
        for(int i = s.length()-1;i >= 0;i--){
            if(Character.isLetter(s.charAt(i))){
                length++;
            }
            if(length!=0&&!Character.isLetter(s.charAt(i))){
                return length;
            }
        }
        return length;
    }
    public static int lengthOfLastWord_1(String s){//思路2直接去除前后的空白
        s = s.trim();//去除前后的空白
        int length = 0;
        for(int i = s.length()-1;i >= 0;i--){
            if(s.charAt(i)==' '){
                break;
            }else{
                length++;
            }
        }
        return length;
    }
}
