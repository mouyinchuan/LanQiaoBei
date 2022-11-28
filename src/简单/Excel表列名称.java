package 简单;

public class Excel表列名称 {
    public static void main(String[] args){
        int columnNumber = 701;
        System.out.println(convertToTitle(columnNumber));
    }
    public static String convertToTitle(int columnNumber) {
        if(columnNumber<0){
            return "";
        }
        StringBuffer sb = new StringBuffer();
        while(columnNumber>0){//这地方 A 对应的是 1 Z 对应的是26  如果将其数值减小1   就可转化为26进账
            columnNumber--;
            sb.append(((char)((columnNumber%26)+'A')));//观看余数 即末位数,添加的时候是从末位开始添加的
            columnNumber/=26;//每一次都去除掉末位的数
        }
        return sb.reverse().toString();//将其转化为字符串；
    }
}
