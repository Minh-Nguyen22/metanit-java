package stream_api.creating_stream_api;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class Program {

    public static void main(String[] args) {

        ArrayList<String> cities = new ArrayList<String>();
        Collections.addAll(cities, "Paris", "London", "Madrid", "Kharkov");
        cities.stream()
                .filter(s -> s.length() != 6)
                .forEach(s -> System.out.println(s));

        Stream<String> citiesStream =Stream.of("Париж", "Лондон", "Мадрид");
        citiesStream.forEach(s->System.out.println(s));

// можно передать массив
        String[] cities2 = {"Париж", "Лондон", "Мадрид"};
        Stream<String> citiesStream2 =Stream.of(cities2);

        IntStream intStream = IntStream.of(1,2,4,5,7);
        intStream.forEach(i->System.out.println(i));

        LongStream longStream = LongStream.of(100,250,400,5843787,237);
        longStream.forEach(l->System.out.println(l));

        DoubleStream doubleStream = DoubleStream.of(3.4, 6.7, 9.5, 8.2345, 121);
        doubleStream.forEach(d->System.out.println(d));
    }
}
