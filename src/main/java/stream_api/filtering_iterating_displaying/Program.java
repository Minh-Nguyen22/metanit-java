package stream_api.filtering_iterating_displaying;

import java.util.stream.Stream;

public class Program {

    public static void main(String[] args) {


        Stream<Phone> phoneStream = Stream.of(new Phone(54000, "Iphone 6s"),
                new Phone(45000, "Lumia 950"),
                new Phone(40000, "Samsung Galaxy S 6"));

        phoneStream
                .filter(s->s.getPrice()<50000)
                .forEach(phone -> System.out.println(phone.getName()));

        System.out.println("-------------------------------------------");

        Stream<Phone> phoneStreamMapping = Stream.of(new Phone(54000, "Iphone 6s"),
                new Phone(45000, "Lumia 950"),
                new Phone(40000, "Samsung Galaxy S 6"));

//        phoneStreamMapping
//                .map(phone -> phone.getName())
//                .forEach(System.out::println);

        phoneStreamMapping
                .map(p-> "название: " + p.getName() + " цена: " + p.getPrice())
                .forEach(s->System.out.println(s));

        System.out.println("-------------------------------------------");

        Stream<Phone> phoneStreamFlat = Stream.of(new Phone(54000, "Iphone 6s"),
                new Phone(45000, "Lumia 950"),
                new Phone(40000, "Samsung Galaxy S 6"));

        phoneStreamFlat
                .flatMap(p->Stream.of(
                        String.format("название: %s  цена без скидки: %d", p.getName(), p.getPrice()),
                        String.format("название: %s  цена со скидкой: %d", p.getName(), p.getPrice() - (int)(p.getPrice()*0.1))
                ))
                .forEach(s->System.out.println(s));
    }
}
