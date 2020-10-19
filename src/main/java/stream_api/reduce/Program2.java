package stream_api.reduce;

import java.util.stream.Stream;

public class Program2 {

    public static void main(String[] args) {

        Stream<Phone2> phoneStream = Stream.of(new Phone2("iPhone 6 S", 54000),
                new Phone2("Lumia 950", 45000),
                new Phone2("Samsung Galaxy S 6", 40000),
                new Phone2("LG G 4", 32000));


        int sum = phoneStream.reduce(0,
                (x, y) -> {
                    if (y.getPrise() < 50000)
                        return x + y.getPrise();
                    else
                        return x + 0;
                },
                (x, y) -> x + y);

        System.out.println(sum);
    }
}
