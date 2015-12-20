import java.util.*;

public class isPalindrome{
    public static void main(String[] args){
        System.out.println(isPalindrome("1a2"));
    }
    public static boolean isPalindrome(String s){
        if(s == null){
            return false;
        }

        String lowS = s.toLowerCase();
        ArrayList<Character> newS = new ArrayList<Character>();

        for(int i = 0; i < lowS.length(); i++){
            if (Character.isLetterOrDigit(lowS.charAt(i))){
                newS.add(lowS.charAt(i));
            }
        }

        int mid = newS.size()/2;
        System.out.println(mid);

        int len = newS.size();
        for(int i = 0; i < mid; i++){
            System.out.println(newS.get(i));
            System.out.println(newS.get(len - i - 1));

            if (newS.get(i) != newS.get(len - i - 1)){
                return false;
            }
        }
        return true;
    }
}
