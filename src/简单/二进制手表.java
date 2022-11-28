package 简单;

import java.util.ArrayList;
import java.util.List;

public class 二进制手表 {
    public static void main(String[] args){
        int turnedOn = 1;
        System.out.println(readBinaryWatch(turnedOn));
    }
    public static List<String> readBinaryWatch(int turnedOn) {
        List<String> list = new ArrayList<>();//蒂花之秀
        for(int i = 0;i < 12;i++){
            for(int j = 0;j < 60;j++){
                if(Integer.bitCount(i)+Integer.bitCount(j)==turnedOn){//统计二进制出现的次数 出现的次数就是表亮灯的数量
                    if(j < 10){
                        list.add(""+i+":0"+j);//按照题目的要求分数需要加上0
                    }else{
                        list.add(""+i+":"+j);
                    }
                }
            }
        }
        return list;
    }
}
