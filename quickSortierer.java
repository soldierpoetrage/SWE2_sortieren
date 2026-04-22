import java.util.ArrayList;
import java.util.List;

public class quickSortierer extends Sortierer {
    public quickSortierer(List<Integer> liste) { super(liste); }

    @Override
    protected List<Integer> sortiere(List<Integer> l) {
        if (l.size() <= 1) return l; // [cite: 61]

        int pivot = l.remove(0); // [cite: 62]
        List<Integer> ersteListe = new ArrayList<>();
        List<Integer> zweiteListe = new ArrayList<>();

        for (int i : l) {
            if (i <= pivot) ersteListe.add(i);
            else zweiteListe.add(i);
        }

        List<Integer> sorted = new ArrayList<>(sortiere(ersteListe));
        sorted.add(pivot);
        sorted.addAll(sortiere(zweiteListe));
        return sorted;
    }
}