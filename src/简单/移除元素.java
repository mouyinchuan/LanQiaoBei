package 简单;

import java.util.Arrays;

public class 移除元素 {
    public static void main(String[] args){
        int[] nums = {0,1,2,2,3,0,4,2};
        int val = 3;
        System.out.println(removeElement(nums,val));
    }
    public static int removeElement(int[] nums, int val) {
        //Arrays.sort(nums);//由于题目说元素的位置可以变所以，进行排序 这样运算速度会快一些
        //同样使用双指针进行解题
        int i = 0;
        int temp = 0;//实质上是用来计数地 和下面的思路2 差不多 但是思路二更容易理解
        while(i < nums.length){
            if(nums[i]==val){
                temp++;
                i++;
            }else{
                nums[i-temp] = nums[i];//数据元素进行平移
                i++;
            }
        }
        System.out.println(Arrays.toString(nums));
        return nums.length-temp;
    }
    public static int removeElement_1(int[] nums, int val) {//双指针思路2 个人觉得这种思路比较优秀
        int i = 0;
        int index = 0;
        while(i < nums.length&&index < nums.length){
            if(nums[index]!=val){
                nums[i] = nums[index];
                index++;
                i++;
            }else{
                index++;
            }
        }
        System.out.println(Arrays.toString(nums));
        return i;
    }
}
