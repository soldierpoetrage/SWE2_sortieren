import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class mergeSortierer extends Sortierer {
    public mergeSortierer(List<Integer> liste) { super(liste); }

    @Override
    protected List<Integer> sortiere(List<Integer> l) {
        if (l.size() <= 1) return l;

        int mid = l.size() / 2;
        List<Integer> links = sortiere(new ArrayList<>(l.subList(0, mid))); // 
        List<Integer> rechts = sortiere(new ArrayList<>(l.subList(mid, l.size())));

        return combine(links, rechts);
    }

    private List<Integer> combine(List<Integer> a, List<Integer> b) {
        List<Integer> result = new ArrayList<>();
        ListIterator<Integer> itA = a.listIterator();
        ListIterator<Integer> itB = b.listIterator();

       
        while (itA.hasNext() && itB.hasNext()) {
            Integer valA = itA.next();
            Integer valB = itB.next();

            if (valA <= valB) {
                result.add(valA);
                itB.previous(); // Zurückgehen, da nur A verwendet 
            } else {
                result.add(valB);
                itA.previous();
            }
        }
        while (itA.hasNext()) result.add(itA.next());
        while (itB.hasNext()) result.add(itB.next());

        return result;
    }
}