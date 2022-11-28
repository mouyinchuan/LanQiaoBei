package 简单.ok;

public class num6 {
    public static void main(String[] args){
        int t = 2;
        int c = 7;
        int s = 128;//注意这个坑 就是需要注意精度
        float speed = (float)(c)/(float)(t);
        System.out.println(speed);
        float time = (s - c)/speed;
        if(time>(int)(time)){
            System.out.println((int)(time)+1);
        }else{
            System.out.println(time);
        }
    }
}
