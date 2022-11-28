package 简单;

public class 最大连续1的个数 {
    public static void main(String[] args){
        int[] nums = {1,1,0,1,1,1};
        System.out.println(findMaxConsecutiveOnes_1(nums));
    }
    public static int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int temp = 0;
        for(int i = 0;i < nums.length;i++){
            if(nums[i]==1){
                temp++;
            }else{
                temp = 0;
            }
            if(temp>max){
                max = temp;
            }
        }
        return max;
    }
    public static int findMaxConsecutiveOnes_1(int[] nums){//这里提供一个比较巧妙的思路，加上当前数字，在乘以当前数字，实现遇上1就相加，遇上0就变为0；
        int max = 0;
        int temp = 0;
        for(int i = 0;i < nums.length;i++){
            temp = (temp +nums[i])*nums[i];
            if(temp>max){
                max = temp;
            }
        }
        return max;
    }
}
