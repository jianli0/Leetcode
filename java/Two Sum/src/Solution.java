import java.util.Arrays;
import java.util.HashMap;

/**
 * Created by Jian Li on 15/11/23.
 */
public class Solution {
    public static void main(String [] args){
        int [] num1 = {2, 7, 11, 15};
        int target = 9;

        /*int [] res = twoSum(num1, target);
        for(int i = 0; i < 2; i++){
            System.out.println(res[i]);
        }*/

        System.out.println(Arrays.toString(twoSum(num1, target)));
    }

    public static int[] twoSum(int[] numbers, int target) {
        if(numbers == null || numbers.length < 2){
            return null;
        }
        HashMap<Integer,Integer> hs = new HashMap<Integer, Integer>();
        for(int i = 0; i < numbers.length; i++){
            hs.put(numbers[i], i + 1);
        }

        int[] a = new int[2];

        for(int i = 0; i < numbers.length; i++){
            if(hs.containsKey(target - numbers[i])){
                int index1 = i + 1;
                int index2 = hs.get(target - numbers[i]);
                if (index1 == index2){
                    continue;
                }
                a[0] = index1;
                a[1] = index2;
                return a;
            }

        }
        return a;
    }

}
