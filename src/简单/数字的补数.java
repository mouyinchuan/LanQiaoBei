package 简单;

public class 数字的补数 {
    public static void main(String[] args){
        int num = 5;


    }
    public static int findComplement(int num) {
        String str = Integer.toBinaryString(num);//将数字转化为二进制数
        String s = "";
        for(int i = 0;i < str.length();i++){
            if (str.charAt(i) == '0') {
                s += "1";
            }else{
                s += "0";
            }
        }
        // 将二进制数转化为数字
        int res = Integer.parseInt(s, 2);//第二个参数值得是之前的字符串是什么字符串，最终都将会转化为十进制数；
        return res;
    }
}
