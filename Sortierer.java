import java.util.ArrayList;
import java.util.List;

public abstract class Sortierer {
    protected List<Integer> liste;
    private long startTime;
    private long endTime;

    public Sortierer(List<Integer> liste) {
        // Kopie der Liste erstellen [cite: 13, 14]
        this.liste = new ArrayList<>(liste);
    }

    // Öffentliche Methode zur Messung [cite: 17, 18]
    public List<Integer> sortiere() {
        startTime = System.currentTimeMillis(); // [cite: 20]
        liste = sortiere(liste);
        endTime = System.currentTimeMillis();   // [cite: 21]
        return liste;
    }

    // Abstrakte Methode für die Implementierung [cite: 15, 16]
    protected abstract List<Integer> sortiere(List<Integer> l);

    public long getOperations() {
        return endTime - startTime; // [cite: 22]
    }
}