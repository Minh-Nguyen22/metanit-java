package stream_api.parallel_operations_with_arrays;

import java.util.Arrays;

public class Program {

    public static void main(String[] args) {

        int[] numbers = initializeArray(6);
        System.out.println("--------");
        for (int i : numbers)
            System.out.println(i);

        int[] nums = {30, -4, 5, 29, 7, -8};
        Arrays.parallelSort(nums);
        for (int i: nums) {
            System.out.println(i);
        }

        System.out.println("--------------------");

        for (int i = 0; i < nums.length; i++) {
            int a = i;
            i = nums[i];
            System.out.println(i);
            i = a;
        }

        System.out.println("----------------------");

        int[] numbers2 = {1, 2, 3, 4, 5, 6};
        Arrays.parallelPrefix(numbers2,(x, y) -> x*y);

        for (int i : numbers2) {
            System.out.println(i);
        }
    }

    public static  int[] initializeArray(int size) {
        int[] values = new int[size];
        Arrays.parallelSetAll(values, i -> i*10);
        return values;
    }
}
