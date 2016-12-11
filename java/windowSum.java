import java.util.*;

public class windowSum{
    public static void main(String[] args){
        int t1 = 2;
        ArrayList<Integer> test = new ArrayList<Integer>();
        test.add(1);
        test.add(2);
        test.add(3);
        test.add(4);
        test.add(5);

        ArrayList<Integer> testResult = windownSum(test, t1);
        System.out.println(Arrays.toString(testResult.toArray()));
    }

    public static ArrayList<Integer> windownSum(ArrayList<Integer> nums, int windowSize){
        ArrayList<Integer> res = new ArrayList<Integer>();
        if(nums == null || nums.size() == 0 || windowSize > nums.size()){
            return res;
        }

        int n = nums.size();
        for(int i = 0; i < n - windowSize + 1; i++){
            int total = 0;
            for(int j = 0; j < windowSize; j++){
                    total += nums.get(i + j);
            }
            res.add(total);
        }
        return res;
    }
}



