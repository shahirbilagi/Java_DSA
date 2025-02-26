package String_Example;
import java.util.Arrays;
public class SortfruitsArray {
    public static void main(String[] args) {
        String[] fruitsArray = {"Apple", "Orange", "Banana", "Grape", "Cherry"};
        Arrays.sort(fruitsArray, (a, b) -> a.compareTo(b));
        System.out.println("Sorted fruits array: " + Arrays.toString(fruitsArray));
    }
}
