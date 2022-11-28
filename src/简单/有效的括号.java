package 简单;

import java.util.Stack;

public class 有效的括号 {
    public static void main(String[] args){
        String s  = "()[]{}";
        System.out.println(isValid(s));
    }
    public static boolean isValid(String s) {//这道题应该用栈的思想解决
        Stack<Character> stack = new Stack<>();
        char[] str = s.toCharArray();
        for(int i = 0;i < str.length;i++){
             if(str[i]=='('){
                 stack.push(')');
             }else if(str[i]=='['){
                 stack.push(']');
             }else if(str[i]=='{'){
                 stack.push('}');
             }else if(stack.isEmpty()||stack.pop()!=str[i]){//这样就直接不用判断长度是否为偶数,如果遇到右括号的话直接弹出 与栈顶元素进行比较，相同就进行下一轮
                 return false;
             }
        }
        return stack.isEmpty();//栈为空就是满足条件的；
    }
}
