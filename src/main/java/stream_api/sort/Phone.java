package stream_api.sort;

import java.util.stream.Stream;

public class Phone {

    private String name;
    private String company;
    private int price;

    public Phone(String name, String company, int price) {
        this.name = name;
        this.company = company;
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public String getCompany() {
        return company;
    }

    public String getName() {
        return name;
    }
}
