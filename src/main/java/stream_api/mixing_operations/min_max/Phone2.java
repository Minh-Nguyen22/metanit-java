package stream_api.mixing_operations.min_max;

public class Phone2 {

    private String name;
    private int price;

    public Phone2(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public static int compare (Phone2 p1, Phone2 p2){
        if (p1.getPrice() > p2.getPrice())
            return 1;
        return -1;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }
}
