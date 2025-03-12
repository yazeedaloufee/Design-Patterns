import java.util.Arrays;
import java.util.Comparator;

public class ComparatorExample {
    public static void main(String[] args) {
        String[] names = {"Alice", "Bob", "Charlie", "David"};

        // Strategy 1: Sort by natural order (alphabetical)
        Arrays.sort(names);
        System.out.println("Sorted by natural order: " + Arrays.toString(names));

        // Strategy 2: Sort by length of the string
        Arrays.sort(names, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return Integer.compare(s1.length(), s2.length());
            }
        });
        System.out.println("Sorted by length: " + Arrays.toString(names));
    }
}