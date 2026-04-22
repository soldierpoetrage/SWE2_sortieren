import java.util.List;

public class Ausgabe {
    public static void liste(List<Integer> l) {
        for (int i = 0; i < l.size(); i++) {
            System.out.print(l.get(i) + " ");
            if ((i + 1) % 30 == 0) System.out.println(); // 30 Elemente pro Zeile 
        System.out.println(); // Leerzeile 
    }

    public static void insertSort() { System.out.println("Sortiert mit InsertSort."); }
    public static void quickSort() { System.out.println("Sortiert mit Quicksort."); }
    public static void mergeSort() { System.out.println("Sortiert mit Mergesort."); }

    public static void zeit(long ms) {
        System.out.println("Benötigte Rechenzeit: " + (ms / 1000.0) + "s"); // 
    }
}