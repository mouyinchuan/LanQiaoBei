package 简单;

import java.util.ArrayList;
import java.util.List;

public class 字符串相加 {
    public static void main(String[] args){
        String num1 = "11", num2 = "123";
        System.out.println(addStrings(num1,num2));
    }
//    public static String addStrings(String num1, String num2) {
//        List<String> list = new ArrayList<String>();//创建一个列表 因为题目中数字的长度太长了 因此直接相加是不可能的 所以只能模拟加法运算
//        //使用双指针模拟加法运算
//        int i = num1.length()-1;//从最后个位开始计算
//        int j = num2.length()-1;
//        int temp = 0;//防止两个数相加大于九
//        while(i >= 0&&j >=0){
//            int num_1 = Integer.valueOf(num1.charAt(i));
//            int num_2 = Integer.valueOf(num2.charAt(j));
//            int num = num_1+num_2+temp;
//            if(num>9){
//                temp = 1;//进一位
//            }else{
//                temp = 0;
//            }
//            String str = String.valueOf(num);//将其转化为字符串
//            list.add(str.charAt(str.length()-1)+"");//将末位数添加进列表
//            i--;
//            j--;
//        }
//        if(temp==1){
//
//        }
//        if(num1.length()>num2.length()){
//            list.add(num1.substring(0,i+1));
//        }else{
//            list.add(num2.substring(0,j+1));
//        }
//        return list
//    }
      public static String addStrings(String num1, String num2) {
        StringBuffer sb = new StringBuffer();
        int sum = 0;
        int i = num1.length()-1;
        int j = num2.length()-1;
        while(i >= 0||j >= 0|| sum != 0){//sum!=0,考虑了进位时会遇到的问题
            if(i >= 0) {
                sum += num1.charAt(i--)-'0';
            }
            if(j >= 0) {
                sum += num2.charAt(j--)-'0';
            }
            sb.append(sum%10);
            sum/=10;
        }
        return sb.reverse().toString();//StringBuffer里面字符串是堆加的 即像排队一样 往后叠加 所以要使用reverse()
      }
}
