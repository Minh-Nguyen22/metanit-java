package stream_api.type_optional.or_else_throw;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Optional;

public class Program {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.addAll(Arrays.asList(new Integer[]{1, 2, 5, 5, -5}));
        Optional<Integer> min = numbers.stream().min(Integer::compareTo);
        System.out.println(min.orElseThrow(IllegalStateException::new));

        ArrayList<Integer> numbers2 = new ArrayList<Integer>();
        numbers2.addAll(Arrays.asList(new Integer[]{1, 2, 5, 5, -5}));
        Optional<Integer> min2 = numbers2.stream().min(Integer::compareTo);
        try {
            System.out.println(min2.get());
        }
        catch (IllegalStateException ex){
            System.out.println("Ошибочка");
        }
    }
}
