import java.util.Stack;
import java.lang.*;

public class test{
    public static void main(String[] args){
        String s = "hello world";
        Stack<Character> stk = new Stack<Character>();
        for (int i = 0; i < s.length(); i++){
            stk.push(s.charAt(i));
            System.out.println(stk.toString());
        }
    }
}
