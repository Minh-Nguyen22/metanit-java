package stream_api.distinct;

import java.util.stream.Stream;

public class Program {

    public static void main(String[] args) {

        Stream<String> people = Stream.of("Tom", "Bob", "Sam", "Tom", "Alice", "Kate", "Sam");
        people.distinct().forEach(System.out::println);
    }
}
