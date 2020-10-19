package stream_api.parallel_operations_with_arrays;

import java.util.Arrays;

public class Program3 {

    public static void main(String[] args) {

        Phone3[] phones = new Phone3[]{new Phone3("iPhone 8", 54000),
                new Phone3("Pixel 2", 45000),
                new Phone3("Samsung Galaxy S9", 40000),
                new Phone3("Nokia 9", 32000)};

        Arrays.parallelSort(phones, new Phone3Comparator());

        for (Phone3 p : phones) {

            System.out.println(p.getName());
        }
    }
}
