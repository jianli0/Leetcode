import java.util.*;

public class subSets{
    public static void main(String[] args){
        int[] a = new int[]{1,2,3};
        List<List<Integer>> b = subsets(a);
        for (int i = 0; i < b.size(); i++){
            System.out.println(b.get(i).toString());
        }
    }
    public static List<List<Integer>> subsets(int[] nums){
        List<List<Integer>> result = new ArrayList<List<Integer>>();

        if(nums == null){
            return null;
        }
        List<Integer> list = new ArrayList<Integer>();
        Arrays.sort(nums);
        subsetsHelper(result, list, nums, 0);
        return result;
    }

    private static void subsetsHelper(List<List<Integer>> result, List<Integer> list, int [] nums, int pos){
        // System.out.println("hello world");
        // System.out.println(list.toString());
        result.add(new ArrayList<Integer>(list));
        // result.add(list);
        for(int i = pos; i < nums.length; i++){
            list.add(nums[i]);
            subsetsHelper(result, list, nums, i + 1);
            list.remove(list.size() - 1);
        }
    }
}
