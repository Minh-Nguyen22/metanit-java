package stream_api.reduce;

import java.util.Optional;
import java.util.stream.Stream;

public class Program {

    public static void main(String[] args) {

        Stream<Integer> numbersStream = Stream.of(1, 2, 3, 4, 5, 6);
        Optional<Integer> result = numbersStream.reduce((x,y) -> x*y);
        System.out.println(result.get());

        Stream<String> wordsStream = Stream.of("мама", "мыла", "раму");
        Optional<String> sentence = wordsStream.reduce((x,y) -> x + " " + y);
        System.out.println(sentence.get());

        Stream<String> wordsStream2 = Stream.of("мама", "мыла", "раму");
        String result2 = "Result: ";
        String sentence2 = wordsStream2.reduce(result2,(x, y)->x + " " + y);
        System.out.println(sentence2);
    }
}
