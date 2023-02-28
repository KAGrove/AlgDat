package host23.eksamen;

import java.util.Arrays;
import java.util.Comparator;

public class E2015KonteLambda {


    public static void main(String[] args) {
        Comparator<String> c = (x, y) ->
        {
            if (x.length() < y.length()) return -1;
            else if (x.length() > y.length()) return 1;
            else return x.compareTo(y);
        };

        String[] strings = {"hello", "world", "java", "programming", "language"};
        Arrays.sort(strings, c);

        for (String str : strings) {
            System.out.println(str);
        }
    }
}
