package FizzBuzz;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FizzBuzzListFactory {
    public static List listFactory(int i) {
        return IntStream.range(1, i+1).boxed().collect(Collectors.toList());

    }
}
