package 简单;

public class 密钥格式化 {
    public static  void main(String[] args){
        String S = "5F3Z-2e-9-w";
        int k = 4;
        System.out.println(licenseKeyFormatting(S,k));
    }
    public static  String licenseKeyFormatting(String S, int k) {
        StringBuffer sb = new StringBuffer();
        sb = new StringBuffer(S.replace("-","").toUpperCase());
        for(int i = sb.length()-k;i>0;i-=k){//因为不可以在第一个位置插入0，所以i!=0
            sb.insert(i,'-');
        }
        return sb.toString();//转化为字符串
    }
}