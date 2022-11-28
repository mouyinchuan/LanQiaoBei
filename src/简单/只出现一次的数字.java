package 简单;

public class 只出现一次的数字 {
    public static void main(String[] args){
       int[] nums = {4,1,2,1,2};
       System.out.println(singleNumber(nums));
    }
    public static int singleNumber(int[] nums) {//进行异或运算 相同的得0，直接异或运算就可以找出单独的那个数
        int num = nums[0];
        for(int i = 1;i < nums.length;i++){
            num^=nums[i];
        }
        return num;
    }
}
