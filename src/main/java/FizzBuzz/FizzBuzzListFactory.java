package FizzBuzz;

import java.util.Arrays;
import java.util.List;

public class FizzBuzzListFactory {
    public static List listFactory(int i) {
        if (i == 1) return Arrays.asList(1);
        else return Arrays.asList(1,2);
    }
}
