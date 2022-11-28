package 简单;

import java.util.HashMap;
import java.util.Map;

public class 罗马数转整数 {
    public static void main(String[] args){
        String s = "MCMXCIV";
        System.out.println(romanToInt_1(s));
    }
    public static int romanToInt(String s) {//思路1 使用map进行映射，然后截取字符串
        Map<String,Integer> map = new HashMap<>();
        map.put("IV",4);
        map.put("IX",9);
        map.put("XL",40);
        map.put("XC",90);
        map.put("CD",400);
        map.put("CM",900);
        map.put("I",1);
        map.put("V",5);
        map.put("X",10);
        map.put("L",50);
        map.put("C",100);
        map.put("D",500);
        map.put("M",1000);
        int count = 0;
        for(int i = 0;i < s.length();i++){
            if(map.containsKey(s.substring(i,i+2))){//这个地方是一个坑需要加上2 不是加上一个1
                count+=map.get(s.substring(i,i+2));//解析substring 在这道题中不会越界的原因，因为他是左闭右开的 因此在最后的时候他是不计入计算的
                i++;
            }else{
                count+=map.get(s.substring(i,i+1));//注意这个地方要截取子字符串，substring是一个整体的单词没有边大写的
            }
        }
        return count;
    }
    public static int romanToInt_1(String s){//替换思想，直接将两个字符的替换成为一个字符的 然后循环遍历 使用replace
        s = s.replace("IV","a");
        s = s.replace("IX","b");
        s = s.replace("XL","c");
        s = s.replace("XC","d");
        s = s.replace("CD","e");
        s = s.replace("CM","f");
        int count = 0;
        for(int i = 0;i < s.length();i++){
            switch(s.charAt(i)){
                case 'I':
                    count+=1;
                    break;
                case 'V':
                    count+=5;
                    break;
                case 'X':
                    count+=10;
                    break;
                case 'L':
                    count+=50;
                    break;
                case 'C':
                    count+=100;
                    break;
                case 'D':
                    count+=500;
                    break;
                case 'M':
                    count+=1000;
                    break;
                case 'a':
                    count+=4;
                    break;
                case 'b':
                    count+=9;
                    break;
                case 'c':
                    count+=40;
                    break;
                case 'd':
                    count+=90;
                    break;
                case 'e':
                    count+=400;
                    break;
                case 'f':
                    count+=900;
                    break;
            }
        }
        return count;
    }
}
