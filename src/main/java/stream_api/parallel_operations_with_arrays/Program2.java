package stream_api.parallel_operations_with_arrays;

import java.util.Arrays;

public class Program2 {

    public static void main(String[] args) {

        Phone2[] phones = new Phone2[]{new Phone2("iPhone 8", 54000),
                new Phone2("Pixel 2", 45000),
                new Phone2("Samsung Galaxy S9", 40000),
                new Phone2("Nokia 9", 32000)};

        Arrays.parallelSetAll(phones, i -> {
            phones[i].setPrice(phones[i].getPrice()-10000);
        return phones[i];
        });

        for (Phone2 p : phones) {
            System.out.printf("%s - %d \n", p.getName(), p.getPrice());
        }
    }
}
