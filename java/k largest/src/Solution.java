import java.util.Arrays;

/**
 * input :  array
 * output : k largest element of the array
 */

public class Solution {
    public  static void main(String [] args){
        int[] nums = {1, 23, 12, 9, 30, 2, 50};
        System.out.println((kLargest(nums,1)));
        System.out.println((kLargest(nums,2)));
        System.out.println((kLargest(nums,3)));
        System.out.println((kLargest(nums,4)));

    }

    //first sort and return k Largest
    public static int kLargest1(int[] numbers, int k){
        if (numbers == null || numbers.length < k){
            return Integer.parseInt(null);
        }

        Arrays.sort(numbers);
        return numbers[numbers.length - k];

    }

    // bubble sort k times
    public static int kLargest(int[] numbers, int k){
        if (numbers == null || numbers.length < k){
            return Integer.parseInt(null);
        }

        int len = numbers.length;
        for (int i = 0; i < k; i++){
            for(int j = 1; j < len - i; j++){
                if (numbers[j - 1] > numbers[j]){
                    int temp = numbers[j - 1];
                    numbers[j - 1] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }
        return numbers[numbers.length - k];
    }

}
