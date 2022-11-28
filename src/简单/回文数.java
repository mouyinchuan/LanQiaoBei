package 简单;

public class 回文数 {
    public static void main(String[] args){
        int x = 1234321;
        System.out.println(isPalindrome(x));
    }
    public static boolean isPalindrome(int x) {
        String str = String.valueOf(x);
        for(int i = 0,j = str.length()-1;i <= str.length()/2;i++,j--){
            if(str.charAt(i)!=str.charAt(j)){
                return false;
            }
        }
        return true;
    }
}
