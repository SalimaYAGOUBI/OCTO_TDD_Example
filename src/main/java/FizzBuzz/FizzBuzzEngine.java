package FizzBuzz;

import java.util.Arrays;
import java.util.List;

public class FizzBuzzEngine {
    public static List fizzBuzzGame(int i) {
        return FizzBuzzListFactory.listFactory(i);
    }
}
