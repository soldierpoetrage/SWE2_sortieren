import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> zahlen = new ArrayList<>();
        for (int i = 0; i < 500; i++) {
            zahlen.add((int) (1900 + Math.random() * (2013 - 1900 + 1))); // 
        }

        System.out.println("Unsortierte Liste:");
        Ausgabe.liste(zahlen);

        // Insertion Sort Test
        Ausgabe.insertSort();
        insertSortierer is = new insertSortierer(zahlen);
        Ausgabe.liste(is.sortiere());
        Ausgabe.zeit(is.getOperations());

        // Quick Sort Test
        Ausgabe.quickSort();
        quickSortierer qs = new quickSortierer(zahlen);
        Ausgabe.liste(qs.sortiere());
        Ausgabe.zeit(qs.getOperations());

        // Merge Sort Test
        Ausgabe.mergeSort();
        mergeSortierer ms = new mergeSortierer(zahlen);
        Ausgabe.liste(ms.sortiere());
        Ausgabe.zeit(ms.getOperations());
    }
}