package 简单;

public class 检测大写字母 {
    public static void main(String[] args){
        String word = "FlaG";
        System.out.println(detectCapitalUse(word));
    }
    public static boolean detectCapitalUse(String word) {
        int upper = 0;
        int lower = 0;
        for(int i = 0;i < word.length();i++){
            if(Character.isUpperCase(word.charAt(i))){
                upper++;
            }else{
                lower++;
            }
        }
        if(upper==word.length()||lower==word.length()){
            return true;
        }
        return upper == 1 && Character.isUpperCase(word.charAt(0)) && lower == word.length() - 1;
    }
}
