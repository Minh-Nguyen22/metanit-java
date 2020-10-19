package stream_api.type_optional.or_else;

import java.util.ArrayList;
import java.util.Optional;
import java.util.Random;

public class Program {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<Integer>();
        Optional<Integer> min = numbers.stream().min(Integer::compareTo);
        Random random = new Random();
        System.out.println(min.orElseGet(() -> random.nextInt(1)));
    }
}
