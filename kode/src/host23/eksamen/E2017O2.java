package host23.eksamen;

import java.util.*;

public class E2017O2 {

    public static <T> T maks(Iterable<T> s, Comparator<? super T> c) {
        Iterator<T> i = s.iterator();
        if (!i.hasNext()) throw new NoSuchElementException("s er tom!");

        T maks = i.next();

        while (i.hasNext()) {
            T verdi = i.next();
            if (c.compare(verdi, maks) > 0) maks = verdi;
        }

        return maks;
    }

    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>(Arrays.asList("apple", "banana", "orange", "kiwi"));
        String maxString = maks(stringList, Comparator.naturalOrder());
        System.out.println("Max string: " + maxString);

        List<Integer> intList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        Integer maxInt = maks(intList, Comparator.reverseOrder());
        System.out.println("Max integer: " + maxInt);
    }
}