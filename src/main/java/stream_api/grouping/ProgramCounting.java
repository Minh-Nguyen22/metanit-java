package stream_api.grouping;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ProgramCounting {

    public static void main(String[] args) {

        Stream<Phone> phoneStream = Stream.of(new Phone("iPhone X", "Apple", 600),
                new Phone("Pixel 2", "Google", 500),
                new Phone("iPhone 8", "Apple",450),
                new Phone("Galaxy S9", "Samsung", 440),
                new Phone("Galaxy S8", "Samsung", 340));

        Map<String, Integer> phonesByCompany = phoneStream.collect(
                Collectors.groupingBy(Phone::getCompany, Collectors.summingInt(Phone::getPrice)));

        for (Map.Entry<String, Integer> item : phonesByCompany.entrySet()) {

            System.out.println(item.getKey() + " - " + item.getValue());
        }
    }
}
