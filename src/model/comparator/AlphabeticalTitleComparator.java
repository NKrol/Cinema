package model.comparator;

import model.Seance;

import java.util.Comparator;

public class AlphabeticalTitleComparator implements Comparator<Seance> {

    @Override
    public int compare(Seance s1, Seance s2) {
        if (s1 == null && s2 == null) return 0;
        else if (s1 == null) return 1;
        else if (s2 == null) return -1;
        return s1.getTitle().compareToIgnoreCase(s2.getTitle());
    }
}
