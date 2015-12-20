import java.util.*;
public class reverseWordsInString{
    public static void main(String[] args){
        String s = "the sky is blue";
        String s2 = " 1";
        System.out.println(reverseWords(s2));
    }
    public static String reverseWords(String s){
        if(s == null || s.length() == 0){
            return "";
        }

        String[] array = s.split(" ");
        System.out.println(Arrays.toString(array));
        StringBuilder sb = new StringBuilder();
        for (int i = array.length - 1; i >= 0; i--){
            if(! array[i].equals("")){
                sb.append(array[i]);
                sb.append(" ");
            }
        }
        return sb.length() == 0 ? "" : sb.substring(0, sb.length() - 1);


    }
}
