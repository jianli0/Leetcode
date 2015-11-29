import java.lang.Math;

public class maximumSubarray{
    public static void main(String[] args){
        int [] test = new int[]{-2,2,-3,4,-1,2,1,-5,3};
        System.out.println(maxSubArray(null));
        System.out.println(maxSubArray(test));
    }
    public static int maxSubArray(int[] nums){
        if (nums == null){
            return 0;
        }
        int localMax = nums[0];
        int globalMax = nums[0];
        int sum = 0;

        for(int i = 1; i <  nums.length; i++){
            sum += nums[i];
            // local Max in index i,must contain nums[i]
            localMax = Math.max(nums[i], localMax + nums[i]);
            globalMax = Math.max(localMax,globalMax);
        }
        return globalMax;

    }
}
