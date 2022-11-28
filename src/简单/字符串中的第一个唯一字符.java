package 简单;

public class 字符串中的第一个唯一字符 {
    public static void main(String[] args){
        String s = "loveleetcode";
        System.out.println(firstUniqChar(s));
    }
    public static int firstUniqChar(String s) {
        for(int i = 0;i < s.length();i++){
            if(s.indexOf(s.charAt(i))==s.lastIndexOf(s.charAt(i))){//直接调用Api  哈哈哈
                return i;
            }
        }
        return -1;
    }
}
