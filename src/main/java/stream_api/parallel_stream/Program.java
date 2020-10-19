package stream_api.parallel_stream;

import java.util.Optional;
import java.util.stream.Stream;

public class Program {

    public static void main(String[] args) {

        Stream<Integer> numbersStream = Stream.of(1, 2, 3, 4, 5, 6);
        Optional<Integer> result = numbersStream.parallel().reduce((x, y) -> x * y);
        System.out.println(result.get());

        Stream<String> wordsStream = Stream.of("мама", "мыла", "раму");
        String sentence = wordsStream.parallel().reduce("Результат:", (x,y)->x + " " + y);
        System.out.println(sentence);

        Stream<String> wordsStream2  = Stream.of( "мама", "мыла", "раму", "hello world");
        String sentence2 = wordsStream2.parallel()
                .filter(s -> s.length() < 10)
                .sequential()
                .reduce("Результат:", (x,y) -> x + " " + y);
        System.out.println(sentence2);

        Stream<Integer> numbersStream2 = Stream.of(1, 2, 3, 4, 5, 6);
        Integer result2 = numbersStream2.parallel().reduce(2, (x, y) -> x*y);
        System.out.println(result2);
    }
}
