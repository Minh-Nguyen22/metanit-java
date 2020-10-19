package stream_api.concat;

import java.util.stream.Stream;

public class Program {

    public static void main(String[] args) {

        Stream<String> people1 = Stream.of("Alex", "Nick", "Yaroslav", "Ulya", "Tanya", "Anna");
        Stream<String> people2 = Stream.of("Michael", "Igor", "Name", "Hidan");

        Stream.concat(people1, people2).forEach(System.out::println);
    }
}
