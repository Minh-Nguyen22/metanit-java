package stream_api.type_optional.if_present;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Optional;

public class Program {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.addAll(Arrays.asList(new Integer[]{1, 2, 3, 4, 5}));
        Optional<Integer> min = numbers.stream().min(Integer::compareTo);
        min.ifPresent(v -> System.out.println(v));

        ArrayList<Integer> numbers2 = new ArrayList<Integer>();
        Optional<Integer> min2 = numbers2.stream().min(Integer::compare);
        min2.ifPresentOrElse(
                v -> System.out.println(v),
                () -> System.out.println("Value not found")
        );
    }
}
