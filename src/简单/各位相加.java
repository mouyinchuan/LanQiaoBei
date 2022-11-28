package 简单;

public class 各位相加 {
    public static void main(String[] args){
        int num = 38;
        System.out.println(addDigits(num));
    }
    public static int addDigits(int num) {
        while(num>9){
            int temp = 0;
            while(num > 0){
                temp+=num%10;
                num = num/10;
            }
            num = temp;
        }
        return num;
    }
}
