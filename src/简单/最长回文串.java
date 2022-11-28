package 简单;


public class 最长回文串 {
    public static void main(String[] args){
        String s = "abccccdd";
        System.out.println(longestPalindrome(s));
    }
    public static int longestPalindrome(String s) {
        int[] count = new int[100];
        for(int i = 0;i < s.length();i++){
            count[s.charAt(i)-'A']++;//统计字符个数
        }
        int sum = 0;
        boolean flag = false;
        boolean tag = false;
        for(int j = 0;j < count.length;j++){
            if(count[j]==1){
                tag = true;
            }
            if(count[j]%2==0){
                sum+=count[j];
            }else if(count[j]>2){
                sum = sum + count[j]-1;
                flag = true;
            }
        }
        if(flag==true){
            return sum+1;
        }
        if(tag==true){
            return sum+1;
        }
        return sum;
    }
    public static int longestPalindrome_1(String s) {//开始秀骚操作了
        int[] count = new int[52+32];
        int sum = 0;
        for(int i = 0;i < s.length();i++){
            count[s.charAt(i)-'A']++;//统计字符个数
        }
        for(int j = 0;j < count.length;j++){//直接规避奇数和偶数的问题
            sum+=((count[j]/2)*2);
        }
        if(sum < s.length()){
            sum+=1;
        }
        return sum;
    }
}
