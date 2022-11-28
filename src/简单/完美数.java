package 简单;

public class 完美数 {
    public static void main(String[] args){
        int num = 28;
        System.out.println(checkPerfectNumber_1(num));
    }
    public static boolean checkPerfectNumber(int num) {//方法没有毛病就是复杂度太高了
        int sum = 1;
        for(int i = 1;i <= num/2;i++){
            for(int j = i;j <= num/2;j++){
                if(i*j==num){
                   if(i==j){
                       sum+=i;
                   }else{
                       sum = sum+i+j;
                   }
                }
            }
        }
        return sum == num;//完美

    }
    public static boolean checkPerfectNumber_1(int num) {
        int sum = 0;
        for(int i = 1;i <= num;i++){
            if(num%i==0){
                sum = sum + i +num/i;
            }
        }
        return sum/2-num==num;//除以二是因为算了两遍，减去num是因为需要除去本身
    }
}
