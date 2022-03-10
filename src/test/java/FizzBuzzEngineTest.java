import FizzBuzz.FizzBuzzEngine;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class FizzBuzzEngineTest {

    @Test
    public void ShouldReturnListWithElement1WhenGiven1() throws Exception {
        List expectedList = Arrays.asList(1);
        List actualList = FizzBuzzEngine.fizzBuzzGame(1);
        Assert.assertEquals(expectedList,actualList);
    }

    @Test
    public void ShouldReturnListWithElement12FizzWhenGiven3() throws Exception {
        List expectedList = Arrays.asList(1,2,"Fizz");
        List actualList = FizzBuzzEngine.fizzBuzzGame(3);
        Assert.assertEquals(expectedList,actualList);
    }

    @Test
    public void ShouldReturnListWithElement12Fizz4BuzzWhenGiven5() throws Exception {
        List expectedList = Arrays.asList(1,2,"Fizz",4,"Buzz");
        List actualList = FizzBuzzEngine.fizzBuzzGame(5);
        Assert.assertEquals(expectedList,actualList);
    }
}
