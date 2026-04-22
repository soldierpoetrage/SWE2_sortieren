import java.util.ArrayList;
import java.util.List;

public abstract class Sortierer {
    protected List<Integer> liste;
    private long startTime;
    private long endTime;

    public Sortierer(List<Integer> liste) {
        // Kopie der Liste erstellen 
        this.liste = new ArrayList<>(liste);
    }

    // Öffentliche Methode zur Messung 
    public List<Integer> sortiere() {
        startTime = System.currentTimeMillis(); // 
        liste = sortiere(liste);
        endTime = System.currentTimeMillis();   // 
        return liste;
    }

    // Abstrakte Methode für die Implementierung 
    protected abstract List<Integer> sortiere(List<Integer> l);

    public long getOperations() {
        return endTime - startTime; // 
    }
}