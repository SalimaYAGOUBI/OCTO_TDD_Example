import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.IntStream;

public class ListAvergeCalculator {


    public static Double avergeCalculor(List<Integer> list) {
        OptionalDouble average = list.stream().mapToInt(Integer::intValue).average();
        return average.getAsDouble();
    }
}
