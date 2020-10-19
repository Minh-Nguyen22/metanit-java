package stream_api.mixing_operations.min_max;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Optional;

public class Program {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.addAll(Arrays.asList(new Integer[]{1,2,3,4,5,6,7,8,9}));

        Optional<Integer> min = numbers.stream().min(Integer::compareTo);
        Optional<Integer> max = numbers.stream().max(Integer::compareTo);

        System.out.println(min.get());
        System.out.println(max.get());
    }
}
