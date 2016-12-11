public class searchInRotatedSortedArray{
    public static void main(String[] args){
        int[] test = new int[]{3, 5, 1};
        searchInRotatedSortedArray a = new searchInRotatedSortedArray();
        System.out.println(a.search(test, 1));
    }

    public int search(int[] nums, int target) {
        if(nums == null || nums.length == 0){
            return -1;
        }
        int start = 0;
        int end = nums.length - 1;
        int mid;
        while(start + 1 < end){
            mid = (start + end) / 2;
            if(nums[mid] == target){
                return mid;
            }
            if(nums[start] <= nums[mid]){
                if(nums[start]<= target && target <= nums[mid]){
                    end = mid;
                }else{
                    start = mid;
                }
            }else{
                if(target >= nums[mid] && target <= nums[end]){
                    start = mid;
                }else{
                    end = mid;
                }
            }
        }
        if(nums[start] == target){
            return start;
        }
        if(nums[end] == target){
            return end;
        }
        return -1;
    }

}
