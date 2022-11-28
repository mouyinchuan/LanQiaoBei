package 简单.ok;

public class num5 {
    public static void main(String[] args){
        int count = 0;
        int sum = 0;
        for(int i = 2;i < 2022;i++){
            if(isPrime(i)){
                System.out.println(i);
                if((sum+=i)>2022){
                    break;
                }
                count++;
            }
        }
        System.out.println(count);
    }
    public static boolean isPrime(int num){
        for(int i = 2;i < num;i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }
}
