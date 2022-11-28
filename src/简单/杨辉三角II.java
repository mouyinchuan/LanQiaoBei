package 简单;

import java.util.ArrayList;
import java.util.List;

public class 杨辉三角II {
    public static void main(String[] args){
        int rowIndex = 3;
        System.out.println(getRow(rowIndex));
    }
    public static List<Integer> getRow(int rowIndex) {
        List<Integer> row = new ArrayList<>();//List 里面什么都可以放
        for(int i = 0;i <= rowIndex;i++){
            row.add(0,1);
            for(int j = 1;j < row.size()-1;j++){
                row.set(j,row.get(j)+row.get(j+1));
            }
        }
        return row;
    }
}
