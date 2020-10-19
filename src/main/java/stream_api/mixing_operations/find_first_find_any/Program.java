package stream_api.mixing_operations.find_first_find_any;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Optional;

public class Program {

    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<String>();
        names.addAll(Arrays.asList(new String[]{"Tom", "Sam", "Bob", "Alice"}));

        Optional<String> first = names.stream().findFirst();
        System.out.println(first.get());

        Optional<String> any = names.stream().findAny();
        System.out.println(any.get());
        int count = 0;
        while (any.get().equals(names.get(0))) {
            count++;
            System.out.println(any.get() + " " + count);

        }
    }
}
