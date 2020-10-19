package stream_api.reduce;

public class Phone2 {

    private int id;
    private String name;
    private int prise;

    public Phone2(String name, int prise) {
        this.name = name;
        this.prise = prise;
    }
    public int getPrise() {
        return prise;
    }

    public String getName() {
        return name;
    }
}
