public class findTheDuplicateNumber{
    public static void main(String[] args){
        int[] test1 = new int[]{1,1,2,3,4};
        int[] test2 = new int[]{1,1};
        System.out.println(findDuplicate(test1));
        System.out.println(findDuplicate(test2));
        System.out.println(findDuplicate(null));

    }
    public static int findDuplicate(int nums[]){
        if (nums == null){
            return 0;
        }

        int len = nums.length;
        int start = 1;
        int end = len - 1;

        while (start + 1 < end){
            int mid = (start + end) / 2;
            int count = smallerThanMid(mid,nums);
            if(count > mid){
                end = mid;
            }else{
                start = mid;
            }
        }

        if(smallerThanMid(start,nums) > 1){
            return start;
        }else{
            return end;
        }

    }
    public static int smallerThanMid(int mid, int[] nums){
        int len = nums.length;
        int count = 0;
        for(int i = 0; i < len; i++){
            if (nums[i] <= mid){
            count += 1;
            }
        }
        return count;

    }

    /*
     * public static int findDuplicate(int[] nums){
        if (nums == null){
            return 0;
        }

        int len = nums.length;
        int indexSum = 0;
        int sum = 0;

        for(int i = 0; i < len; i++){
            indexSum += i;
            sum += nums[i];
        }

        return (sum - indexSum);
    }
    *
    */

}
