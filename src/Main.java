import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        ArrayList<Integer> filterIntList = new ArrayList(intList.size());
        for (int x : intList) if (x > 0 & x % 2 == 0) filterIntList.add(x);
        filterIntList.sort(Comparator.naturalOrder());

        filterIntList.forEach(System.out::println);
    }
}
