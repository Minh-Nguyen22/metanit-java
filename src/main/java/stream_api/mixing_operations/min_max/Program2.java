package stream_api.mixing_operations.min_max;



import stream_api.sort.Phone;

import java.util.ArrayList;
import java.util.Arrays;

public class Program2 {

    public static void main(String[] args) {

        ArrayList<Phone2> phones = new ArrayList<Phone2>();
        phones.addAll(Arrays.asList(new Phone2[]{
                new Phone2("iPhone 8", 52000),
                new Phone2("Nokia 9", 35000),
                new Phone2("Samsung Galaxy S9", 48000),
                new Phone2("HTC U12", 36000)
        }));

        Phone2 min = phones.stream().min(Phone2::compare).get();
        Phone2 max = phones.stream().max(Phone2::compare).get();
        System.out.printf("MIN Name: %s Price: %d \n", min.getName(), min.getPrice());
        System.out.printf("MAX Name: %s Price: %d \n", max.getName(), max.getPrice());
    }
}
