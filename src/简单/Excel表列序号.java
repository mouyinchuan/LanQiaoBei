package 简单;

public class Excel表列序号 {
    public static void main(String[] args){
        String columnTitle = "ZY";
        System.out.println(titleToNumber(columnTitle));
    }
    public static int titleToNumber(String columnTitle) {//直接采用逆向思维，还是同样的思路，看成26进制数
        int sum = 0;
        int j = 0;
        for(int i = columnTitle.length()-1;i >= 0;i--){
            sum+=Math.pow(26,j)*(Integer.valueOf((columnTitle.charAt(i))-Integer.valueOf('A'))+1);
            j++;
        }
        return sum;
    }
}
