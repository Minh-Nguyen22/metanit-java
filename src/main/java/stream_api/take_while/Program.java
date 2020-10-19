package stream_api.take_while;

import java.util.stream.Stream;

public class Program {

    public static void main(String[] args) {

        Stream<Integer> numbers = Stream.of(-3, -2, -1, -3, 0, 1, 2, 3, -4, -5);
        numbers.sorted().takeWhile(s -> s < 0).forEach(System.out::println);
    }
}
