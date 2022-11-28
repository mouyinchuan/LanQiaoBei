package 简单.ok;

public class num9 {
    public static void main(String[] args){
        char[][] s = {{'L','A','A','A','L','A'},{'A','L','Q','L','Q','A'},{'A','A','L','Q','A','A'},{'A','L','Q','L','Q','A'},{'L','A','A','A','L','A'}};

    }
    public static boolean isOk(char[][] s,int r,int c,int l){//判断中心点那个位置是否有x型图形
        for(int i = 1;i <= l;i++){
            if(s[r-1-i][c-1-i]!=s[r-1][c-1]){
                return false;
            }
            if(s[r-1-i][c-1+i]!=s[r-1][c-1]){
                return false;
            }
            if(s[r-1+i][c-1-i]!=s[r-1][c-1]){
                return false;
            }
            if(s[r-1+i][c-1+i]!=s[r-1][c-1]){
                return false;
            }
        }
        return true;
    }

}
