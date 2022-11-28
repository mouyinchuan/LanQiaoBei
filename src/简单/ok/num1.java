package 简单.ok;

public class num1 {
    public static void main(String[] args){
        for(int i= 2023;i< 9999999;i++){
            String str = Integer.toBinaryString(i);
            System.out.println(str);
            if(str.charAt(str.length()-1)=='0'){
                if(str.charAt(str.length()-2)=='0'){
                    if(str.charAt(str.length()-3)=='0'){
                        if(str.charAt(str.length()-4)=='0'){
                            if(str.charAt(str.length()-5)=='0'){
                                if(str.charAt(str.length()-6)=='0'){
                                    System.out.println(i);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
