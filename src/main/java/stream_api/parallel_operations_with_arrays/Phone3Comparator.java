package stream_api.parallel_operations_with_arrays;

import java.util.Comparator;

public class Phone3Comparator implements Comparator<Phone3> {

    @Override
    public int compare(Phone3 o1, Phone3 o2) {
        return o1.getName().toUpperCase().compareTo(o2.getName().toUpperCase());
    }
}
