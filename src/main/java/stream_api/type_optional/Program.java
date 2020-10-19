package stream_api.type_optional;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.Optional;

public class Program {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(new Integer[]{1,2,3,4,5,6,7,8,9}));
        Optional<Integer> min =numbers.stream().min(Integer::compareTo);
        System.out.println(min.get());

        ArrayList<Integer> numbers2 = new ArrayList<Integer>();
        Optional<Integer> min2 = numbers2.stream().min(Integer::compare);
        try {
            System.out.println(min2.get());
        }
        catch (NoSuchElementException e){
            System.out.println("Ошибочка");
        }

        ArrayList<Integer> numbers3 = new ArrayList<>();
        numbers3.addAll(Arrays.asList(new Integer[]{1,2,3,4,5,6,7,8,9}));
        Optional<Integer> min3 = numbers3.stream().min(Integer::compare);
        if(min.isPresent()){

            System.out.println(min.get());
        }
    }
}
