import java.util.Arrays;

public class missingNumber{
    public static void main(String[] args){
        int[] test1 = new int[]{1,2,3};
        int[] test2 = new int[]{0,2,3};

        System.out.println(missingNumber(null));
        System.out.println(missingNumber(test1));
        System.out.println(missingNumber(test2));
    }
    public static int missingNumber(int[] nums) {
        if (nums == null){
            return 0;
        }
        int len = nums.length;

        Arrays.sort(nums);

        for(int i = 1; i < len; i++) {
            if ((nums[i] - nums[i - 1]) == 1){
                continue;
            }else{
                return nums[i] - 1;
            }
        }

        return 1;
    }
}
