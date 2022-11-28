package 简单;

public class 字符串中的单词数 {
    public static void main(String[] args){
        String s = "Hello, my name  is John";
        System.out.println(countSegments(s));
    }
    public static int countSegments(String s) {//还可以直接用split()函数将其变为一个数组，统计里面不是空格的个数
        s.trim();//首先去除首尾的空白
        s+=' ';//往最后添加一个空白
        int count = 0;
        System.out.println(s);
        for(int i = 0; i < s.length()-1;i++){
            if(s.charAt(i)!=' '&&s.charAt(i+1)==' '){
                count++;
            }
        }
        return count;
    }
}
