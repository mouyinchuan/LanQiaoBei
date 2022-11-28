package 简单;

public class 提莫攻击 {
    public static void main(String[] args){
        int[] timeSeries = {1,4};
        int duration = 2;
        System.out.println(findPoisonedDuration(timeSeries,duration));
    }
    public static int findPoisonedDuration(int[] timeSeries, int duration) {
        int count = duration;
        if(timeSeries.length==1){
            return duration;
        }
        for(int i = 1;i < timeSeries.length;i++){
            if(timeSeries[i-1]+duration>timeSeries[i]){
                count -= timeSeries[i-1]+duration- timeSeries[i];//因为这里会导致重置问题，就会减小一部分时间
            }
            count += duration;
        }
        return count;
    }
}
