import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CollectionsSortExample {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(1);
        numbers.add(3);
        numbers.add(2);

        // Strategy 1: Sort in natural order
        Collections.sort(numbers);
        System.out.println("Sorted in natural order: " + numbers);

        // Strategy 2: Sort in reverse order
        Collections.sort(numbers, Comparator.reverseOrder());
        System.out.println("Sorted in reverse order: " + numbers);
    }
}