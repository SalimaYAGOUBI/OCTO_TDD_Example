import FizzBuzz.FizzBuzzEngine;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class FizzBuzzEngineTest {

    @Test
    public void ShouldReturnListWithElement1WhenGiven1(){
        List expectedList = Arrays.asList(1);
        List actualList = FizzBuzzEngine.fizzBuzzGame(1);
        Assert.assertEquals(expectedList,actualList);
    }
}
