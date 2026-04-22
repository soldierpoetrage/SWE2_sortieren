import java.util.Collections;
import java.util.List;

public class insertSortierer extends Sortierer {
    public insertSortierer(List<Integer> liste) { super(liste); }

    @Override
    protected List<Integer> sortiere(List<Integer> liste) {
        for (int i = 1; i < liste.size(); i++) {
            int j = i;
            while (j > 0 && liste.get(j) < liste.get(j - 1)) {
                Collections.swap(liste, j, j - 1); // Vertauschen [cite: 53]
                j--;
            }
        }
        return liste;
    }
}