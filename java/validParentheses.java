import java.util.Stack;
import java.lang.*;

public class validParentheses{
    public static void main(String[] args){
        String test1 = "()" ;
        String test2 = "()[";
        String test3 = "";
        String test4 ="({[]})";
        System.out.println(isValid(test1));
        // System.out.println(isValid(test2));
        // System.out.println(isValid(test3));
        // System.out.println(isValid(test4));
    }

    public static boolean isValid(String s){
        if(s == null){
            return true;
        }

        Stack<Character> st = new Stack<Character>();
        st.push(s.charAt(0));

        for(int i = 1; i < s.length(); i++){
            if("([{".contains(String.valueOf(s.charAt(i)))){
                st.push(s.charAt(i));
            }else if(")]}".contains(String.valueOf(s.charAt(i)))){

                if (!st.isEmpty() && isPair(st.peek(), s.charAt(i))){
                    st.pop();
                }
                else{
                    System.out.println("return 1");
                    return false;
                }
            }
        }

        System.out.println("return 2");
        return st.isEmpty();

    }


    public static boolean isValid1(String s){
        Stack<Character> stk = new Stack<Character>();
        int len = s.length();

        if (len < 2){
            return false;
        }

        stk.push(s.charAt(0));

        for(int i = 1; i < len; i++){
            System.out.println(stk.toString());
            if (stk.isEmpty()){
                stk.push(s.charAt(i));
            }else{
                if (isPair(stk.peek(),s.charAt(i))){
                    stk.pop();
                }
                else{
                    stk.push(s.charAt(i));
                }
            }
        }

        if(stk.isEmpty()){
            return true;
        }else{
        return false;
        }
    }

    public static boolean isPair(char c1, char c2){
        return (c1 == '[' && c2 == ']') || (c1 == '{' && c2 == '}') || (c1 == '(' && c2 == ')');
    }



}

