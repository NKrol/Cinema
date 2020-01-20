package model.comparator;

import model.Seance;

import java.util.Comparator;

public class NumberOfSeatsComparator implements Comparator<Seance> {

    @Override
    public int compare(Seance s1, Seance s2) {
        if (s1 == null && s2 == null) return 0;
        if (s1 == null) return 1;
        if (s2 == null) return -1;
        Integer i1 = s1.getNumbersOfSeats();
        Integer i2 = s2.getNumbersOfSeats();
        return -i1.compareTo(i2);
    }
}
