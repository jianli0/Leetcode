import java.util.*;
public class test1{
    public static void main(String[] args){
        List<int []> a = new ArrayList<int[]>();
        int[] a1 = new int[]{1,2};
        a.add(a1);
        a.add(new int[]{1,2});
        a.add(new int[]{3,4});
        for(int i = 0; i < a.size(); i++){
            System.out.println(Arrays.toString(a.get(i)));
        }
    }
}
