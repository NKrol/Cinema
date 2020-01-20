package model;

import java.util.ArrayList;

public class Cinema {
    private ArrayList<Seance> seances = new ArrayList<>();
    private int seancesNumber;

    public Seance[] getSeances(){
        Seance[] result = new Seance[seancesNumber];
        for (int i = 0; i < seancesNumber; i++) {
            result[i] = seances.get(i);
        }
        return result;
    }

    public void addSeances(Seance seance){
        seances.add(seance);
        seancesNumber++;
    }

    public boolean removeSeances(Seance seance){
        final int notFound = -1;
        int found = notFound;
        int i = 0;
        while (i < seancesNumber && found == notFound){
            if (seance.equals(seances.get(i))){
                found = i;
            }else {
                i++;
            }
        }
        if (found != notFound){
            seances.remove(found);
            seancesNumber--;
        }

        return found != notFound;
    }

}
