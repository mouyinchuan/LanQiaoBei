package 简单;

public class 快乐数 {
    public static void main(String[] args){
        int n = 19;
        System.out.println(isHappy(n));
    }
    public static boolean isHappy(int n) {
        int i = 0;
        int num = 0;
        while(i < 20){
            String str = String.valueOf(n);
            for(int j = 0;j < str.length();j++){
                num += (str.charAt(j)-'0')*(str.charAt(j)-'0');
            }
            if(num==1){
                return true;
            }
            n = num;
            num = 0;
            i++;
        }
        return false;
    }
}
