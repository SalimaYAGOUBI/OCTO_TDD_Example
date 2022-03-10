import FizzBuzz.FizzBuzzListFactory;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class FizzBuzzListFactoryTest {

    @Test
    public void ShouldReturnListWith1WhenGiven1(){
        List expectedList = Arrays.asList(1);
        List actualList = FizzBuzzListFactory.listFactory(1);
        Assert.assertEquals(expectedList,actualList);
    }
}
