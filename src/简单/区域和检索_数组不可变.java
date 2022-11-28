//package 简单;
//
//public class 区域和检索_数组不可变 {
//    public int[] sums;
//    public NumArray(int[] nums){
//        sums = new int[nums.length+1];
//        sums[0] = 0;//第一个数字是为了方便辅助计算
//        for(int i = 1;i <= nums.length;i++){
//            sums[i] = sums[i-1]+nums[i-1];
//        }
//    }
//    public static int sumRange(int left,int right){
//        return sums[right+1]-sums[left];
//    }      //今天不适合解题  所以 先等一会儿 解题  2022年11月3日  明天解题
//
//}
