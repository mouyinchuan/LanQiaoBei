package 简单;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 键盘行 {
    public static void main(String[] args){
        String[] words = {"Hello","Alaska","Dad","Peace"};
        System.out.println(Arrays.toString(findWords(words)));
    }
    public static String[] findWords(String[] words) {
        String str_1 = "qwertyuiopQWERTYUIOP";
        String str_2 = "asdfghjklASDFGHJKL";
        String str_3 = "zxcvbnmZXCVBNM";
        List<String> list = new ArrayList<>();
        for(int i = 0;i < words.length;i++){
            int count_1 = 0;
            int count_2 = 0;
            int count_3 = 0;
            for(int j = 0;j < words[i].length();j++){
                if(str_1.contains(words[i].charAt(j)+"")){
                    count_1++;
                }
                if (str_2.contains(words[i].charAt(j) + "")) {
                    count_2++;
                }
                if (str_3.contains(words[i].charAt(j) + "")) {
                    count_3++;
                }
            }
            if(count_1==words[i].length()||count_2==words[i].length()||count_3==words[i].length()){
                list.add(words[i]);
            }
        }
        return list.toArray(new String[list.size()]);
    }
}
