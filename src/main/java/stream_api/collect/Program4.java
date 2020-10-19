package stream_api.collect;

import java.util.ArrayList;
import java.util.stream.Stream;

public class Program4 {

    public static void main(String[] args) {

        Stream<String> phones = Stream.of("iPhone 8", "HTC U12", "Huawei Nexus 6P",
                "Samsung Galaxy S9", "LG G6", "Xiaomi MI6", "ASUS Zenfone 2",
                "Sony Xperia Z5", "Meizu Pro 6", "Lenovo S850");

        ArrayList<String> filteredPhones = phones.filter(s -> s.length() < 12)
                .collect(
                        () -> new ArrayList<String>(),
                        (list, item) -> list.add(item),
                        (list1, list2) -> list1.addAll(list2)
                );

        filteredPhones.forEach(s -> System.out.println(s));
    }
}
