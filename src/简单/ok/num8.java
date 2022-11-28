package 简单.ok;

public class num8 {
    public static void main(String[] args){
        String str= "lanqiao";
        String temp = str;
        String s = "";
        if(isHuiWenString(str)){
            System.out.println(str);
        }
        for(int i = 0;i < str.length();i++){
            s = str.charAt(i)+s;
            str = temp + s;//进行尾部扩充;
            if(isHuiWenString(str)){
                System.out.println(str);
                break;
            }
            str = temp;
        }
    }
    public static boolean isHuiWenString(String str){//判断是否为回文字符串
        for(int i = 0,j = str.length()-1;i < str.length()/2;i++,j--){
            if(str.charAt(i)!=str.charAt(j)){
                return false;
            }
        }
        return true;
    }
}
