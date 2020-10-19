package stream_api.sort;

import java.util.Comparator;

public class PhoneComparator implements Comparator<Phone> {

    public int compare(Phone a, Phone b){
        return a.getName().toUpperCase().compareTo(b.getName().toUpperCase());
    }

    @Override
    public Comparator<Phone> reversed() {
        return null;
    }
}
