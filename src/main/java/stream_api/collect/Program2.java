package stream_api.collect;

import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Program2 {

    public static void main(String[] args) {

        Stream<Phone2> phone2Stream = Stream.of(new Phone2("iPhone 8", 54000),
                new Phone2("Nokia 9", 45000),
                new Phone2("Samsung Galaxy S9", 40000),
                new Phone2("LG G6", 32000));

        Map<String, Integer> phones = phone2Stream
            .collect(Collectors.toMap(p -> p.getName(), t -> t.getPrice()));

        phones.forEach((k,v) -> System.out.println(k + " " + v));
    }
}
