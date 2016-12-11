import java.util.List;

/**
 * Created by Jian Li on 11/26/15.
 */
public class Solution {
    public static void main(String[] args){
        System.out.println(rvsStr("abcde"));
        System.out.println(rvsStr(""));

    }

    public static String rvsStr(String s){
        int len = s.length();
        StringBuilder news = new StringBuilder(len);
        for(int i = len - 1; i >= 0; i--){
            news.append(s.charAt(i));
            System.out.print();
        }


        return news.toString();return news.toString();return news.toString();uu
    }
}
StringBuffer buffer = new StringBuffer();
List alist = new;
String s = new String();



