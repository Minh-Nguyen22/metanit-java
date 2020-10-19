package stream_api.mixing_operations.count;

import java.util.ArrayList;
import java.util.Arrays;


public class Program {

    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<String>();
        names.addAll(Arrays.asList(new String[]{"Tom", "Sam", "Bob", "Alice"}));
        System.out.println(names.stream().count());

        System.out.println(names.stream().filter(s -> s.length() <= 3).count());
    }
}
