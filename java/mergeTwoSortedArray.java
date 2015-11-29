import java.util.Arrays;

public class mergeTwoSortedArray{
    public static void main(String args[]){
        int [] num1 = new int[]{1, 3, 5, 9, 0, 0, 0, 0, 0};
        int [] num2 = new int[]{2, 4, 5, 7, 9};
        System.out.println(Arrays.toString(merge(num1, 4, num2, 5)));
    }

    public static int[] merge(int[] nums1, int m, int[] nums2, int n) {
        int index1 = m - 1;
        int index2 = n - 1;
        int index = m + n - 1;

        while(index1 >= 0 && index2 >= 0){
            if (nums1[index1] > nums2[index2]){
                nums1[index--] = nums1[index1--];
            }else{
                nums1[index--] = nums2[index2--];
            }
        }
        if(index1 > 0){
            while(index1 >= 0){
                nums1[index--] = nums1[index1--];
            }
        }else{
            while(index2 >= 0){
                nums1[index--] = nums2[index2--];
            }
        }
        return nums1;

    }
}
