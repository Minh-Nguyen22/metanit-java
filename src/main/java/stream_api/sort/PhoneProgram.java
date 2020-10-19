package stream_api.sort;

import java.util.Comparator;
import java.util.stream.Stream;

public class PhoneProgram {

    public static void main(String[] args) {

        Stream<Phone> phoneStream = Stream.of(new Phone("iPhone X", "Apple", 600),
                new Phone("Pixel 2", "Google", 500),
                new Phone("iPhone 8", "Apple",450),
                new Phone("Nokia 9", "HMD Global",150),
                new Phone("Galaxy S9", "Samsung", 300));

        phoneStream.sorted(new PhoneComparator())
                .forEach(phone -> System.out.printf("%s (%s) - %d \n",
                        phone.getName(), phone.getCompany(), phone.getPrice()));
    }
}
