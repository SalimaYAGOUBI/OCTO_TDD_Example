import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListAvergeCalculatorTest {

    @Test
    public void shouldReturn5WhenListContains537(){
        List<Integer> list = Arrays.asList(5,3,7);
        Double result = ListAvergeCalculator.avergeCalculor(list);
        Assert.assertEquals(Double.valueOf(5),result);
    }

}
