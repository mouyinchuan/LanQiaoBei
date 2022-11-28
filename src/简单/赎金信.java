package 简单;

public class 赎金信 {
    public static void main(String[] args){
        String ransomNote = "aa", magazine = "aab";
        System.out.println(canConstruct(ransomNote,magazine));
    }
    public static boolean canConstruct(String ransomNote, String magazine) {
        int[] count_1 = new int[26];
        int[] count_2 = new int[26];
        for(int i = 0; i < ransomNote.length();i++){
            count_1[ransomNote.charAt(i)-'a']++;
        }
        for(int j = 0; j < magazine.length();j++){
            count_2[magazine.charAt(j)-'a']++;
        }
        for(int k = 0;k < 26;k++){
            if(count_2[k]<count_1[k]){
                return false;
            }
        }
        return true;
    }
}
