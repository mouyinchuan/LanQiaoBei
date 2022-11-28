package 简单;

public class 丢失的数字 {
    public static void main(String[] args){
        int[] nums = {9,6,4,2,3,5,7,0,1};
        System.out.println(missingNumber_1(nums));
    }
    public static int missingNumber(int[] nums) {//就是先求出总值 然后再减去就可以
        int num = ((nums.length+1)*(nums.length))/2;
        System.out.println(num);
        for(int i = 0;i < nums.length;i++){
            num-=nums[i];
        }
        return num;
    }
    public static int missingNumber_1(int[] nums) {//使用异或运算解题、当一个值进行两次疑惑运算时 会变为0；简单来说就是抵消掉了,使用异或运算是很快的 效率比较高
        int num = nums.length;
        for(int i = 0;i < nums.length;i++){//因为最初的值我们就设定为数组的长度 所以这个地方我们就不添加等号了
            num^=nums[i];
            num^=i;
        }
        return num;
    }
}
