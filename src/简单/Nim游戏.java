package 简单;

public class Nim游戏 {
    public static void main(String[] args){
        int n = 14;
        System.out.println(canWinNim(n));
    }
    public static boolean canWinNim(int n) {//这题是博弈论的题 当n 的值为四的整数倍时 最先出手的人永远会输
        //因为当你拿一个石头时别人可以拿3个石头
        //      拿两个石头时别人可以拿2个石头
        //      拿三个石头时别人可以拿1个石头
        //每一回合都是这样。所以最后一回合 肯定最后一科石头也是对手拿走的
        return n%4!=0;
    }
}
