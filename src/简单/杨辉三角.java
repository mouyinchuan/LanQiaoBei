package 简单;

import java.util.ArrayList;
import java.util.List;

public class 杨辉三角 {
    public static void main(String[] args){
        int numRows = 11;
        System.out.println(generate(numRows));
    }
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();//创建一个列表里面用来装每一行的数据
        ArrayList<Integer> row = new ArrayList<>();//装每一行的数据
        for(int i = 0;i < numRows;i++){
            row.add(0,1);//在第一个位置处添加1
            for(int j = 1;j < row.size()-1;j++){//这个地方j 取1 是精华
                row.set(j,row.get(j)+row.get(j+1));//因为在首位添加了1之后会往后平移
            }
            res.add(new ArrayList<>(row));
        }
        return res;
    }
}