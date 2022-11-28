package 简单.ok;

public class num3 {
    public static void main(String[] args){
        for(int i = 10;i < 8518;i++){
            String str = i +"";
            int num = Integer.parseInt(str,16);
            if(num%i==0){
                System.out.println(i);
            }
        }
    }
}
